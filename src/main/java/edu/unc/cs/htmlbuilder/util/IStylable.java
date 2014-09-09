package edu.unc.cs.htmlBuilder.util;

/**
 * @author Andrew Vitkus
 *
 */
public interface IStylable {

    public void addStyle(String name, String value);

    public String[][] getStyles();
}
