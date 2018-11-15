package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IDivision extends IBodyElement, IColorable {

    public void addContent(IBodyElement content);

    public IBodyElement[] getContents();

    public void setClass(String className);
}
