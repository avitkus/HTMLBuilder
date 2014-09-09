package edu.unc.cs.htmlBuilder.meta;

import edu.unc.cs.htmlBuilder.attributes.LinkTarget;
import edu.unc.cs.htmlBuilder.body.IHyperlink;

/**
 *
 * @author Andrew Vitkus
 */
public interface INavigationBar extends IMetaElement {

    public void addLink(String display, String dest, LinkTarget target);

    public void addLink(String display, String dest);

    public void addLink(IHyperlink link);

    public IHyperlink[] getLinks();

    public void setSeparator(String separator);

    public String getSeparator();
}
