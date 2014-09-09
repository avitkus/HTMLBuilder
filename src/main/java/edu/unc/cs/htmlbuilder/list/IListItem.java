package edu.unc.cs.htmlBuilder.list;

import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IListItem extends IBodyElement, IColorable {

    public void addContents(IBodyElement contents);

    public IBodyElement[] getContents();
}
