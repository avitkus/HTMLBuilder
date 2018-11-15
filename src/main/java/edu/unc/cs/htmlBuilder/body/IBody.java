package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.util.IBGColorable;
import edu.unc.cs.htmlBuilder.event.IObjectEventHandler;

/**
 * @author Andrew Vitkus
 *
 */
public interface IBody extends IHTMLElement, IBGColorable, IObjectEventHandler {

    public IBodyElement[] getElements();

    public void addElement(IBodyElement element);
}
