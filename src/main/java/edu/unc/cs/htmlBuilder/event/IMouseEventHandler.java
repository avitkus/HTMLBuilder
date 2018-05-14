package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IMouseEventHandler {
    
    public void setOnClick(ScriptGenerator script);
    public void setOnContextMenu(ScriptGenerator script);
    public void setOnDblClick(ScriptGenerator script);
    public void setOnMouseDown(ScriptGenerator script);
    public void setOnMouseUp(ScriptGenerator script);
    public void setOnMouseEnter(ScriptGenerator script);
    public void setOnMouseLeave(ScriptGenerator script);
    public void setOnMouseOver(ScriptGenerator script);
    public void setOnMouseOut(ScriptGenerator script);

    public ScriptGenerator getOnClick();
    public ScriptGenerator getOnContextMenu();
    public ScriptGenerator getOnDblClick();
    public ScriptGenerator getOnMouseDown();
    public ScriptGenerator getOnMouseUp();
    public ScriptGenerator getOnMouseEnter();
    public ScriptGenerator getOnMouseLeave();
    public ScriptGenerator getOnMouseOver();
    public ScriptGenerator getOnMouseOut();
}
