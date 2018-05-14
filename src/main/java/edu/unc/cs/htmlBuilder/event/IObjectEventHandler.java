package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IObjectEventHandler {
    
    public void setOnAbort(ScriptGenerator script);
    public void setOnError(ScriptGenerator script);
    public void setOnHashChange(ScriptGenerator script);
    public void setOnLoad(ScriptGenerator script);
    public void setOnBeforeUnload(ScriptGenerator script);
    public void setOnUnload(ScriptGenerator script);
    public void setOnPageShow(ScriptGenerator script);
    public void setOnPageHide(ScriptGenerator script);
    public void setOnResize(ScriptGenerator script);
    public void setOnScroll(ScriptGenerator script);

    public ScriptGenerator getOnAbort();
    public ScriptGenerator getOnError();
    public ScriptGenerator getOnHashChange();
    public ScriptGenerator getOnLoad();
    public ScriptGenerator getOnBeforeUnload();
    public ScriptGenerator getOnUnload();
    public ScriptGenerator getOnPageShow();
    public ScriptGenerator getOnPageHide();
    public ScriptGenerator getOnResize();
    public ScriptGenerator getOnScroll();
}
