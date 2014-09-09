package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IWindowEventHandler {
    
    public void setOnload(ScriptGenerator script);

    public ScriptGenerator getOnload();
}
