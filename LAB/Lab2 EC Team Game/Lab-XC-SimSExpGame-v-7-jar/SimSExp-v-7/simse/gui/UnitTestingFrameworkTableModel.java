/* File generated by: simse.codegenerator.guigenerator.AtAGlanceTableModelGenerator */
package simse.gui;

import javax.swing.table.*;
import java.util.*;
import java.lang.*;
import java.text.*;

import simse.adts.objects.*;
import simse.state.*;


public class UnitTestingFrameworkTableModel extends AbstractTableModel
{
private Vector<String> columnNames; // column names
private Vector<Vector<Object>> data; // data in table
private State state;

private NumberFormat numFormat;

public UnitTestingFrameworkTableModel(State s)
{
state = s;
columnNames = new Vector<String>();
data = new Vector<Vector<Object>>();
numFormat = NumberFormat.getNumberInstance(Locale.US);
initColNames();
update();
}

public int getColumnCount()
{
return columnNames.size();
}

public int getRowCount()
{
if (data.size() > 0) {
return data.elementAt(0).size();
}return 0;
}

public String getColumnName(int col)
{
return columnNames.elementAt(col);
}

public int getColumnIndex(String columnName)
{
for(int i=0; i<columnNames.size(); i++)
{
String colName = columnNames.elementAt(i);
if(colName.equals(columnName))
{
return i;
}
}
return -1;
}

public Object getValueAt(int row, int col)
{
return data.elementAt(col).elementAt(row);
}

public void setValueAt(Object value, int row, int col)
{
data.elementAt(col).add(value);
fireTableCellUpdated(row, col);
}

private void initColNames()
{
columnNames.add("Description");
}

public void update()
{

if (!state.getClock().isStopped()) {
Vector<UnitTestingFramework> unittestingframeworks = state.getToolStateRepository().getUnitTestingFrameworkStateRepository().getAll();
Vector<Object> temp = new Vector<Object>();
// Initialize Description:
temp = new Vector<Object>();
for(int i=0; i<unittestingframeworks.size(); i++)
{
temp.add(unittestingframeworks.elementAt(i).getDescription());
}
if(data.size() < 1)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 0);
}

}
else // game over
{
data.clear();
columnNames.clear();
Vector<UnitTestingFramework> unittestingframeworks = state.getToolStateRepository().getUnitTestingFrameworkStateRepository().getAll();
Vector<Object> temp = new Vector<Object>();
// Initialize Description:
if(columnNames.contains("Description") == false)
{
columnNames.add("Description");
}temp = new Vector<Object>();
for(int i=0; i<unittestingframeworks.size(); i++)
{
temp.add(unittestingframeworks.elementAt(i).getDescription());}
if(data.size() < 1)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 0);
}

// Initialize ProductivityIncreaseFactor:
if(columnNames.contains("ProductivityIncreaseFactor") == false)
{
columnNames.add("ProductivityIncreaseFactor");
}temp = new Vector<Object>();
for(int i=0; i<unittestingframeworks.size(); i++)
{
numFormat.setMinimumFractionDigits(0);
numFormat.setMaximumFractionDigits(0);
temp.add(numFormat.format(unittestingframeworks.elementAt(i).getProductivityIncreaseFactor()));}
if(data.size() < 2)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 1);
}

fireTableStructureChanged();
}

fireTableDataChanged(); // notify listeners that table data has changed
}


public Class getColumnClass(int c)
{
return getValueAt(0, c).getClass();
}
}