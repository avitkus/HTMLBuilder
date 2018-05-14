package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IFormEventHandler extends IEventHandler {
    
    public void setOnBlur(ScriptGenerator script);
    public void setOnChange(ScriptGenerator script);
    public void setOnFocus(ScriptGenerator script);
    public void setOnFocusIn(ScriptGenerator script);
    public void setOnFocusOut(ScriptGenerator script);
    public void setOnInput(ScriptGenerator script);
    public void setOnInvalid(ScriptGenerator script);
    public void setOnReset(ScriptGenerator script);
    public void setOnSearch(ScriptGenerator script);
    public void setOnSelect(ScriptGenerator script);
    public void setOnSubmit(ScriptGenerator script);

    public ScriptGenerator getOnBlur();
    public ScriptGenerator getOnChange();
    public ScriptGenerator getOnFocus();
    public ScriptGenerator getOnFocusIn();
    public ScriptGenerator getOnFocusOut();
    public ScriptGenerator getOnInput();
    public ScriptGenerator getOnInvalid();
    public ScriptGenerator getOnReset();
    public ScriptGenerator getOnSearch();
    public ScriptGenerator getOnSubmit();
}
