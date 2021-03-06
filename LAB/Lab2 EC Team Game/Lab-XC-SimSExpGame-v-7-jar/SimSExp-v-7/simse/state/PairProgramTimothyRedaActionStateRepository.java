/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import simse.adts.actions.*;
import java.util.*;

public class PairProgramTimothyRedaActionStateRepository implements Cloneable
{
private Vector<PairProgramTimothyRedaAction> actions;

public PairProgramTimothyRedaActionStateRepository()
{
actions = new Vector<PairProgramTimothyRedaAction>();
}

public Object clone() {
try {
PairProgramTimothyRedaActionStateRepository cl = (PairProgramTimothyRedaActionStateRepository) (super.clone());
Vector<PairProgramTimothyRedaAction> clonedActions = new Vector<PairProgramTimothyRedaAction>();
for (int i = 0; i < actions.size(); i++) {
clonedActions.add((PairProgramTimothyRedaAction)actions.elementAt(i).clone());
}
cl.actions = clonedActions;
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public boolean add(PairProgramTimothyRedaAction a)
{
if(actions.contains(a) == false)
{
actions.add(a);
return true;
}
return false;
}

public boolean remove(PairProgramTimothyRedaAction a)
{
if(actions.contains(a))
{
actions.remove(a);
return true;
}
return false;
}

public Vector<PairProgramTimothyRedaAction> getAllActions()
{
return actions;
}

public Vector<PairProgramTimothyRedaAction> getAllActions(SSObject a)
{
Vector<PairProgramTimothyRedaAction> all = new Vector<PairProgramTimothyRedaAction>();
for(int i=0; i<actions.size(); i++)
{
PairProgramTimothyRedaAction b = actions.elementAt(i);
Vector<SSObject> parts = b.getAllParticipants();
for(int j=0; j<parts.size(); j++)
{
if(parts.elementAt(j).equals(a))
{
all.add(b);
break;
}
}
}
return all;
}

public Vector<PairProgramTimothyRedaAction> getAllActiveActions(SSObject a)
{
Vector<PairProgramTimothyRedaAction> all = new Vector<PairProgramTimothyRedaAction>();
for(int i=0; i<actions.size(); i++)
{
PairProgramTimothyRedaAction b = actions.elementAt(i);
Vector<SSObject> parts = b.getAllActiveParticipants();
for(int j=0; j<parts.size(); j++)
{
if(parts.elementAt(j).equals(a))
{
all.add(b);
break;
}
}
}
return all;
}

public Vector<PairProgramTimothyRedaAction> getAllInactiveActions(SSObject a)
{
Vector<PairProgramTimothyRedaAction> all = new Vector<PairProgramTimothyRedaAction>();
for(int i=0; i<actions.size(); i++)
{
PairProgramTimothyRedaAction b = actions.elementAt(i);
Vector<SSObject> parts = b.getAllInactiveParticipants();
for(int j=0; j<parts.size(); j++)
{
if(parts.elementAt(j).equals(a))
{
all.add(b);
break;
}
}
}
return all;
}

public PairProgramTimothyRedaAction getActionWithId(int id) {
for (int i = 0; i < actions.size(); i++) {
PairProgramTimothyRedaAction act = actions.get(i);
if (act.getId() == id) {
return act;
}
}
return null;
}

/*
* Replaces all the participants in each action with their equivalent objects
* in the current state. Calling this function solves the problem that
* happens when you clone actions -- their hashtables point to participant
* objects that were part of the previous, non-cloned state.
* Hence, this function should be called after this object is cloned.
*/
public void refetchParticipants(ArtifactStateRepository artifactRep, CustomerStateRepository customerRep, EmployeeStateRepository employeeRep, ProjectStateRepository projectRep, ToolStateRepository toolRep) {
for (int i = 0; i < actions.size(); i++) {
PairProgramTimothyRedaAction act = actions.elementAt(i);
act.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);}
}
}