package edu.unc.cs.htmlBuilder.list;

import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IList extends IBodyElement, IColorable, IListItem {

    public void addListItem(IListItem item);

    public IListItem[] getListItems();
}
