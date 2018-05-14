package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.event.AbstractBodyElementEventHandler;
import edu.unc.cs.htmlBuilder.event.IMouseEventHandler;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import java.util.ArrayList;
import java.util.Arrays;
import edu.unc.cs.htmlBuilder.event.IObjectEventHandler;

/**
 *
 * @author Andrew Vitkus
 */
public abstract class AbstractBodyElement extends AbstractBodyElementEventHandler implements IBodyElement, IObjectEventHandler, IMouseEventHandler {
    
    private final IAttributeManager attrs;
    private final ArrayList<IHTMLElement> children;
    private String className;
    private String id;
    
    private final boolean selfClosing;
    private final boolean hasChildren;

    public AbstractBodyElement(boolean selfClosing, boolean hasChildren) {
        attrs = new AttributeManager();
        children = new ArrayList<>(5);
        className = "";
        id = "";
        
        this.selfClosing = selfClosing;
        this.hasChildren = hasChildren;
    }
    
    @Override
    public String getText(int depth) {
        StringBuilder html = new StringBuilder(50);
        String tagAbbr = getTagAbbr();

        html.append(Offsetter.indent(depth++)).append("<").append(tagAbbr);
        if (!className.isEmpty()) {
            html.append(" class=\"").append(className).append("\"");
        }
        if (!id.isEmpty()) {
            html.append(" id=\"").append(id).append("\"");
        }
        html.append(attrs.getHTML());
        html.append(getEventManager().getHTML());
        if (selfClosing) {
            html.append(" />");
        } else {
            html.append(">");
            if (hasChildren) {
                boolean first = true;
                for (IHTMLElement child : children) {
                    if (first || child.getTagType().equals("text")) {
                        html.append("\n");
                    }
                    html.append(child.getText(depth));
                }
            }
            html.append("\n").append(Offsetter.indent(depth - 1)).append("</").append(tagAbbr).append(">");
        }

        return html.toString();
    }
    
    public void addChild(IHTMLElement child, IHTMLElement... adtlChildren) {
        children.add(child);
        if (adtlChildren != null) {
            children.addAll(Arrays.asList(adtlChildren));
        }
    }
    
    public IHTMLElement[] getChildren() {
        return children.toArray(new IHTMLElement[children.size()]);
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
