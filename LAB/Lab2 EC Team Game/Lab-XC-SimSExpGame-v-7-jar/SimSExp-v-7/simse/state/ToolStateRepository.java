/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import java.util.*;

public class ToolStateRepository implements Cloneable
{
CRCCardsStateRepository c0;
UnitTestingFrameworkStateRepository u1;
CodingStandardStateRepository c2;
RefactoringToolStateRepository r3;

public ToolStateRepository()
{
c0 = new CRCCardsStateRepository();
u1 = new UnitTestingFrameworkStateRepository();
c2 = new CodingStandardStateRepository();
r3 = new RefactoringToolStateRepository();
}

public Object clone() {
try {
ToolStateRepository cl = (ToolStateRepository) (super.clone());
cl.c0 = (CRCCardsStateRepository)(c0.clone());
cl.u1 = (UnitTestingFrameworkStateRepository)(u1.clone());
cl.c2 = (CodingStandardStateRepository)(c2.clone());
cl.r3 = (RefactoringToolStateRepository)(r3.clone());
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public Vector<Tool> getAll()
{
Vector<Tool> all = new Vector<Tool>();
all.addAll(c0.getAll());
all.addAll(u1.getAll());
all.addAll(c2.getAll());
all.addAll(r3.getAll());
return all;
}

public CRCCardsStateRepository getCRCCardsStateRepository()
{
return c0;
}
public UnitTestingFrameworkStateRepository getUnitTestingFrameworkStateRepository()
{
return u1;
}
public CodingStandardStateRepository getCodingStandardStateRepository()
{
return c2;
}
public RefactoringToolStateRepository getRefactoringToolStateRepository()
{
return r3;
}
}