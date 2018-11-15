package edu.unc.cs.htmlBuilder.head;

import edu.unc.cs.htmlBuilder.css.ICSSFile;

/**
 * @author Andrew Vitkus
 *
 */
public interface IStyle extends IHeadElement {

    public void setCSS(ICSSFile file);

    public ICSSFile getCSS();
}
