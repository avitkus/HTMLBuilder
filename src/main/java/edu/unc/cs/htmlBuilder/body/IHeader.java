package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IHeader extends IBodyElement, IColorable {

    public void setText(String text);

    public void setText(IText text);

    public String getText();

    public int getLevel();

    public void setLevel(int level);
}
