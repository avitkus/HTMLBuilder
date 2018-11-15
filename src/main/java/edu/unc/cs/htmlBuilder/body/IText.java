package edu.unc.cs.htmlBuilder.body;

import edu.unc.cs.htmlBuilder.attributes.TextStyle;
import edu.unc.cs.htmlBuilder.util.IColorable;

/**
 * @author Andrew Vitkus
 *
 */
public interface IText extends IBodyElement, IColorable {

    public TextStyle[] getTextStyles();

    public void setTextStyle(TextStyle... style);

    public void addTextStyle(TextStyle... styles);

    public void removeStyle(TextStyle style);

    public void clearStyles();

    public String getText();

    public void setText(String text);

    public void appendText(String text, TextStyle... styles);

    public void addTextPart(IText text);

    public void clearText();

    public void addLink(IHyperlink link);
}
