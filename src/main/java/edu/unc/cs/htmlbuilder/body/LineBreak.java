package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;

/**
 * @author Andrew Vitkus
 *
 */
public class LineBreak extends AbstractBodyElement implements ILineBreak {

    private IAttributeManager attrs;
    private String className;
    public String id;

    public LineBreak() {
        super(true, false);
        attrs = new AttributeManager();
        className = "";
        id = "";
    }

    @Override
    public String getText(int depth) {
        return Offsetter.indent(depth) + "<br" + (className == "" ? "" : " class =\"" + className + "\"") + (id == "" ? "" : " id=\"" + id + "\"") + attrs.getHTML() + getEventManager().getHTML() + ">";
    }

    @Override
    public String getTagType() {
        return "line break";
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
        return "br";
    }
}
