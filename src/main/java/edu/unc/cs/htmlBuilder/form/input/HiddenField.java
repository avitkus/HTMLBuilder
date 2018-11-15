package edu.unc.cs.htmlBuilder.form.input;

/**
 * @author Andrew Vitkus
 *
 */
public class HiddenField extends Input implements IHiddenField {
    
    public HiddenField() {
        super();
        setType("hidden");
    }

    @Override
    public void setValue(String value) {
        addAttribute("value", value);
    }

    @Override
    public String getValue() {
        return getAttribute("value");
    }

}
