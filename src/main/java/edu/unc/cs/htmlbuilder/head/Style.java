package edu.unc.cs.htmlBuilder.head;

import edu.unc.cs.htmlBuilder.css.ICSSFile;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;

/**
 * @author Andrew Vitkus
 *
 */
public class Style implements IStyle {

    private ICSSFile css;
    private IAttributeManager attrs;
    private String className;
    public String id;

    public Style() {
        css = null;
        attrs = new AttributeManager();
        className = "";
        id = "";
    }

    @Override
    public String getText(int depth) {
        StringBuilder html = new StringBuilder();
        html.append(Offsetter.indent(depth++)).append("<style");
        if (className != "") {
            html.append(" class=\"").append(className).append("\"");
        }
        if (id != "") {
            html.append(" id=\"").append(id).append("\"");
        }
        html.append(attrs.getHTML()).append(">\n");
        html.append(css.getCSS(depth)).append("\n");
        html.append(Offsetter.indent(depth - 1)).append("<style>");
        return html.toString();
    }

    @Override
    public String getTagType() {
        return "style";
    }

    @Override
    public void setCSS(ICSSFile file) {
        css = file;
    }

    @Override
    public ICSSFile getCSS() {
        return css;
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
}
