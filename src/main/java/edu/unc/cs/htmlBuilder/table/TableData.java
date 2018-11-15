package edu.unc.cs.htmlBuilder.table;

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
public class TableData extends AbstractBodyElement implements ITableData {

    private ArrayList<IBodyElement> contents;
    private IStyleManager styleManager;
    private IAttributeManager attrs;
    private String className;
    private String id;

    public TableData(IBodyElement... elements) {
        super(false, true);
        styleManager = new StyleManager();
        attrs = new AttributeManager();
        contents = new ArrayList<>();
        className = "";
        id = "";
        for (IBodyElement element : elements) {
            contents.add(element);
        }
    }

    @Override
    public String getText(int indent) {
        StringBuilder text = new StringBuilder();
        text.append(Offsetter.indent(indent++)).append("<td");
        if (className != "") {
            text.append(" class=\"").append(className).append("\"");
        }
        if (id != "") {
            text.append(" id=\"").append(id).append("\"");
        }
        text.append(attrs.getHTML());
        text.append(styleManager.getStyleHTML()).append(">\n");
        for (IBodyElement row : contents) {
            text.append(row.getText(indent)).append("\n");
        }
        text.append(Offsetter.indent(indent - 1)).append("</td>");
        return text.toString();
    }

    @Override
    public String getTagType() {
        return "table header";
    }

    @Override
    public IBodyElement[] getContents() {
        return contents.toArray(new IBodyElement[contents.size()]);
    }

    @Override
    public void addContent(IBodyElement content) {
        this.contents.add(content);
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
    public void setBGColor(String color) {
        addStyle(IStyleManager.BGCOLOR, color);
    }

    @Override
    public String getBGColor() {
        return styleManager.getStyle(IStyleManager.BGCOLOR);
    }

    @Override
    public void setBorderColor(String color) {
        addStyle(IStyleManager.BORDER_COLOR, color);
    }

    @Override
    public String getBorderColor() {
        return styleManager.getStyle(IStyleManager.BORDER_COLOR);
    }

    @Override
    public String getBorderCollapse() {
        return styleManager.getStyle(IStyleManager.BORDER_COLLAPSE);
    }

    @Override
    public void setBorderCollapse(String collapse) {
        addStyle(IStyleManager.BORDER_COLLAPSE, collapse);
    }

    @Override
    public String getBorderWidth() {
        return styleManager.getStyle(IStyleManager.BORDER_WIDTH);
    }

    @Override
    public void setBorderWidth(String width) {
        addStyle(IStyleManager.BORDER_WIDTH, width);
    }

    @Override
    public String getBorderStyle() {
        return styleManager.getStyle(IStyleManager.BORDER_STYLE);
    }

    @Override
    public void setBorderStyle(String style) {
        addStyle(IStyleManager.BORDER_STYLE, style);
    }

    @Override
    public void setColSpan(int span) {
        addAttribute("colspan", Integer.toString(span));
    }

    @Override
    public int getColSpan() {
        return Integer.parseInt(attrs.getAttribute("colspan"));
    }

    @Override
    public void setRowSpan(int span) {
        addAttribute("rowspan", Integer.toString(span));
    }

    @Override
    public int getRowSpan() {
        return Integer.parseInt(attrs.getAttribute("rowspan"));
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
        return "td";
    }
}
