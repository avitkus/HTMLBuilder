package edu.unc.cs.htmlBuilder.css;

/**
 * @author Andrew Vitkus
 *
 */
public interface ICSSFile {

    public void addRule(IRule rule);

    public IRule[] getRules();

    public String getCSS(int depth);
}
