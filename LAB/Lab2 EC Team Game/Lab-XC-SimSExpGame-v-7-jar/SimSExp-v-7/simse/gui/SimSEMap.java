/* File generated by: simse.codegenerator.guigenerator.SimSEMapGenerator */
package simse.gui;
import simse.adts.objects.*;
import simse.state.*;
import simse.logic.*;

import java.util.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class SimSEMap extends JPanel implements MouseListener, ActionListener
{
protected State state;
protected Logic logic;
protected String sopFile; // location of sop file if loaded

protected TileData[][] mapRep;
protected ArrayList<DisplayedEmployee> sopUsers; // all of the DisplayedEmployees in the state
protected int ssObjCount;

public SimSEMap(State s, Logic l)
{
state = s;
logic = l;
mapRep = new TileData[MapData.X_MAPSIZE][MapData.Y_MAPSIZE];
for(int i=0; i<MapData.Y_MAPSIZE; i++)
for(int j=0; j<MapData.X_MAPSIZE; j++)
mapRep[j][i] = new TileData(MapData.TILE_GRID, MapData.TRANSPARENT);
sopUsers = new ArrayList<DisplayedEmployee>();

// get all of the employees from the state:
Vector<Employee> allEmps = state.getEmployeeStateRepository().getAll();
for(int i=0; i<allEmps.size(); i++)
{
Employee tempEmp = allEmps.elementAt(i);
DisplayedEmployee tmpUser = new DisplayedEmployee(tempEmp, null, this, false, false, -1, -1);
sopUsers.add(tmpUser);
}

// go through all sopUsers and set information:
for(int i=0; i<sopUsers.size(); i++)
{
DisplayedEmployee user = sopUsers.get(i);
user.setXYLocations(getXYCoordinates(user.getEmployee())[0], getXYCoordinates(user.getEmployee())[1]);
String url = getImage(user.getEmployee());
if (url != null) {
user.setUserIcon(url);
if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Robert")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof CustomerRep) && (((CustomerRep)user.getEmployee()).getName().equals("Customer Wayne")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Joyce")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof Manager) && (((Manager)user.getEmployee()).getName().equals("Chang")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Peg")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Reda")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Timothy")))
{
user.setDisplayed(true);
user.setActivated(true);
}
else if((user.getEmployee() instanceof SoftwareDeveloper) && (((SoftwareDeveloper)user.getEmployee()).getName().equals("Sigfreido")))
{
user.setDisplayed(true);
user.setActivated(true);
}
}
}

