package edu.unc.cs.htmlBuilder.attributes;

/**
 * @author Andrew Vitkus
 *
 */
public enum LinkTarget {

    BLANK, SELF, PARENT, TOP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
