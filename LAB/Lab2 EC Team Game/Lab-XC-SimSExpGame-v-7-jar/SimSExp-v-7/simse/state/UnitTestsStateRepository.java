/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import java.util.*;
public class UnitTestsStateRepository implements Cloneable
{
private Vector <UnitTests> unittestss;

public UnitTestsStateRepository()
{
unittestss = new Vector<UnitTests>();
}

public Object clone() {
try {
UnitTestsStateRepository cl = (UnitTestsStateRepository) super.clone();
Vector<UnitTests> clonedunittestss = new Vector<UnitTests>();
for (int i = 0; i < unittestss.size(); i++) {
clonedunittestss.addElement((UnitTests)(unittestss.elementAt(i).clone()));
}
cl.unittestss = clonedunittestss;
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public void add(UnitTests a)
{
boolean add = true;
for(int i=0; i<unittestss.size(); i++)
{
UnitTests unittests = unittestss.elementAt(i);
if(unittests.getDescription().equals(a.getDescription()))
{
add = false;
break;
}
}
if(add)
{
unittestss.add(a);
}
}

public UnitTests get(String description)
{
for(int i=0; i<unittestss.size(); i++)
{
if(unittestss.elementAt(i).getDescription().equals(description))
{
return unittestss.elementAt(i);
}
}
return null;
}

public Vector<UnitTests> getAll()
{
return unittestss;
}

public boolean remove(UnitTests a)
{
return unittestss.remove(a);
}
}