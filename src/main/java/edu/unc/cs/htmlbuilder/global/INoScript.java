package edu.unc.cs.htmlBuilder.global;

import edu.unc.cs.htmlBuilder.IHTMLElement;

/**
 *
 * @author Andrew Vitkus
 */
public interface INoScript extends IGlobalElement {

    public void addElement(IHTMLElement element);

    public IHTMLElement[] getElements();
}
