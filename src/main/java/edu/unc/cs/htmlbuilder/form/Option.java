package edu.unc.cs.htmlBuilder.form;

import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;

/**
 * @author Andrew Vitkus
 *
 */
public class Option implements IOption {

    private IAttributeManager attrs;
    private String text;
    private String className;
    public String id;

    public Option() {
        attrs = new AttributeManager();
        text = "";
        className = "";
        id = "";
    }

    @Override
    public String getText(int depth) {
        StringBuilder html = new StringBuilder();

        html.append(Offsetter.indent(depth)).append("<option");
        if (!className.isEmpty()) {
            html.append(" class=\"").append(className).append("\"");
        }
        if (!id.isEmpty()) {
            html.append(" id=\"").append(id).append("\"");
        }
        html.append(attrs.getHTML()).append(">").append(text).append("</option>");

        return html.toString();
    }

    @Override
    public String getTagType() {
        return "option";
    }

    @Override
    public void setDisabled(boolean disable) {
        if (disable) {
            attrs.addAttribute("disabled", null);
        } else {
            attrs.removeAttribute("disabled");
        }
    }

    @Override
    public boolean getDisabled() {
        return attrs.hasAttribute("diabled");
    }

    @Override
    public void setLabel(String label) {
        attrs.addAttribute("label", label);
    }

    @Override
    public String getLabel() {
        return attrs.getAttribute("label");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setSelected(boolean selected) {
        if (selected) {
            attrs.addAttribute("selected", null);
        } else {
            attrs.removeAttribute("selected");
        }
    }

    @Override
    public boolean getSelected() {
        return attrs.hasAttribute("selected");
    }

    @Override
    public void setValue(String value) {
        attrs.addAttribute("value", value);
    }

    @Override
    public String getValue() {
        return attrs.getAttribute("value");
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
        return "option";
    }
}
