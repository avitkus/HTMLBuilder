package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IParagraph extends IBodyElement, IColorable {

    public void addContent(IBodyElement element);

    public IBodyElement[] getContents();

    public void insertLineBreak();
}