// map objects:
mapRep[0][0].baseKey = -3;
mapRep[0][0].fringeKey = -1;
mapRep[1][0].baseKey = -3;
mapRep[1][0].fringeKey = 101;
mapRep[2][0].baseKey = -3;
mapRep[2][0].fringeKey = 101;
mapRep[3][0].baseKey = -3;
mapRep[3][0].fringeKey = 101;
mapRep[4][0].baseKey = -3;
mapRep[4][0].fringeKey = 101;
mapRep[5][0].baseKey = -3;
mapRep[5][0].fringeKey = -1;
mapRep[6][0].baseKey = -3;
mapRep[6][0].fringeKey = -1;
mapRep[7][0].baseKey = -3;
mapRep[7][0].fringeKey = -1;
mapRep[8][0].baseKey = -3;
mapRep[8][0].fringeKey = -1;
mapRep[9][0].baseKey = -3;
mapRep[9][0].fringeKey = -1;
mapRep[10][0].baseKey = -3;
mapRep[10][0].fringeKey = -1;
mapRep[11][0].baseKey = 401;
mapRep[11][0].fringeKey = 5;
mapRep[12][0].baseKey = 402;
mapRep[12][0].fringeKey = 5;
mapRep[13][0].baseKey = 402;
mapRep[13][0].fringeKey = 5;
mapRep[14][0].baseKey = 403;
mapRep[14][0].fringeKey = 5;
mapRep[15][0].baseKey = -3;
mapRep[15][0].fringeKey = -1;
mapRep[0][1].baseKey = -3;
mapRep[0][1].fringeKey = 103;
mapRep[1][1].baseKey = 401;
mapRep[1][1].fringeKey = -1;
mapRep[2][1].baseKey = 402;
mapRep[2][1].fringeKey = -1;
mapRep[3][1].baseKey = 402;
mapRep[3][1].fringeKey = -1;
mapRep[4][1].baseKey = 403;
mapRep[4][1].fringeKey = 5;
mapRep[5][1].baseKey = -3;
mapRep[5][1].fringeKey = 104;
mapRep[6][1].baseKey = -3;
mapRep[6][1].fringeKey = -1;
mapRep[7][1].baseKey = -3;
mapRep[7][1].fringeKey = -1;
mapRep[8][1].baseKey = -3;
mapRep[8][1].fringeKey = -1;
mapRep[9][1].baseKey = -3;
mapRep[9][1].fringeKey = -1;
mapRep[10][1].baseKey = -3;
mapRep[10][1].fringeKey = -1;
mapRep[11][1].baseKey = 401;
mapRep[11][1].fringeKey = 5;
mapRep[12][1].baseKey = 402;
mapRep[12][1].fringeKey = 5;
mapRep[13][1].baseKey = 402;
mapRep[13][1].fringeKey = 4;
mapRep[14][1].baseKey = 403;
mapRep[14][1].fringeKey = 5;
mapRep[15][1].baseKey = -3;
mapRep[15][1].fringeKey = -1;
mapRep[0][2].baseKey = -3;
mapRep[0][2].fringeKey = -1;
mapRep[1][2].baseKey = 407;
mapRep[1][2].fringeKey = -1;
mapRep[2][2].baseKey = 408;
mapRep[2][2].fringeKey = 102;
mapRep[3][2].baseKey = 408;
mapRep[3][2].fringeKey = 102;
mapRep[4][2].baseKey = 409;
mapRep[4][2].fringeKey = -1;
mapRep[5][2].baseKey = -3;
mapRep[5][2].fringeKey = -1;
mapRep[6][2].baseKey = -3;
mapRep[6][2].fringeKey = -1;
mapRep[7][2].baseKey = -3;
mapRep[7][2].fringeKey = -1;
mapRep[8][2].baseKey = -3;
mapRep[8][2].fringeKey = -1;
mapRep[9][2].baseKey = -3;
mapRep[9][2].fringeKey = -1;
mapRep[10][2].baseKey = -3;
mapRep[10][2].fringeKey = -1;
mapRep[11][2].baseKey = 407;
mapRep[11][2].fringeKey = -1;
mapRep[12][2].baseKey = 408;
mapRep[12][2].fringeKey = 102;
mapRep[13][2].baseKey = 408;
mapRep[13][2].fringeKey = 102;
mapRep[14][2].baseKey = 409;
mapRep[14][2].fringeKey = -1;
mapRep[15][2].baseKey = -3;
mapRep[15][2].fringeKey = 3;
mapRep[0][3].baseKey = -3;
mapRep[0][3].fringeKey = -1;
mapRep[1][3].baseKey = -3;
mapRep[1][3].fringeKey = -1;
mapRep[2][3].baseKey = -3;
mapRep[2][3].fringeKey = -1;
mapRep[3][3].baseKey = -3;
mapRep[3][3].fringeKey = -1;
mapRep[4][3].baseKey = -3;
mapRep[4][3].fringeKey = -1;
mapRep[5][3].baseKey = -3;
mapRep[5][3].fringeKey = -1;
mapRep[6][3].baseKey = -3;
mapRep[6][3].fringeKey = -1;
mapRep[7][3].baseKey = -3;
mapRep[7][3].fringeKey = -1;
mapRep[8][3].baseKey = -3;
mapRep[8][3].fringeKey = -1;
mapRep[9][3].baseKey = -3;
mapRep[9][3].fringeKey = -1;
mapRep[10][3].baseKey = -3;
mapRep[10][3].fringeKey = -1;
mapRep[11][3].baseKey = -3;
mapRep[11][3].fringeKey = -1;
mapRep[12][3].baseKey = -3;
mapRep[12][3].fringeKey = -1;
mapRep[13][3].baseKey = -3;
mapRep[13][3].fringeKey = -1;
mapRep[14][3].baseKey = -3;
mapRep[14][3].fringeKey = -1;
mapRep[15][3].baseKey = -3;
mapRep[15][3].fringeKey = -1;
mapRep[0][4].baseKey = -3;
mapRep[0][4].fringeKey = -1;
mapRep[1][4].baseKey = -3;
mapRep[1][4].fringeKey = -1;
mapRep[2][4].baseKey = -3;
mapRep[2][4].fringeKey = -1;
mapRep[3][4].baseKey = -3;
mapRep[3][4].fringeKey = -1;
mapRep[4][4].baseKey = 401;
mapRep[4][4].fringeKey = 5;
mapRep[5][4].baseKey = 402;
mapRep[5][4].fringeKey = -1;
mapRep[6][4].baseKey = 403;
mapRep[6][4].fringeKey = -1;
mapRep[7][4].baseKey = 401;
mapRep[7][4].fringeKey = -1;
mapRep[8][4].baseKey = 402;
mapRep[8][4].fringeKey = 5;
mapRep[9][4].baseKey = 403;
mapRep[9][4].fringeKey = 5;
mapRep[10][4].baseKey = -3;
mapRep[10][4].fringeKey = -1;
mapRep[11][4].baseKey = -3;
mapRep[11][4].fringeKey = -1;
mapRep[12][4].baseKey = -3;
mapRep[12][4].fringeKey = -1;
mapRep[13][4].baseKey = -3;
mapRep[13][4].fringeKey = -1;
mapRep[14][4].baseKey = -3;
mapRep[14][4].fringeKey = -1;
mapRep[15][4].baseKey = -3;
mapRep[15][4].fringeKey = -1;
mapRep[0][5].baseKey = -3;
mapRep[0][5].fringeKey = -1;
mapRep[1][5].baseKey = -3;
mapRep[1][5].fringeKey = -1;
mapRep[2][5].baseKey = -3;
mapRep[2][5].fringeKey = -1;
mapRep[3][5].baseKey = -3;
mapRep[3][5].fringeKey = -1;
mapRep[4][5].baseKey = 401;
mapRep[4][5].fringeKey = 5;
mapRep[5][5].baseKey = 402;
mapRep[5][5].fringeKey = -1;
mapRep[6][5].baseKey = 403;
mapRep[6][5].fringeKey = -1;
mapRep[7][5].baseKey = 401;
mapRep[7][5].fringeKey = -1;
mapRep[8][5].baseKey = 402;
mapRep[8][5].fringeKey = -1;
mapRep[9][5].baseKey = 403;
mapRep[9][5].fringeKey = 4;
mapRep[10][5].baseKey = -3;
mapRep[10][5].fringeKey = 104;
mapRep[11][5].baseKey = -3;
mapRep[11][5].fringeKey = -1;
mapRep[12][5].baseKey = -3;
mapRep[12][5].fringeKey = -1;
mapRep[13][5].baseKey = -3;
mapRep[13][5].fringeKey = -1;
mapRep[14][5].baseKey = -3;
mapRep[14][5].fringeKey = -1;
mapRep[15][5].baseKey = -3;
mapRep[15][5].fringeKey = -1;
mapRep[0][6].baseKey = -3;
mapRep[0][6].fringeKey = -1;
mapRep[1][6].baseKey = -3;
mapRep[1][6].fringeKey = -1;
mapRep[2][6].baseKey = -3;
mapRep[2][6].fringeKey = -1;
mapRep[3][6].baseKey = -3;
mapRep[3][6].fringeKey = 103;
mapRep[4][6].baseKey = 401;
mapRep[4][6].fringeKey = 4;
mapRep[5][6].baseKey = 402;
mapRep[5][6].fringeKey = -1;
mapRep[6][6].baseKey = 403;
mapRep[6][6].fringeKey = -1;
mapRep[7][6].baseKey = 401;
mapRep[7][6].fringeKey = -1;
mapRep[8][6].baseKey = 402;
mapRep[8][6].fringeKey = -1;
mapRep[9][6].baseKey = 403;
mapRep[9][6].fringeKey = 5;
mapRep[10][6].baseKey = -3;
mapRep[10][6].fringeKey = 104;
mapRep[11][6].baseKey = -3;
mapRep[11][6].fringeKey = -1;
mapRep[12][6].baseKey = -3;
mapRep[12][6].fringeKey = -1;
mapRep[13][6].baseKey = -3;
mapRep[13][6].fringeKey = -1;
mapRep[14][6].baseKey = -3;
mapRep[14][6].fringeKey = -1;
mapRep[15][6].baseKey = -3;
mapRep[15][6].fringeKey = -1;
mapRep[0][7].baseKey = -3;
mapRep[0][7].fringeKey = -1;
mapRep[1][7].baseKey = -3;
mapRep[1][7].fringeKey = -1;
mapRep[2][7].baseKey = -3;
mapRep[2][7].fringeKey = -1;
mapRep[3][7].baseKey = -3;
mapRep[3][7].fringeKey = 103;
mapRep[4][7].baseKey = 401;
mapRep[4][7].fringeKey = 5;
mapRep[5][7].baseKey = 402;
mapRep[5][7].fringeKey = -1;
mapRep[6][7].baseKey = 403;
mapRep[6][7].fringeKey = -1;
mapRep[7][7].baseKey = 401;
mapRep[7][7].fringeKey = -1;
mapRep[8][7].baseKey = 402;
mapRep[8][7].fringeKey = -1;
mapRep[9][7].baseKey = 403;
mapRep[9][7].fringeKey = 5;
mapRep[10][7].baseKey = -3;
mapRep[10][7].fringeKey = -1;
mapRep[11][7].baseKey = -3;
mapRep[11][7].fringeKey = -1;
mapRep[12][7].baseKey = -3;
mapRep[12][7].fringeKey = -1;
mapRep[13][7].baseKey = -3;
mapRep[13][7].fringeKey = -1;
mapRep[14][7].baseKey = -3;
mapRep[14][7].fringeKey = -1;
mapRep[15][7].baseKey = -3;
mapRep[15][7].fringeKey = -1;
mapRep[0][8].baseKey = -3;
mapRep[0][8].fringeKey = -1;
mapRep[1][8].baseKey = -3;
mapRep[1][8].fringeKey = -1;
mapRep[2][8].baseKey = -3;
mapRep[2][8].fringeKey = -1;
mapRep[3][8].baseKey = -3;
mapRep[3][8].fringeKey = 3;
mapRep[4][8].baseKey = 407;
mapRep[4][8].fringeKey = -1;
mapRep[5][8].baseKey = 408;
mapRep[5][8].fringeKey = -1;
mapRep[6][8].baseKey = 409;
mapRep[6][8].fringeKey = -1;
mapRep[7][8].baseKey = 407;
mapRep[7][8].fringeKey = -1;
mapRep[8][8].baseKey = 408;
mapRep[8][8].fringeKey = -1;
mapRep[9][8].baseKey = 409;
mapRep[9][8].fringeKey = -1;
mapRep[10][8].baseKey = -3;
mapRep[10][8].fringeKey = 2;
mapRep[11][8].baseKey = -3;
mapRep[11][8].fringeKey = -1;
mapRep[12][8].baseKey = -3;
mapRep[12][8].fringeKey = -1;
mapRep[13][8].baseKey = -3;
mapRep[13][8].fringeKey = -1;
mapRep[14][8].baseKey = -3;
mapRep[14][8].fringeKey = -1;
mapRep[15][8].baseKey = -3;
mapRep[15][8].fringeKey = -1;
mapRep[0][9].baseKey = -3;
mapRep[0][9].fringeKey = -1;
mapRep[1][9].baseKey = -3;
mapRep[1][9].fringeKey = -1;
mapRep[2][9].baseKey = -3;
mapRep[2][9].fringeKey = -1;
mapRep[3][9].baseKey = -3;
mapRep[3][9].fringeKey = -1;
mapRep[4][9].baseKey = -3;
mapRep[4][9].fringeKey = -1;
mapRep[5][9].baseKey = -3;
mapRep[5][9].fringeKey = -1;
mapRep[6][9].baseKey = -3;
mapRep[6][9].fringeKey = -1;
mapRep[7][9].baseKey = -3;
mapRep[7][9].fringeKey = -1;
mapRep[8][9].baseKey = -3;
mapRep[8][9].fringeKey = -1;
mapRep[9][9].baseKey = -3;
mapRep[9][9].fringeKey = -1;
mapRep[10][9].baseKey = -3;
mapRep[10][9].fringeKey = -1;
mapRep[11][9].baseKey = -3;
mapRep[11][9].fringeKey = -1;
mapRep[12][9].baseKey = -3;
mapRep[12][9].fringeKey = -1;
mapRep[13][9].baseKey = -3;
mapRep[13][9].fringeKey = -1;
mapRep[14][9].baseKey = -3;
mapRep[14][9].fringeKey = -1;
mapRep[15][9].baseKey = -3;
mapRep[15][9].fringeKey = -1;
}

