package edu.unc.cs.htmlBuilder.form.input;

import edu.unc.cs.htmlBuilder.form.input.Input;

/**
 * @author Andrew Vitkus
 *
 */
public class CheckboxField extends Input implements ICheckboxField {

    public CheckboxField() {
        super();
        setType("checkbox");
    }

    @Override
    public void setChecked(boolean checked) {
        if (checked) {
            addAttribute("checked", null);
        } else {
            removeAttribute("checked");
        }
    }

    @Override
    public boolean getChecked() {
        return Boolean.parseBoolean(getAttribute("checked"));
    }

}
