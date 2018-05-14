package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.IStyleManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import edu.unc.cs.htmlBuilder.util.StyleManager;

/**
 * @author Andrew Vitkus
 *
 */
public class HorizontalRule extends AbstractBodyElement implements IHorizontalRule {

    private IAttributeManager attrs;
    private StyleManager styleManager;
    private String className;
    public String id;

    public HorizontalRule() {
        super(true, false);
        attrs = new AttributeManager();
        styleManager = new StyleManager();
        className = "";
        id = "";
    }

    @Override
    public String getText(int depth) {
        return Offsetter.indent(depth) + "<hr" + (className == "" ? "" : " class =\"" + className + "\"") + (id == "" ? "" : " id=\"" + id + "\"") + styleManager.getStyleHTML() + attrs.getHTML() + getEventManager().getHTML() + ">";
    }

    @Override
    public String getTagType() {
        return "horizontal rule";
    }

    @Override
    public void setColor(String color) {
        addStyle(IStyleManager.COLOR, color);
    }

    @Override
    public String getColor() {
        return styleManager.getStyle(IStyleManager.COLOR);
    }

    @Override
    public void addStyle(String name, String value) {
        styleManager.addStyle(name, value);
    }

    @Override
    public String[][] getStyles() {
        return styleManager.getStyles();
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
        return "hr";
    }
}
