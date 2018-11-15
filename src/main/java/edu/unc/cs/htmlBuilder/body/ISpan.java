package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface ISpan extends IBodyElement, IColorable {

    public void addContent(IBodyElement content);

    public IBodyElement[] getContents();
}
