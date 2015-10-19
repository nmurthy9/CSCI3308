/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import simse.adts.actions.*;
import java.util.*;

public class CreateProgrammingTasksActionStateRepository implements Cloneable
{
private Vector<CreateProgrammingTasksAction> actions;

public CreateProgrammingTasksActionStateRepository()
{
actions = new Vector<CreateProgrammingTasksAction>();
}

public Object clone() {
try {
CreateProgrammingTasksActionStateRepository cl = (CreateProgrammingTasksActionStateRepository) (super.clone());
Vector<CreateProgrammingTasksAction> clonedActions = new Vector<CreateProgrammingTasksAction>();
for (int i = 0; i < actions.size(); i++) {
clonedActions.add((CreateProgrammingTasksAction)actions.elementAt(i).clone());
}
cl.actions = clonedActions;
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public boolean add(CreateProgrammingTasksAction a)
{
if(actions.contains(a) == false)
{
actions.add(a);
return true;
}
return false;
}

public boolean remove(CreateProgrammingTasksAction a)
{
if(actions.contains(a))
{
actions.remove(a);
return true;
}
return false;
}

public Vector<CreateProgrammingTasksAction> getAllActions()
{
return actions;
}

public Vector<CreateProgrammingTasksAction> getAllActions(SSObject a)
{
Vector<CreateProgrammingTasksAction> all = new Vector<CreateProgrammingTasksAction>();
for(int i=0; i<actions.size(); i++)
{
CreateProgrammingTasksAction b = actions.elementAt(i);
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

public Vector<CreateProgrammingTasksAction> getAllActiveActions(SSObject a)
{
Vector<CreateProgrammingTasksAction> all = new Vector<CreateProgrammingTasksAction>();
for(int i=0; i<actions.size(); i++)
{
CreateProgrammingTasksAction b = actions.elementAt(i);
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

public Vector<CreateProgrammingTasksAction> getAllInactiveActions(SSObject a)
{
Vector<CreateProgrammingTasksAction> all = new Vector<CreateProgrammingTasksAction>();
for(int i=0; i<actions.size(); i++)
{
CreateProgrammingTasksAction b = actions.elementAt(i);
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

public CreateProgrammingTasksAction getActionWithId(int id) {
for (int i = 0; i < actions.size(); i++) {
CreateProgrammingTasksAction act = actions.get(i);
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
CreateProgrammingTasksAction act = actions.elementAt(i);
act.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);}
}
}