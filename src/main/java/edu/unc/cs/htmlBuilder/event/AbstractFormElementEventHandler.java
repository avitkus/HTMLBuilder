package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public class AbstractFormElementEventHandler extends AbstractBodyElementEventHandler implements IFormEventHandler {

    @Override
    public void setOnBlur(ScriptGenerator script) {
        addEvent("onblur", script);
    }

    @Override
    public void setOnChange(ScriptGenerator script) {
        addEvent("onchange", script);
    }

    @Override
    public void setOnFocus(ScriptGenerator script) {
        addEvent("onfocus", script);
    }

    @Override
    public void setOnFocusIn(ScriptGenerator script) {
        addEvent("onfocusin", script);
    }

    @Override
    public void setOnFocusOut(ScriptGenerator script) {
        addEvent("onfocusout", script);
    }

    @Override
    public void setOnInput(ScriptGenerator script) {
        addEvent("oninput", script);
    }

    @Override
    public void setOnInvalid(ScriptGenerator script) {
        addEvent("oninvalid", script);
    }

    @Override
    public void setOnReset(ScriptGenerator script) {
        addEvent("onreset", script);
    }

    @Override
    public void setOnSearch(ScriptGenerator script) {
        addEvent("onsearch", script);
    }

    @Override
    public void setOnSelect(ScriptGenerator script) {
        addEvent("onselect", script);
    }

    @Override
    public void setOnSubmit(ScriptGenerator script) {
        addEvent("onsubmit", script);
    }

    @Override
    public ScriptGenerator getOnBlur() {
        return getEvent("onblur");
    }

    @Override
    public ScriptGenerator getOnChange() {
        return getEvent("onchange");
    }

    @Override
    public ScriptGenerator getOnFocus() {
        return getEvent("onfocus");
    }

    @Override
    public ScriptGenerator getOnFocusIn() {
        return getEvent("onfocusin");
    }

    @Override
    public ScriptGenerator getOnFocusOut() {
        return getEvent("onfocusout");
    }

    @Override
    public ScriptGenerator getOnInput() {
        return getEvent("oninput");
    }

    @Override
    public ScriptGenerator getOnInvalid() {
        return getEvent("oninvalid");
    }

    @Override
    public ScriptGenerator getOnReset() {
        return getEvent("onreset");
    }

    @Override
    public ScriptGenerator getOnSearch() {
        return getEvent("onsearch");
    }

    @Override
    public ScriptGenerator getOnSubmit() {
        return getEvent("onsubmit");
    }
    
}
