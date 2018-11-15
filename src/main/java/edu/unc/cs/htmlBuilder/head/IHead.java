package edu.unc.cs.htmlBuilder.head;

import edu.unc.cs.htmlBuilder.IHTMLElement;

/**
 * @author Andrew Vitkus
 *
 */
public interface IHead extends IHTMLElement {

    public IHeadElement[] getElements();

    public void addElement(IHeadElement element);
}
