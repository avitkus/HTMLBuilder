package edu.unc.cs.htmlBuilder.table;

import edu.unc.cs.htmlBuilder.util.ITableStylable;
import edu.unc.cs.htmlBuilder.body.IBodyElement;

/**
 * @author Andrew Vitkus
 *
 */
public interface ITableData extends IBodyElement, ITableStylable {

    public void addContent(IBodyElement content);

    public IBodyElement[] getContents();

    public void setColSpan(int span);

    public int getColSpan();

    public void setRowSpan(int span);

    public int getRowSpan();
}
