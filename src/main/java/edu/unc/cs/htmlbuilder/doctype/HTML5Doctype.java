package edu.unc.cs.htmlBuilder.doctype;

import edu.unc.cs.htmlBuilder.util.Offsetter;

/**
 * @author Andrew Vitkus
 *
 */
public class HTML5Doctype implements IDoctype {

    @Override
    public String getText(int indent) {
        return Offsetter.indent(indent) + "<!DOCTYPE html>";
    }

    @Override
    public String getTagType() {
        return "doctype";
    }
    
    @Override
    public String getTagAbbr() {
        return "!DOCTYPE";
    }
}
