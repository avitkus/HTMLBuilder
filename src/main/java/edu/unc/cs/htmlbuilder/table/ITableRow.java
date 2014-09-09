package edu.unc.cs.htmlBuilder.table;

import edu.unc.cs.htmlBuilder.body.IBodyElement;
import edu.unc.cs.htmlBuilder.util.ITableStylable;

/**
 * @author Andrew Vitkus
 *
 */
public interface ITableRow extends IBodyElement, ITableStylable {

    public void addDataPart(ITableData data);

    public ITableData[] getDataParts();
}
