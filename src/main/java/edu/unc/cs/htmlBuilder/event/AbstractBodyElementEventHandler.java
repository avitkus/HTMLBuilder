package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public class AbstractBodyElementEventHandler extends AbstractObjectEventHandler implements IMouseEventHandler {
    @Override
    public void setOnClick(ScriptGenerator script) {
        addEvent("onclick", script);
    }

    @Override
    public void setOnContextMenu(ScriptGenerator script) {
        addEvent("oncontextmenu", script);
    }

    @Override
    public void setOnDblClick(ScriptGenerator script) {
        addEvent("ondblclick", script);
    }

    @Override
    public void setOnMouseDown(ScriptGenerator script) {
        addEvent("onmousedown", script);
    }

    @Override
    public void setOnMouseUp(ScriptGenerator script) {
        addEvent("onmouseup", script);
    }

    @Override
    public void setOnMouseEnter(ScriptGenerator script) {
        addEvent("onmouseenter", script);
    }

    @Override
    public void setOnMouseLeave(ScriptGenerator script) {
        addEvent("onmouseleave", script);
    }

    @Override
    public void setOnMouseOver(ScriptGenerator script) {
        addEvent("onmouseover", script);
    }

    @Override
    public void setOnMouseOut(ScriptGenerator script) {
        addEvent("onmouseout", script);
    }
    
    
    @Override
    public ScriptGenerator getOnClick() {
        return getEvent("onclick");
    }

    @Override
    public ScriptGenerator getOnContextMenu() {
        return getEvent("oncontextmenu");
    }

    @Override
    public ScriptGenerator getOnDblClick() {
        return getEvent("ondblclick");
    }

    @Override
    public ScriptGenerator getOnMouseDown() {
        return getEvent("onmousedown");
    }

    @Override
    public ScriptGenerator getOnMouseUp() {
        return getEvent("onmouseup");
    }
    
    @Override
    public ScriptGenerator getOnMouseEnter() {
        return getEvent("onmouseenter");
    }

    @Override
    public ScriptGenerator getOnMouseLeave() {
        return getEvent("onmouseleave");
    }

    @Override
    public ScriptGenerator getOnMouseOver() {
        return getEvent("onmouseover");
    }

    @Override
    public ScriptGenerator getOnMouseOut() {
        return getEvent("onmouseout");
    }
}
