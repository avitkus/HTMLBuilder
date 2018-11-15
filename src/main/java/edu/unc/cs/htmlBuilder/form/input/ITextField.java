package edu.unc.cs.htmlBuilder.form.input;

import edu.unc.cs.htmlBuilder.form.input.IInput;

/**
 * @author Andrew Vitkus
 *
 */
public interface ITextField extends IInput {

    public void setMinLength(int length);

    public int getMinLength();

    public void setMaxLength(int length);

    public int getMaxLength();

    public void setSize(int size);

    public int getSize();

    public void setPattern(String pattern);

    public String getPattern();

    public void setPlaceholder(String placeholder);

    public String getPlaceholder();

    public void setValue(String value);

    public String getValue();
}
