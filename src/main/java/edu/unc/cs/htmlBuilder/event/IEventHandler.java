package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.IEventManager;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IEventHandler {
    
    public IEventManager getEventManager();
    public ScriptGenerator getEvent(String name);
    public void addEvent(String name, ScriptGenerator script);
}
