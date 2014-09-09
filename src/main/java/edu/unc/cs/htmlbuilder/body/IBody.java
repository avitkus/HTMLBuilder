package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.event.IWindowEventHandler;
import edu.unc.cs.htmlBuilder.util.IBGColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IBody extends IHTMLElement, IBGColorable, IWindowEventHandler {

    public IBodyElement[] getElements();

    public void addElement(IBodyElement element);
}
