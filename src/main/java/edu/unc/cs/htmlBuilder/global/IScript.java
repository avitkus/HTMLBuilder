package edu.unc.cs.htmlBuilder.global;

import java.util.Optional;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

/**
 *
 * @author Andrew Vitkus
 */
public interface IScript extends IGlobalElement {

    public void setScript(ScriptGenerator script);

    public ScriptGenerator getScript();

    public void setAsync(boolean async);

    public boolean getAsync();

    public void setDefer(boolean defer);

    public boolean getDefer();

    public void setCharset(String charset);

    public Optional<String> getCharset();

    public void setSource(String src);

    public Optional<String> getSource();

    public void setType(String mime);

    public Optional<String> getType();
}
