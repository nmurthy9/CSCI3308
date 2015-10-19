/* File generated by: simse.codegenerator.guigenerator.AtAGlanceTableModelGenerator */
package simse.gui;

import javax.swing.table.*;
import java.util.*;
import java.lang.*;
import java.text.*;

import simse.adts.objects.*;
import simse.state.*;


public class SoftwareDeveloperTableModel extends AbstractTableModel
{
private Vector<String> columnNames; // column names
private Vector<Vector<Object>> data; // data in table
private State state;

private NumberFormat numFormat;

public SoftwareDeveloperTableModel(State s)
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
columnNames.add("Name");
columnNames.add("SoftwareDevelopmentExperience");
columnNames.add("KnowsCodingStandard");
}

public void update()
{

if (!state.getClock().isStopped()) {
Vector<SoftwareDeveloper> softwaredevelopers = state.getEmployeeStateRepository().getSoftwareDeveloperStateRepository().getAll();
Vector<Object> temp = new Vector<Object>();
// Initialize Name:
temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(softwaredevelopers.elementAt(i).getName());
}
if(data.size() < 1)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 0);
}

// Initialize SoftwareDevelopmentExperience:
temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(softwaredevelopers.elementAt(i).getSoftwareDevelopmentExperience());
}
if(data.size() < 2)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 1);
}

// Initialize KnowsCodingStandard:
temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(new Boolean(softwaredevelopers.elementAt(i).getKnowsCodingStandard()));
}
if(data.size() < 3)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 2);
}

}
else // game over
{
data.clear();
columnNames.clear();
Vector<SoftwareDeveloper> softwaredevelopers = state.getEmployeeStateRepository().getSoftwareDeveloperStateRepository().getAll();
Vector<Object> temp = new Vector<Object>();
// Initialize Name:
if(columnNames.contains("Name") == false)
{
columnNames.add("Name");
}temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(softwaredevelopers.elementAt(i).getName());}
if(data.size() < 1)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 0);
}

// Initialize SoftwareDevelopmentExperience:
if(columnNames.contains("SoftwareDevelopmentExperience") == false)
{
columnNames.add("SoftwareDevelopmentExperience");
}temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(softwaredevelopers.elementAt(i).getSoftwareDevelopmentExperience());}
if(data.size() < 2)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 1);
}

// Initialize KnowsCodingStandard:
if(columnNames.contains("KnowsCodingStandard") == false)
{
columnNames.add("KnowsCodingStandard");
}temp = new Vector<Object>();
for(int i=0; i<softwaredevelopers.size(); i++)
{
temp.add(new Boolean(softwaredevelopers.elementAt(i).getKnowsCodingStandard()));}
if(data.size() < 3)
{
data.add(temp);
}
else
{
data.setElementAt(temp, 2);
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