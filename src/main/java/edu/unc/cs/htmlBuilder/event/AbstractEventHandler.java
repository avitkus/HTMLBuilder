package edu.unc.cs.htmlBuilder.event;

import edu.unc.cs.htmlBuilder.util.EventManager;
import edu.unc.cs.htmlBuilder.util.IEventManager;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public abstract class AbstractEventHandler implements IEventHandler {
    private final IEventManager events;
    
    AbstractEventHandler() {
        events = new EventManager();
    }
    
    @Override
    public IEventManager getEventManager() {
        return events;
    }

    @Override
    public ScriptGenerator getEvent(String name) {
        return events.getEvent(name);
    }

    @Override
    public void addEvent(String name, ScriptGenerator script) {
        events.addEvent(name, script);
    }
    
}
