package edu.unc.cs.htmlBuilder.list;

import edu.unc.cs.htmlBuilder.body.AbstractBodyElement;
import java.util.ArrayList;

import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.IStyleManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import edu.unc.cs.htmlBuilder.util.StyleManager;

/**
 * @author Andrew Vitkus
 *
 */
public class OrderedList extends AbstractBodyElement implements IOrderedList {

    private ArrayList<IListItem> items;
    private IAttributeManager attrs;
    private IStyleManager styleManager;
    private String className;
    public String id;

    public OrderedList(IListItem... items) {
        super(false, true);
        styleManager = new StyleManager();
        attrs = new AttributeManager();
        this.items = new ArrayList<>();
        className = "";
        id = "";
        for (IListItem item : items) {
            this.items.add(item);
        }
    }

    @Override
    public String getText(int indent) {
        StringBuilder text = new StringBuilder();
        text.append(Offsetter.indent(indent++)).append("<ol");
        if (className != "") {
            text.append(" class=\"").append(className).append("\"");
        }
        if (id != "") {
            text.append(" id=\"").append(id).append("\"");
        }
        text.append(styleManager.getStyleHTML()).append(attrs.getHTML()).append(">\n");
        for (IListItem item : items) {
            text.append(item.getText(indent)).append("\n");
        }
        text.append(Offsetter.indent(indent - 1)).append("</ol>");
        return text.toString();
    }

    @Override
    public String getTagType() {
        return "ordered list";
    }

    @Override
    public void addListItem(IListItem item) {
        items.add(item);
    }

    @Override
    public void addContents(IBodyElement element) {
        addListItem(new ListItem(element));
    }

    @Override
    public IListItem[] getListItems() {
        return items.toArray(new IListItem[items.size()]);
    }

    @Override
    public IListItem[] getContents() {
        return getListItems();
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
        return "ol";
    }
}
