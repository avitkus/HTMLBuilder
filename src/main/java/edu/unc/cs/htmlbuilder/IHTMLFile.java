package edu.unc.cs.htmlBuilder;

import edu.unc.cs.htmlBuilder.css.ICSSFile;
import edu.unc.cs.htmlBuilder.body.IBody;
import edu.unc.cs.htmlBuilder.doctype.IDoctype;
import edu.unc.cs.htmlBuilder.head.IHead;

/**
 * @author Andrew Vitkus
 *
 */
public interface IHTMLFile {

    public void setDoctype(IDoctype doctype);

    public IDoctype getDoctype();

    public void addCSSFile(String file);

    public void addInlineCSS(ICSSFile file);

    public void setHead(IHead head);

    public IHead getHead();

    public void setBody(IBody body);

    public IBody getBody();

    public String getHTML();
}
