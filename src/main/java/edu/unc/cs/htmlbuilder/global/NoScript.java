package edu.unc.cs.htmlBuilder.global;

import java.util.ArrayList;
import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;

/**
 *
 * @author Andrew Vitkus
 */
public class NoScript implements INoScript {

    private final IAttributeManager attrs;
    private String className;
    private final ArrayList<IHTMLElement> elements;
    private String id;

    public NoScript() {
        attrs = new AttributeManager();
        elements = new ArrayList<>(3);
        className = "";
        id = "";
    }

    @Override
    public void addAttribute(String name, String value) {
        attrs.addAttribute(name, value);
    }

    @Override
    public void addElement(IHTMLElement element) {
        elements.add(element);
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
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public IHTMLElement[] getElements() {
        return elements.toArray(new IHTMLElement[elements.size()]);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public String getTagType() {
        return "noscript";
    }

    @Override
    public String getText(int indent) {
        StringBuilder text = new StringBuilder(100);
        text.append(Offsetter.indent(indent++)).append("<noscript");
        if (!className.isEmpty()) {
            text.append(" class=\"").append(className).append("\"");
        }
        if (!id.isEmpty()) {
            text.append(" id=\"").append(id).append("\"");
        }
        text.append(">\n");
        for (IHTMLElement element : elements) {
            text.append(element.getText(indent)).append("\n");
        }
        text.append(Offsetter.indent(indent - 1)).append("</noscript>");
        return text.toString();
    }

    @Override
    public void removeAttribute(String name) {
        attrs.removeAttribute(name);
    }
}
