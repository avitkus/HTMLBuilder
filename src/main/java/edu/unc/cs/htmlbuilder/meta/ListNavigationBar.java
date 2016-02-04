package edu.unc.cs.htmlBuilder.meta;

import java.util.ArrayList;
import edu.unc.cs.htmlBuilder.attributes.LinkTarget;
import edu.unc.cs.htmlBuilder.body.Hyperlink;
import edu.unc.cs.htmlBuilder.body.IHyperlink;
import edu.unc.cs.htmlBuilder.body.INavigation;
import edu.unc.cs.htmlBuilder.body.Navigation;
import edu.unc.cs.htmlBuilder.body.Text;
import edu.unc.cs.htmlBuilder.list.IListItem;
import edu.unc.cs.htmlBuilder.list.IUnorderedList;
import edu.unc.cs.htmlBuilder.list.ListItem;
import edu.unc.cs.htmlBuilder.list.UnorderedList;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;

public class ListNavigationBar implements INavigationBar {

    private final IUnorderedList linkList;
    private final IAttributeManager attrs;
    private String className;
    private String id;
    private String separator;

    public ListNavigationBar(IHyperlink... elements) {
        linkList = new UnorderedList();
        attrs = new AttributeManager();
        className = "";
        id = "";
        for (IHyperlink link : elements) {
            linkList.addListItem(new ListItem(link));
        }
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
        linkList.addListItem(new ListItem(link));
    }

    @Override
    public IHyperlink[] getLinks() {
        IListItem[] items = linkList.getListItems();
        ArrayList<IHyperlink> links = new ArrayList<>(items.length);
        for (IListItem item : items) {
            links.add((IHyperlink) item.getContents()[0]);
        }
        return links.toArray(new IHyperlink[links.size()]);
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
        INavigation nav = new Navigation(linkList);
        return nav.getText(indent);
    }

    @Override
    public String getTagType() {
        return "meta - list navbar";
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
