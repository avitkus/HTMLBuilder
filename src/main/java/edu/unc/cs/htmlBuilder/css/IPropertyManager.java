package edu.unc.cs.htmlBuilder.css;

/**
 * @author Andrew Vitkus
 *
 */
public interface IPropertyManager {

    public void addProperty(String name, String value);

    public String[][] getProperties();

    public String getCSS(int indent);
}
