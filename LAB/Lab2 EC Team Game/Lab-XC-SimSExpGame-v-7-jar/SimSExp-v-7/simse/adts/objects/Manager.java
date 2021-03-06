/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.objects;
public class Manager extends Employee implements Cloneable
{
private String name;
private int managernumber;

public Manager(String n0, int m1)
{
setName(n0);
setManagerNumber(m1);
}

public Object clone() {
Manager cl = (Manager)(super.clone());
cl.name = name;
cl.managernumber = managernumber;
return cl;
}

public String getName()
{
return name;
}

public void setName(String a)
{
name = a;
}

public int getManagerNumber()
{
return managernumber;
}

public void setManagerNumber(int a)
{
if(a < 0)
{
managernumber = 0;
}
else if(a > 1)
{
managernumber = 1;
}
else
{
managernumber = a;
}
}

}