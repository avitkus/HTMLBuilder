package edu.unc.cs.htmlBuilder.form;

import edu.unc.cs.htmlBuilder.util.IFormEventHandler;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;
import edu.unc.cs.htmlbuilder.body.AbstractBodyElement;

/**
 *
 * @author Andrew Vitkus
 */
public abstract class AbstractFormElement extends AbstractBodyElement implements IFormElement, IFormEventHandler {

    public AbstractFormElement(boolean selfClosing, boolean hasChildren) {
        super(selfClosing, hasChildren);
    }
    
    @Override
    public void setOnchange(ScriptGenerator script) {
        addEvent("onchange", script);
    }

    @Override
    public ScriptGenerator getOnchange() {
        return getEvent("onchange");
    }

    @Override
    public String getTagType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}