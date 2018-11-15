package edu.unc.cs.htmlBuilder.form.input;

import edu.unc.cs.htmlBuilder.form.input.IInput;

/**
 * @author Andrew Vitkus
 *
 */
public interface ICheckboxField extends IInput {

    public void setChecked(boolean checked);

    public boolean getChecked();
}
