package edu.unc.cs.htmlBuilder.table;

import edu.unc.cs.htmlBuilder.util.ITableStylable;
import edu.unc.cs.htmlBuilder.body.IBodyElement;

/**
 * @author Andrew Vitkus
 *
 */
public interface ITable extends IBodyElement, ITableStylable {

    public void addRow(ITableRow row);

    public ITableRow[] getRows();

    public void setBorder(String thickness, String style);

    public void setBorder(int thickness, String style);

    public void removeBorder();
}