public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}
public void actionPerformed(ActionEvent e){}

protected String getImage(Employee e) // returns the url of the employee's image
{
if(e instanceof SoftwareDeveloper)
{
SoftwareDeveloper p = (SoftwareDeveloper)e;
if(p.getName().equals("Robert"))
{
return "/simse/gui/icons/chris.gif";
}
else if(p.getName().equals("Joyce"))
{
return "/simse/gui/icons/Barbara.gif";
}
else if(p.getName().equals("Peg"))
{
return "/simse/gui/icons/Emilyv2.gif";
}
else if(p.getName().equals("Reda"))
{
return "/simse/gui/icons/anita2.png";
}
else if(p.getName().equals("Timothy"))
{
return "/simse/gui/icons/dourish.gif";
}
else if(p.getName().equals("Sigfreido"))
{
return "/simse/gui/icons/boss.gif";
}
}
else if(e instanceof Manager)
{
Manager p = (Manager)e;
if(p.getName().equals("Chang"))
{
return "/simse/gui/icons/mgr.png";
}
}
else if(e instanceof CustomerRep)
{
CustomerRep p = (CustomerRep)e;
if(p.getName().equals("Customer Wayne"))
{
return "/simse/gui/icons/pirate.png";
}
}
return null;
}
protected int[] getXYCoordinates(Employee emp) // returns the xy tile coorindates of the specified employee
{
int[] xys = {-1, -1};
if(emp instanceof SoftwareDeveloper)
{
SoftwareDeveloper p = (SoftwareDeveloper)emp;
{
if(p.getName().equals("Joyce"))
{
xys[0] = 10;
xys[1] = 5;
}
else if(p.getName().equals("Peg"))
{
xys[0] = 12;
xys[1] = 2;
}
else if(p.getName().equals("Timothy"))
{
xys[0] = 3;
xys[1] = 6;
}
else if(p.getName().equals("Robert"))
{
xys[0] = 10;
xys[1] = 6;
}
else if(p.getName().equals("Reda"))
{
xys[0] = 3;
xys[1] = 7;
}
else if(p.getName().equals("Sigfreido"))
{
xys[0] = 13;
xys[1] = 2;
}
}
}
else if(emp instanceof Manager)
{
Manager p = (Manager)emp;
{
if(p.getName().equals("Chang"))
{
xys[0] = 7;
xys[1] = 1;
}
}
}
else if(emp instanceof CustomerRep)
{
CustomerRep p = (CustomerRep)emp;
{
if(p.getName().equals("Customer Wayne"))
{
xys[0] = 1;
xys[1] = 4;
}
}
}
return xys;
}

public ArrayList getSopUsers()
{
return sopUsers;
}
protected class TileData
{
int baseKey;
int fringeKey;

public TileData(int b, int f)
{
baseKey = b;
fringeKey = f;
}

public void setBase(int b)
{
baseKey = b;
}

public void setFringe(int f)
{
fringeKey = f;
}

public Image getBase()
{
return MapData.getImage(baseKey);
}

public Image getFringe()
{
return MapData.getImage(fringeKey);
}
}
}