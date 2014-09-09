package edu.unc.cs.htmlBuilder.form.input;

import edu.unc.cs.htmlBuilder.form.input.Button;

/**
 * @author Andrew Vitkus
 *
 */
public class ResetButton extends Button implements IResetButton {

    public ResetButton() {
        super();
        setType("reset");
    }
}
