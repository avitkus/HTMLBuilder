package edu.unc.cs.htmlbuilder.body;

import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.event.IWindowEventHandler;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.EventManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.IEventManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Andrew Vitkus
 */
public abstract class AbstractBodyElement implements IBodyElement, IWindowEventHandler {
    
    private final IAttributeManager attrs;
    private final IEventManager events;
    private final ArrayList<IHTMLElement> children;
    private String className;
    private String id;
    
    private final boolean selfClosing;
    private final boolean hasChildren;

    public AbstractBodyElement(boolean selfClosing, boolean hasChildren) {
        attrs = new AttributeManager();
        events = new EventManager();
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
        html.append(events.getHTML());
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
    
    public void addEvent(String name, ScriptGenerator script) {
        events.addEvent(name, script);
    }
    
    public ScriptGenerator getEvent(String name) {
        return events.getEvent(name);
    }

    @Override
    public void setOnload(ScriptGenerator script) {
        addEvent("onload", script);
    }

    @Override
    public ScriptGenerator getOnload() {
        return getEvent("onload");
    }
    
    @Override
    public String getTagAbbr() {
        return "hr";
    }
}
