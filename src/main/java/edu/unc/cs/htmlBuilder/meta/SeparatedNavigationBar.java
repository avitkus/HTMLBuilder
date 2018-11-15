/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unc.cs.htmlBuilder.meta;

import java.util.ArrayList;
import java.util.Arrays;
import edu.unc.cs.htmlBuilder.attributes.LinkTarget;
import edu.unc.cs.htmlBuilder.body.AbstractBodyElement;
import edu.unc.cs.htmlBuilder.body.Hyperlink;
import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.body.IHyperlink;
import edu.unc.cs.htmlBuilder.body.Text;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.IStyleManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import edu.unc.cs.htmlBuilder.util.StyleManager;

public class SeparatedNavigationBar extends AbstractBodyElement implements INavigationBar {

    private final ArrayList<IHyperlink> contents;
    private final IStyleManager styleManager;
    private final IAttributeManager attrs;
    private String className;
    private String id;
    private String separator;

    public SeparatedNavigationBar(IHyperlink... elements) {
        super(false, true);
        contents = new ArrayList<>(5);
        styleManager = new StyleManager();
        attrs = new AttributeManager();
        className = "";
        id = "";

        contents.addAll(Arrays.asList(elements));
    }

    @Override
    public void addLink(String display, String dest) {
        addLink(display, dest, LinkTarget.PARENT);
    }

    @Override
    public void addLink(String display, String dest, LinkTarget target) {
        IHyperlink link = new Hyperlink();
        link.addContent(new Text(display));
        link.setURL(dest);
        link.setTarget(target);

        addLink(link);
    }

    @Override
    public void addLink(IHyperlink link) {
        contents.add(link);
    }

    @Override
    public IHyperlink[] getLinks() {
        return contents.toArray(new IHyperlink[contents.size()]);
    }

    @Override
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @Override
    public String getSeparator() {
        return separator;
    }

    @Override
    public String getText(int indent) {
        StringBuilder html = new StringBuilder(50);
        html.append(Offsetter.indent(indent++)).append("<div");
        if (!className.isEmpty()) {
            html.append(" class=\"").append(className).append("\"");
        }
        if (!id.isEmpty()) {
            html.append(" id=\"").append(id).append("\"");
        }
        html.append(styleManager.getStyleHTML());
        html.append(attrs.getHTML()).append(">\n");
        for (IBodyElement content : contents) {
            html.append(content.getText(indent)).append(separator).append("\n");
        }
        html.append(Offsetter.indent(indent - 1)).append("</div>");
        return html.toString();
    }

    @Override
    public String getTagType() {
        return "meta - separated navbar";
    }

    @Override
    public void addAttribute(String name, String value) {
        attrs.addAttribute(name, value);
    }

    @Override
    public void removeAttribute(String name) {
        attrs.removeAttribute(name);
    }

    @Override
    public String getAttribute(String name) {
        return attrs.getAttribute(name);
    }

    @Override
    public String[][] getAttributes() {
        return attrs.getAttributes();
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return id;
    }
    
    @Override
    public String getTagAbbr() {
        return "";
    }
}
