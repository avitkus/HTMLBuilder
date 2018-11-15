package edu.unc.cs.htmlBuilder.form.input;

import edu.unc.cs.htmlBuilder.form.input.Button;

/**
 * @author Andrew Vitkus
 *
 */
public class SubmitButton extends Button implements ISubmitButton {

    public SubmitButton() {
        super();
        setType("submit");
    }
}
