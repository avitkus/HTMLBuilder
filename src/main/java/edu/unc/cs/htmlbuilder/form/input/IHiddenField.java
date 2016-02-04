package edu.unc.cs.htmlBuilder.form.input;

/**
 * @author Andrew Vitkus
 *
 */
public interface IHiddenField extends IInput {

    public void setValue(String newValue);
    public String getValue();
}
