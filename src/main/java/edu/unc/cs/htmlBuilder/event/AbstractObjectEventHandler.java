package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public abstract class AbstractObjectEventHandler extends AbstractEventHandler implements IObjectEventHandler {

    @Override
    public void setOnAbort(ScriptGenerator script) {
        addEvent("onabort", script);
    }

    @Override
    public void setOnError(ScriptGenerator script) {
        addEvent("onerror", script);
    }

    @Override
    public void setOnHashChange(ScriptGenerator script) {
        addEvent("onhashchange", script);
    }
    
    @Override
    public void setOnLoad(ScriptGenerator script) {
        addEvent("onload", script);
    }
    
    @Override
    public void setOnBeforeUnload(ScriptGenerator script) {
        addEvent("onbeforeunload", script);
    }

    @Override
    public void setOnUnload(ScriptGenerator script) {
        addEvent("onunload", script);
    }

    @Override
    public void setOnPageShow(ScriptGenerator script) {
        addEvent("onpageshow", script);
    }

    @Override
    public void setOnPageHide(ScriptGenerator script) {
        addEvent("onpagehide", script);
    }

    @Override
    public void setOnResize(ScriptGenerator script) {
        addEvent("onresize", script);
    }

    @Override
    public void setOnScroll(ScriptGenerator script) {
        addEvent("onscroll", script);
    }

    @Override
    public ScriptGenerator getOnAbort() {
        return getEvent("onabort");
    }

    @Override
    public ScriptGenerator getOnError() {
        return getEvent("onerror");
    }

    @Override
    public ScriptGenerator getOnHashChange() {
        return getEvent("onhashchange");
    }
    
    @Override
    public ScriptGenerator getOnLoad() {
        return getEvent("onload");
    }


    @Override
    public ScriptGenerator getOnBeforeUnload() {
        return getEvent("onbeforeunload");
    }

    @Override
    public ScriptGenerator getOnUnload() {
        return getEvent("onunload");
    }

    @Override
    public ScriptGenerator getOnPageShow() {
        return getEvent("onpageshow");
    }

    @Override
    public ScriptGenerator getOnPageHide() {
        return getEvent("onpagehide");
    }

    @Override
    public ScriptGenerator getOnResize() {
        return getEvent("onresize");
    }

    @Override
    public ScriptGenerator getOnScroll() {
        return getEvent("onscroll");
    }
}
