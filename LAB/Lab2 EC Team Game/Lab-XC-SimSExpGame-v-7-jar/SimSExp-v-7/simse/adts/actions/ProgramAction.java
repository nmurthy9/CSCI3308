/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.actions;
import simse.adts.objects.*;
import simse.state.ArtifactStateRepository;
import simse.state.CustomerStateRepository;
import simse.state.EmployeeStateRepository;
import simse.state.ProjectStateRepository;
import simse.state.ToolStateRepository;
import java.util.*;
public class ProgramAction extends Action implements Cloneable
{
private Hashtable<Employee, Boolean> developers;
private Hashtable<Artifact, Boolean> codes;
private Hashtable<Tool, Boolean> codingstandards;
private Hashtable<Artifact, Boolean> associateddesigns;
private Hashtable<Artifact, Boolean> associatedunittestss;
private Hashtable<Project, Boolean> projs;
private Hashtable<Artifact, Boolean> associateduserstoriess;
private Hashtable<Artifact, Boolean> releaseplans;
public ProgramAction()
{
developers = new Hashtable<Employee, Boolean>();
codes = new Hashtable<Artifact, Boolean>();
codingstandards = new Hashtable<Tool, Boolean>();
associateddesigns = new Hashtable<Artifact, Boolean>();
associatedunittestss = new Hashtable<Artifact, Boolean>();
projs = new Hashtable<Project, Boolean>();
associateduserstoriess = new Hashtable<Artifact, Boolean>();
releaseplans = new Hashtable<Artifact, Boolean>();
}

public Object clone() {
ProgramAction cl = (ProgramAction)(super.clone());
Hashtable<Employee, Boolean> cloneddevelopers = new Hashtable<Employee, Boolean>();
cloneddevelopers.putAll(developers);
cl.developers = cloneddevelopers;
Hashtable<Artifact, Boolean> clonedcodes = new Hashtable<Artifact, Boolean>();
clonedcodes.putAll(codes);
cl.codes = clonedcodes;
Hashtable<Tool, Boolean> clonedcodingstandards = new Hashtable<Tool, Boolean>();
clonedcodingstandards.putAll(codingstandards);
cl.codingstandards = clonedcodingstandards;
Hashtable<Artifact, Boolean> clonedassociateddesigns = new Hashtable<Artifact, Boolean>();
clonedassociateddesigns.putAll(associateddesigns);
cl.associateddesigns = clonedassociateddesigns;
Hashtable<Artifact, Boolean> clonedassociatedunittestss = new Hashtable<Artifact, Boolean>();
clonedassociatedunittestss.putAll(associatedunittestss);
cl.associatedunittestss = clonedassociatedunittestss;
Hashtable<Project, Boolean> clonedprojs = new Hashtable<Project, Boolean>();
clonedprojs.putAll(projs);
cl.projs = clonedprojs;
Hashtable<Artifact, Boolean> clonedassociateduserstoriess = new Hashtable<Artifact, Boolean>();
clonedassociateduserstoriess.putAll(associateduserstoriess);
cl.associateduserstoriess = clonedassociateduserstoriess;
Hashtable<Artifact, Boolean> clonedreleaseplans = new Hashtable<Artifact, Boolean>();
clonedreleaseplans.putAll(releaseplans);
cl.releaseplans = clonedreleaseplans;
return cl;
}

public Vector<SSObject> getAllParticipants()
{
Vector<SSObject> all = new Vector<SSObject>();
all.addAll(getAllDevelopers());
all.addAll(getAllCodes());
all.addAll(getAllCodingStandards());
all.addAll(getAllAssociatedDesigns());
all.addAll(getAllAssociatedUnitTestss());
all.addAll(getAllProjs());
all.addAll(getAllAssociatedUserStoriess());
all.addAll(getAllReleasePlans());
return all;
}
public Vector<SSObject> getAllActiveParticipants()
{
Vector<SSObject> all = new Vector<SSObject>();
all.addAll(getAllActiveDevelopers());
all.addAll(getAllActiveCodes());
all.addAll(getAllActiveCodingStandards());
all.addAll(getAllActiveAssociatedDesigns());
all.addAll(getAllActiveAssociatedUnitTestss());
all.addAll(getAllActiveProjs());
all.addAll(getAllActiveAssociatedUserStoriess());
all.addAll(getAllActiveReleasePlans());
return all;
}

public Vector<SSObject> getAllInactiveParticipants()
{
Vector<SSObject> all = new Vector<SSObject>();
all.addAll(getAllInactiveDevelopers());
all.addAll(getAllInactiveCodes());
all.addAll(getAllInactiveCodingStandards());
all.addAll(getAllInactiveAssociatedDesigns());
all.addAll(getAllInactiveAssociatedUnitTestss());
all.addAll(getAllInactiveProjs());
all.addAll(getAllInactiveAssociatedUserStoriess());
all.addAll(getAllInactiveReleasePlans());
return all;
}
public Vector<Employee> getAllDevelopers()
{
Vector<Employee>a = new Vector<Employee>();
Enumeration<Employee> e = developers.keys();
for(int i=0; i<developers.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Employee> getAllActiveDevelopers()
{
Vector<Employee> a = new Vector<Employee>();
Enumeration<Employee> e = developers.keys();
for(int i=0; i<developers.size(); i++)
{
Employee key = e.nextElement();
if((developers.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Employee> getAllInactiveDevelopers()
{
Vector<Employee> a = new Vector<Employee>();
Enumeration<Employee> e = developers.keys();
for(int i=0; i<developers.size(); i++)
{
Employee key = e.nextElement();
if((developers.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addDeveloper(Employee a)
{
if((developers.containsKey(a)) ||( ((a instanceof SoftwareDeveloper) == false)))
{
return false;
}
else
{
developers.put(a, new Boolean(true));
return true;
}
}

public boolean removeDeveloper(Employee a)
{
if(developers.containsKey(a))
{
developers.remove(a);
return true;
}
return false;
}

public boolean setDeveloperActive(Employee a)
{
if(developers.containsKey(a))
{
developers.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setDeveloperInactive(Employee a)
{
if(developers.containsKey(a))
{
developers.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Artifact> getAllCodes()
{
Vector<Artifact>a = new Vector<Artifact>();
Enumeration<Artifact> e = codes.keys();
for(int i=0; i<codes.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Artifact> getAllActiveCodes()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = codes.keys();
for(int i=0; i<codes.size(); i++)
{
Artifact key = e.nextElement();
if((codes.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Artifact> getAllInactiveCodes()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = codes.keys();
for(int i=0; i<codes.size(); i++)
{
Artifact key = e.nextElement();
if((codes.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addCode(Artifact a)
{
if((codes.containsKey(a)) ||( ((a instanceof Code) == false)) || (codes.size() >= 1))
{
return false;
}
else
{
codes.put(a, new Boolean(true));
return true;
}
}

public boolean removeCode(Artifact a)
{
if(codes.containsKey(a))
{
codes.remove(a);
return true;
}
return false;
}

public boolean setCodeActive(Artifact a)
{
if(codes.containsKey(a))
{
codes.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setCodeInactive(Artifact a)
{
if(codes.containsKey(a))
{
codes.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Tool> getAllCodingStandards()
{
Vector<Tool>a = new Vector<Tool>();
Enumeration<Tool> e = codingstandards.keys();
for(int i=0; i<codingstandards.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Tool> getAllActiveCodingStandards()
{
Vector<Tool> a = new Vector<Tool>();
Enumeration<Tool> e = codingstandards.keys();
for(int i=0; i<codingstandards.size(); i++)
{
Tool key = e.nextElement();
if((codingstandards.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Tool> getAllInactiveCodingStandards()
{
Vector<Tool> a = new Vector<Tool>();
Enumeration<Tool> e = codingstandards.keys();
for(int i=0; i<codingstandards.size(); i++)
{
Tool key = e.nextElement();
if((codingstandards.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addCodingStandard(Tool a)
{
if((codingstandards.containsKey(a)) ||( ((a instanceof CodingStandard) == false)) || (codingstandards.size() >= 1))
{
return false;
}
else
{
codingstandards.put(a, new Boolean(true));
return true;
}
}

public boolean removeCodingStandard(Tool a)
{
if(codingstandards.containsKey(a))
{
codingstandards.remove(a);
return true;
}
return false;
}

public boolean setCodingStandardActive(Tool a)
{
if(codingstandards.containsKey(a))
{
codingstandards.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setCodingStandardInactive(Tool a)
{
if(codingstandards.containsKey(a))
{
codingstandards.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Artifact> getAllAssociatedDesigns()
{
Vector<Artifact>a = new Vector<Artifact>();
Enumeration<Artifact> e = associateddesigns.keys();
for(int i=0; i<associateddesigns.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Artifact> getAllActiveAssociatedDesigns()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associateddesigns.keys();
for(int i=0; i<associateddesigns.size(); i++)
{
Artifact key = e.nextElement();
if((associateddesigns.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Artifact> getAllInactiveAssociatedDesigns()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associateddesigns.keys();
for(int i=0; i<associateddesigns.size(); i++)
{
Artifact key = e.nextElement();
if((associateddesigns.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addAssociatedDesign(Artifact a)
{
if((associateddesigns.containsKey(a)) ||( ((a instanceof Design) == false)) || (associateddesigns.size() >= 1))
{
return false;
}
else
{
associateddesigns.put(a, new Boolean(true));
return true;
}
}

public boolean removeAssociatedDesign(Artifact a)
{
if(associateddesigns.containsKey(a))
{
associateddesigns.remove(a);
return true;
}
return false;
}

public boolean setAssociatedDesignActive(Artifact a)
{
if(associateddesigns.containsKey(a))
{
associateddesigns.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setAssociatedDesignInactive(Artifact a)
{
if(associateddesigns.containsKey(a))
{
associateddesigns.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Artifact> getAllAssociatedUnitTestss()
{
Vector<Artifact>a = new Vector<Artifact>();
Enumeration<Artifact> e = associatedunittestss.keys();
for(int i=0; i<associatedunittestss.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Artifact> getAllActiveAssociatedUnitTestss()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associatedunittestss.keys();
for(int i=0; i<associatedunittestss.size(); i++)
{
Artifact key = e.nextElement();
if((associatedunittestss.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Artifact> getAllInactiveAssociatedUnitTestss()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associatedunittestss.keys();
for(int i=0; i<associatedunittestss.size(); i++)
{
Artifact key = e.nextElement();
if((associatedunittestss.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addAssociatedUnitTests(Artifact a)
{
if((associatedunittestss.containsKey(a)) ||( ((a instanceof UnitTests) == false)) || (associatedunittestss.size() >= 1))
{
return false;
}
else
{
associatedunittestss.put(a, new Boolean(true));
return true;
}
}

public boolean removeAssociatedUnitTests(Artifact a)
{
if(associatedunittestss.containsKey(a))
{
associatedunittestss.remove(a);
return true;
}
return false;
}

public boolean setAssociatedUnitTestsActive(Artifact a)
{
if(associatedunittestss.containsKey(a))
{
associatedunittestss.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setAssociatedUnitTestsInactive(Artifact a)
{
if(associatedunittestss.containsKey(a))
{
associatedunittestss.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Project> getAllProjs()
{
Vector<Project>a = new Vector<Project>();
Enumeration<Project> e = projs.keys();
for(int i=0; i<projs.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Project> getAllActiveProjs()
{
Vector<Project> a = new Vector<Project>();
Enumeration<Project> e = projs.keys();
for(int i=0; i<projs.size(); i++)
{
Project key = e.nextElement();
if((projs.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Project> getAllInactiveProjs()
{
Vector<Project> a = new Vector<Project>();
Enumeration<Project> e = projs.keys();
for(int i=0; i<projs.size(); i++)
{
Project key = e.nextElement();
if((projs.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addProj(Project a)
{
if((projs.containsKey(a)) ||( ((a instanceof TheProject) == false)) || (projs.size() >= 1))
{
return false;
}
else
{
projs.put(a, new Boolean(true));
return true;
}
}

public boolean removeProj(Project a)
{
if(projs.containsKey(a))
{
projs.remove(a);
return true;
}
return false;
}

public boolean setProjActive(Project a)
{
if(projs.containsKey(a))
{
projs.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setProjInactive(Project a)
{
if(projs.containsKey(a))
{
projs.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Artifact> getAllAssociatedUserStoriess()
{
Vector<Artifact>a = new Vector<Artifact>();
Enumeration<Artifact> e = associateduserstoriess.keys();
for(int i=0; i<associateduserstoriess.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Artifact> getAllActiveAssociatedUserStoriess()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associateduserstoriess.keys();
for(int i=0; i<associateduserstoriess.size(); i++)
{
Artifact key = e.nextElement();
if((associateduserstoriess.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Artifact> getAllInactiveAssociatedUserStoriess()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = associateduserstoriess.keys();
for(int i=0; i<associateduserstoriess.size(); i++)
{
Artifact key = e.nextElement();
if((associateduserstoriess.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addAssociatedUserStories(Artifact a)
{
if((associateduserstoriess.containsKey(a)) ||( ((a instanceof UserStories) == false)) || (associateduserstoriess.size() >= 1))
{
return false;
}
else
{
associateduserstoriess.put(a, new Boolean(true));
return true;
}
}

public boolean removeAssociatedUserStories(Artifact a)
{
if(associateduserstoriess.containsKey(a))
{
associateduserstoriess.remove(a);
return true;
}
return false;
}

public boolean setAssociatedUserStoriesActive(Artifact a)
{
if(associateduserstoriess.containsKey(a))
{
associateduserstoriess.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setAssociatedUserStoriesInactive(Artifact a)
{
if(associateduserstoriess.containsKey(a))
{
associateduserstoriess.put(a, new Boolean(false));
return true;
}
return false;
}
public Vector<Artifact> getAllReleasePlans()
{
Vector<Artifact>a = new Vector<Artifact>();
Enumeration<Artifact> e = releaseplans.keys();
for(int i=0; i<releaseplans.size(); i++)
{
a.add(e.nextElement());
}
return a;
}

public Vector<Artifact> getAllActiveReleasePlans()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = releaseplans.keys();
for(int i=0; i<releaseplans.size(); i++)
{
Artifact key = e.nextElement();
if((releaseplans.get(key)).booleanValue() == true)
{
a.add(key);
}
}
return a;
}

public Vector<Artifact> getAllInactiveReleasePlans()
{
Vector<Artifact> a = new Vector<Artifact>();
Enumeration<Artifact> e = releaseplans.keys();
for(int i=0; i<releaseplans.size(); i++)
{
Artifact key = e.nextElement();
if((releaseplans.get(key)).booleanValue() == false)
{
a.add(key);
}
}
return a;
}

public boolean addReleasePlan(Artifact a)
{
if((releaseplans.containsKey(a)) ||( ((a instanceof ReleasePlan) == false)) || (releaseplans.size() >= 1))
{
return false;
}
else
{
releaseplans.put(a, new Boolean(true));
return true;
}
}

public boolean removeReleasePlan(Artifact a)
{
if(releaseplans.containsKey(a))
{
releaseplans.remove(a);
return true;
}
return false;
}

public boolean setReleasePlanActive(Artifact a)
{
if(releaseplans.containsKey(a))
{
releaseplans.put(a, new Boolean(true));
return true;
}
return false;
}

public boolean setReleasePlanInactive(Artifact a)
{
if(releaseplans.containsKey(a))
{
releaseplans.put(a, new Boolean(false));
return true;
}
return false;
}
/*
* Replaces all the participants in this action with their equivalent objects
* in the current state. Calling this function solves the problem that happens
* when you clone actions -- their hashtables point to participant objects
* that were part of the previous, non-cloned state. Hence, this function
* should be called after this object is cloned.
*/
public void refetchParticipants(ArtifactStateRepository artifactRep, CustomerStateRepository customerRep, EmployeeStateRepository employeeRep, ProjectStateRepository projectRep, ToolStateRepository toolRep) {
// developer participants:
Hashtable<Employee, Boolean> newDevelopers = new Hashtable<Employee, Boolean>();
Iterator<Map.Entry<Employee, Boolean>> developersIterator = developers.entrySet().iterator();
while (developersIterator.hasNext()) {
Map.Entry<Employee, Boolean> entry = developersIterator.next();
Employee oldDeveloper = entry.getKey();
if (oldDeveloper instanceof SoftwareDeveloper) {
Employee newDeveloper = employeeRep.getSoftwareDeveloperStateRepository().get(((SoftwareDeveloper)oldDeveloper).getName());
Boolean activeStatus = developers.get(oldDeveloper);
newDevelopers.put(newDeveloper, activeStatus);
}
}
developers.clear();
developers.putAll(newDevelopers);

// code participants:
Hashtable<Artifact, Boolean> newCodes = new Hashtable<Artifact, Boolean>();
Iterator<Map.Entry<Artifact, Boolean>> codesIterator = codes.entrySet().iterator();
while (codesIterator.hasNext()) {
Map.Entry<Artifact, Boolean> entry = codesIterator.next();
Artifact oldCode = entry.getKey();
if (oldCode instanceof Code) {
Artifact newCode = artifactRep.getCodeStateRepository().get(((Code)oldCode).getDescription());
Boolean activeStatus = codes.get(oldCode);
newCodes.put(newCode, activeStatus);
}
}
codes.clear();
codes.putAll(newCodes);

// codingstandard participants:
Hashtable<Tool, Boolean> newCodingStandards = new Hashtable<Tool, Boolean>();
Iterator<Map.Entry<Tool, Boolean>> codingstandardsIterator = codingstandards.entrySet().iterator();
while (codingstandardsIterator.hasNext()) {
Map.Entry<Tool, Boolean> entry = codingstandardsIterator.next();
Tool oldCodingStandard = entry.getKey();
if (oldCodingStandard instanceof CodingStandard) {
Tool newCodingStandard = toolRep.getCodingStandardStateRepository().get(((CodingStandard)oldCodingStandard).getDescription());
Boolean activeStatus = codingstandards.get(oldCodingStandard);
newCodingStandards.put(newCodingStandard, activeStatus);
}
}
codingstandards.clear();
codingstandards.putAll(newCodingStandards);

// associateddesign participants:
Hashtable<Artifact, Boolean> newAssociatedDesigns = new Hashtable<Artifact, Boolean>();
Iterator<Map.Entry<Artifact, Boolean>> associateddesignsIterator = associateddesigns.entrySet().iterator();
while (associateddesignsIterator.hasNext()) {
Map.Entry<Artifact, Boolean> entry = associateddesignsIterator.next();
Artifact oldAssociatedDesign = entry.getKey();
if (oldAssociatedDesign instanceof Design) {
Artifact newAssociatedDesign = artifactRep.getDesignStateRepository().get(((Design)oldAssociatedDesign).getDescription());
Boolean activeStatus = associateddesigns.get(oldAssociatedDesign);
newAssociatedDesigns.put(newAssociatedDesign, activeStatus);
}
}
associateddesigns.clear();
associateddesigns.putAll(newAssociatedDesigns);

// associatedunittests participants:
Hashtable<Artifact, Boolean> newAssociatedUnitTestss = new Hashtable<Artifact, Boolean>();
Iterator<Map.Entry<Artifact, Boolean>> associatedunittestssIterator = associatedunittestss.entrySet().iterator();
while (associatedunittestssIterator.hasNext()) {
Map.Entry<Artifact, Boolean> entry = associatedunittestssIterator.next();
Artifact oldAssociatedUnitTests = entry.getKey();
if (oldAssociatedUnitTests instanceof UnitTests) {
Artifact newAssociatedUnitTests = artifactRep.getUnitTestsStateRepository().get(((UnitTests)oldAssociatedUnitTests).getDescription());
Boolean activeStatus = associatedunittestss.get(oldAssociatedUnitTests);
newAssociatedUnitTestss.put(newAssociatedUnitTests, activeStatus);
}
}
associatedunittestss.clear();
associatedunittestss.putAll(newAssociatedUnitTestss);

// proj participants:
Hashtable<Project, Boolean> newProjs = new Hashtable<Project, Boolean>();
Iterator<Map.Entry<Project, Boolean>> projsIterator = projs.entrySet().iterator();
while (projsIterator.hasNext()) {
Map.Entry<Project, Boolean> entry = projsIterator.next();
Project oldProj = entry.getKey();
if (oldProj instanceof TheProject) {
Project newProj = projectRep.getTheProjectStateRepository().get(((TheProject)oldProj).getName());
Boolean activeStatus = projs.get(oldProj);
newProjs.put(newProj, activeStatus);
}
}
projs.clear();
projs.putAll(newProjs);

// associateduserstories participants:
Hashtable<Artifact, Boolean> newAssociatedUserStoriess = new Hashtable<Artifact, Boolean>();
Iterator<Map.Entry<Artifact, Boolean>> associateduserstoriessIterator = associateduserstoriess.entrySet().iterator();
while (associateduserstoriessIterator.hasNext()) {
Map.Entry<Artifact, Boolean> entry = associateduserstoriessIterator.next();
Artifact oldAssociatedUserStories = entry.getKey();
if (oldAssociatedUserStories instanceof UserStories) {
Artifact newAssociatedUserStories = artifactRep.getUserStoriesStateRepository().get(((UserStories)oldAssociatedUserStories).getName());
Boolean activeStatus = associateduserstoriess.get(oldAssociatedUserStories);
newAssociatedUserStoriess.put(newAssociatedUserStories, activeStatus);
}
}
associateduserstoriess.clear();
associateduserstoriess.putAll(newAssociatedUserStoriess);

// releaseplan participants:
Hashtable<Artifact, Boolean> newReleasePlans = new Hashtable<Artifact, Boolean>();
Iterator<Map.Entry<Artifact, Boolean>> releaseplansIterator = releaseplans.entrySet().iterator();
while (releaseplansIterator.hasNext()) {
Map.Entry<Artifact, Boolean> entry = releaseplansIterator.next();
Artifact oldReleasePlan = entry.getKey();
if (oldReleasePlan instanceof ReleasePlan) {
Artifact newReleasePlan = artifactRep.getReleasePlanStateRepository().get(((ReleasePlan)oldReleasePlan).getName());
Boolean activeStatus = releaseplans.get(oldReleasePlan);
newReleasePlans.put(newReleasePlan, activeStatus);
}
}
releaseplans.clear();
releaseplans.putAll(newReleasePlans);

}
}