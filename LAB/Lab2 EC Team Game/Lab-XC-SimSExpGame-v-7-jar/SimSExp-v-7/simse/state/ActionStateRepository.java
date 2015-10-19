/* File generated by: simse.codegenerator.stategenerator.RepositoryGenerator */
package simse.state;
import simse.adts.objects.*;
import simse.adts.actions.*;
import java.util.*;
public class ActionStateRepository implements Cloneable
{
CreateUserStoriesActionStateRepository c0;
ReleasePlanningMeetingActionStateRepository r1;
StartIterationActionStateRepository s2;
IterationPlanningMeetingActionStateRepository i3;
ChooseUserStoriesForIterationActionStateRepository c4;
CreateProgrammingTasksActionStateRepository c5;
CreateAcceptanceTestsActionStateRepository c6;
DesignActionStateRepository d7;
CreateUnitTestsActionStateRepository c8;
LearnCodingStandardActionStateRepository l9;
ProgramActionStateRepository p10;
PairProgramRobertJoyceActionStateRepository p11;
PairProgramTimothyRedaActionStateRepository p12;
PairProgramPegSigfreidoActionStateRepository p13;
UnitTestingAndFixingActionStateRepository u14;
RefactorActionStateRepository r15;
IntegrateRobertJoyceActionStateRepository i16;
IntegrateTimothyRedaActionStateRepository i17;
IntegratePegSigfreidoActionStateRepository i18;
IntegrateActionStateRepository i19;
AcceptanceTestingActionStateRepository a20;
ReleaseCodeAndEndIterationActionStateRepository r21;
UpdateUserStoriesAttributesActionStateRepository u22;
SetEmployeeProductivitiesActionStateRepository s23;
UpdateProjectAttributesActionStateRepository u24;
RequireReleasePlanDoOverActionStateRepository r25;
CustomerComplainsActionStateRepository c26;
AllEmployeesIdleActionStateRepository a27;
DeliverFinalProductToCustomerActionStateRepository d28;
WarnOfImpendingDeadlineActionStateRepository w29;
GameOverActionStateRepository g30;

public ActionStateRepository()
{
c0 = new CreateUserStoriesActionStateRepository();
r1 = new ReleasePlanningMeetingActionStateRepository();
s2 = new StartIterationActionStateRepository();
i3 = new IterationPlanningMeetingActionStateRepository();
c4 = new ChooseUserStoriesForIterationActionStateRepository();
c5 = new CreateProgrammingTasksActionStateRepository();
c6 = new CreateAcceptanceTestsActionStateRepository();
d7 = new DesignActionStateRepository();
c8 = new CreateUnitTestsActionStateRepository();
l9 = new LearnCodingStandardActionStateRepository();
p10 = new ProgramActionStateRepository();
p11 = new PairProgramRobertJoyceActionStateRepository();
p12 = new PairProgramTimothyRedaActionStateRepository();
p13 = new PairProgramPegSigfreidoActionStateRepository();
u14 = new UnitTestingAndFixingActionStateRepository();
r15 = new RefactorActionStateRepository();
i16 = new IntegrateRobertJoyceActionStateRepository();
i17 = new IntegrateTimothyRedaActionStateRepository();
i18 = new IntegratePegSigfreidoActionStateRepository();
i19 = new IntegrateActionStateRepository();
a20 = new AcceptanceTestingActionStateRepository();
r21 = new ReleaseCodeAndEndIterationActionStateRepository();
u22 = new UpdateUserStoriesAttributesActionStateRepository();
s23 = new SetEmployeeProductivitiesActionStateRepository();
u24 = new UpdateProjectAttributesActionStateRepository();
r25 = new RequireReleasePlanDoOverActionStateRepository();
c26 = new CustomerComplainsActionStateRepository();
a27 = new AllEmployeesIdleActionStateRepository();
d28 = new DeliverFinalProductToCustomerActionStateRepository();
w29 = new WarnOfImpendingDeadlineActionStateRepository();
g30 = new GameOverActionStateRepository();
}

public Object clone() {
try {
ActionStateRepository cl = (ActionStateRepository) (super.clone());
cl.c0 = (CreateUserStoriesActionStateRepository)(c0.clone());
cl.r1 = (ReleasePlanningMeetingActionStateRepository)(r1.clone());
cl.s2 = (StartIterationActionStateRepository)(s2.clone());
cl.i3 = (IterationPlanningMeetingActionStateRepository)(i3.clone());
cl.c4 = (ChooseUserStoriesForIterationActionStateRepository)(c4.clone());
cl.c5 = (CreateProgrammingTasksActionStateRepository)(c5.clone());
cl.c6 = (CreateAcceptanceTestsActionStateRepository)(c6.clone());
cl.d7 = (DesignActionStateRepository)(d7.clone());
cl.c8 = (CreateUnitTestsActionStateRepository)(c8.clone());
cl.l9 = (LearnCodingStandardActionStateRepository)(l9.clone());
cl.p10 = (ProgramActionStateRepository)(p10.clone());
cl.p11 = (PairProgramRobertJoyceActionStateRepository)(p11.clone());
cl.p12 = (PairProgramTimothyRedaActionStateRepository)(p12.clone());
cl.p13 = (PairProgramPegSigfreidoActionStateRepository)(p13.clone());
cl.u14 = (UnitTestingAndFixingActionStateRepository)(u14.clone());
cl.r15 = (RefactorActionStateRepository)(r15.clone());
cl.i16 = (IntegrateRobertJoyceActionStateRepository)(i16.clone());
cl.i17 = (IntegrateTimothyRedaActionStateRepository)(i17.clone());
cl.i18 = (IntegratePegSigfreidoActionStateRepository)(i18.clone());
cl.i19 = (IntegrateActionStateRepository)(i19.clone());
cl.a20 = (AcceptanceTestingActionStateRepository)(a20.clone());
cl.r21 = (ReleaseCodeAndEndIterationActionStateRepository)(r21.clone());
cl.u22 = (UpdateUserStoriesAttributesActionStateRepository)(u22.clone());
cl.s23 = (SetEmployeeProductivitiesActionStateRepository)(s23.clone());
cl.u24 = (UpdateProjectAttributesActionStateRepository)(u24.clone());
cl.r25 = (RequireReleasePlanDoOverActionStateRepository)(r25.clone());
cl.c26 = (CustomerComplainsActionStateRepository)(c26.clone());
cl.a27 = (AllEmployeesIdleActionStateRepository)(a27.clone());
cl.d28 = (DeliverFinalProductToCustomerActionStateRepository)(d28.clone());
cl.w29 = (WarnOfImpendingDeadlineActionStateRepository)(w29.clone());
cl.g30 = (GameOverActionStateRepository)(g30.clone());
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}

public Vector<simse.adts.actions.Action> getAllActions()
{
Vector<simse.adts.actions.Action> all = new Vector<simse.adts.actions.Action>();
all.addAll(c0.getAllActions());
all.addAll(r1.getAllActions());
all.addAll(s2.getAllActions());
all.addAll(i3.getAllActions());
all.addAll(c4.getAllActions());
all.addAll(c5.getAllActions());
all.addAll(c6.getAllActions());
all.addAll(d7.getAllActions());
all.addAll(c8.getAllActions());
all.addAll(l9.getAllActions());
all.addAll(p10.getAllActions());
all.addAll(p11.getAllActions());
all.addAll(p12.getAllActions());
all.addAll(p13.getAllActions());
all.addAll(u14.getAllActions());
all.addAll(r15.getAllActions());
all.addAll(i16.getAllActions());
all.addAll(i17.getAllActions());
all.addAll(i18.getAllActions());
all.addAll(i19.getAllActions());
all.addAll(a20.getAllActions());
all.addAll(r21.getAllActions());
all.addAll(u22.getAllActions());
all.addAll(s23.getAllActions());
all.addAll(u24.getAllActions());
all.addAll(r25.getAllActions());
all.addAll(c26.getAllActions());
all.addAll(a27.getAllActions());
all.addAll(d28.getAllActions());
all.addAll(w29.getAllActions());
all.addAll(g30.getAllActions());
return all;
}

public Vector<simse.adts.actions.Action> getAllActions(SSObject a)
{
Vector<simse.adts.actions.Action> all = new Vector<simse.adts.actions.Action>();
Vector<simse.adts.actions.Action> actions = getAllActions();
for(int i=0; i<actions.size(); i++)
{
Action b = actions.elementAt(i);
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

public Vector<simse.adts.actions.Action> getAllActiveActions(SSObject a)
{
Vector<simse.adts.actions.Action> all = new Vector<simse.adts.actions.Action>();
Vector<simse.adts.actions.Action> actions = getAllActions();
for(int i=0; i<actions.size(); i++)
{
Action b = actions.elementAt(i);
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

public Vector<simse.adts.actions.Action> getAllInactiveActions(SSObject a)
{
Vector<simse.adts.actions.Action> all = new Vector<simse.adts.actions.Action>();
Vector<simse.adts.actions.Action> actions = getAllActions();
for(int i=0; i<actions.size(); i++)
{
Action b = actions.elementAt(i);
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

public void removeFromAllActions(SSObject a)
{
Vector <CreateUserStoriesAction> createuserstoriesactions = c0.getAllActions();
for(int i=0; i<createuserstoriesactions.size(); i++)
{
CreateUserStoriesAction b = createuserstoriesactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Employee)
{
b.removeCustomerRep((Employee)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <ReleasePlanningMeetingAction> releaseplanningmeetingactions = r1.getAllActions();
for(int i=0; i<releaseplanningmeetingactions.size(); i++)
{
ReleasePlanningMeetingAction b = releaseplanningmeetingactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Employee)
{
b.removeManager((Employee)a);
}
if(a instanceof Employee)
{
b.removeCustomerRep((Employee)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <StartIterationAction> startiterationactions = s2.getAllActions();
for(int i=0; i<startiterationactions.size(); i++)
{
StartIterationAction b = startiterationactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeIterationPlan((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUnitTests((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAcceptanceTests((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Employee)
{
b.removeCustomerRep((Employee)a);
}
}
Vector <IterationPlanningMeetingAction> iterationplanningmeetingactions = i3.getAllActions();
for(int i=0; i<iterationplanningmeetingactions.size(); i++)
{
IterationPlanningMeetingAction b = iterationplanningmeetingactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Employee)
{
b.removeCustomerRep((Employee)a);
}
if(a instanceof Artifact)
{
b.removeIterationPlan((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <ChooseUserStoriesForIterationAction> chooseuserstoriesforiterationactions = c4.getAllActions();
for(int i=0; i<chooseuserstoriesforiterationactions.size(); i++)
{
ChooseUserStoriesForIterationAction b = chooseuserstoriesforiterationactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeIterationPlan((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <CreateProgrammingTasksAction> createprogrammingtasksactions = c5.getAllActions();
for(int i=0; i<createprogrammingtasksactions.size(); i++)
{
CreateProgrammingTasksAction b = createprogrammingtasksactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Artifact)
{
b.removeIterationPlan((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <CreateAcceptanceTestsAction> createacceptancetestsactions = c6.getAllActions();
for(int i=0; i<createacceptancetestsactions.size(); i++)
{
CreateAcceptanceTestsAction b = createacceptancetestsactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Employee)
{
b.removeCustRep((Employee)a);
}
if(a instanceof Artifact)
{
b.removeTests((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <DesignAction> designactions = d7.getAllActions();
for(int i=0; i<designactions.size(); i++)
{
DesignAction b = designactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Tool)
{
b.removeCRCCards((Tool)a);
}
if(a instanceof Artifact)
{
b.removeDesign((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <CreateUnitTestsAction> createunittestsactions = c8.getAllActions();
for(int i=0; i<createunittestsactions.size(); i++)
{
CreateUnitTestsAction b = createunittestsactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Artifact)
{
b.removeTests((Artifact)a);
}
if(a instanceof Tool)
{
b.removeTestingFramework((Tool)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <LearnCodingStandardAction> learncodingstandardactions = l9.getAllActions();
for(int i=0; i<learncodingstandardactions.size(); i++)
{
LearnCodingStandardAction b = learncodingstandardactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Tool)
{
b.removeCodingStandard((Tool)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <ProgramAction> programactions = p10.getAllActions();
for(int i=0; i<programactions.size(); i++)
{
ProgramAction b = programactions.elementAt(i);
if(a instanceof Employee)
{
b.removeDeveloper((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Tool)
{
b.removeCodingStandard((Tool)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUnitTests((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <PairProgramRobertJoyceAction> pairprogramrobertjoyceactions = p11.getAllActions();
for(int i=0; i<pairprogramrobertjoyceactions.size(); i++)
{
PairProgramRobertJoyceAction b = pairprogramrobertjoyceactions.elementAt(i);
if(a instanceof Employee)
{
b.removeRobert((Employee)a);
}
if(a instanceof Employee)
{
b.removeJoyce((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Tool)
{
b.removeCodingStandard((Tool)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUnitTests((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <PairProgramTimothyRedaAction> pairprogramtimothyredaactions = p12.getAllActions();
for(int i=0; i<pairprogramtimothyredaactions.size(); i++)
{
PairProgramTimothyRedaAction b = pairprogramtimothyredaactions.elementAt(i);
if(a instanceof Employee)
{
b.removeTimothy((Employee)a);
}
if(a instanceof Employee)
{
b.removeReda((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Tool)
{
b.removeCodingStandard((Tool)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUnitTests((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <PairProgramPegSigfreidoAction> pairprogrampegsigfreidoactions = p13.getAllActions();
for(int i=0; i<pairprogrampegsigfreidoactions.size(); i++)
{
PairProgramPegSigfreidoAction b = pairprogrampegsigfreidoactions.elementAt(i);
if(a instanceof Employee)
{
b.removePeg((Employee)a);
}
if(a instanceof Employee)
{
b.removeSigfreido((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Tool)
{
b.removeCodingStandard((Tool)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedDesign((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUnitTests((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <UnitTestingAndFixingAction> unittestingandfixingactions = u14.getAllActions();
for(int i=0; i<unittestingandfixingactions.size(); i++)
{
UnitTestingAndFixingAction b = unittestingandfixingactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUnitTests((Artifact)a);
}
if(a instanceof Tool)
{
b.removeTestingTool((Tool)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAcceptanceTests((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <RefactorAction> refactoractions = r15.getAllActions();
for(int i=0; i<refactoractions.size(); i++)
{
RefactorAction b = refactoractions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Tool)
{
b.removeRefactoringTool((Tool)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <IntegrateRobertJoyceAction> integraterobertjoyceactions = i16.getAllActions();
for(int i=0; i<integraterobertjoyceactions.size(); i++)
{
IntegrateRobertJoyceAction b = integraterobertjoyceactions.elementAt(i);
if(a instanceof Employee)
{
b.removeRobert((Employee)a);
}
if(a instanceof Employee)
{
b.removeJoyce((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <IntegrateTimothyRedaAction> integratetimothyredaactions = i17.getAllActions();
for(int i=0; i<integratetimothyredaactions.size(); i++)
{
IntegrateTimothyRedaAction b = integratetimothyredaactions.elementAt(i);
if(a instanceof Employee)
{
b.removeTimothy((Employee)a);
}
if(a instanceof Employee)
{
b.removeReda((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <IntegratePegSigfreidoAction> integratepegsigfreidoactions = i18.getAllActions();
for(int i=0; i<integratepegsigfreidoactions.size(); i++)
{
IntegratePegSigfreidoAction b = integratepegsigfreidoactions.elementAt(i);
if(a instanceof Employee)
{
b.removePeg((Employee)a);
}
if(a instanceof Employee)
{
b.removeSigfreido((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <IntegrateAction> integrateactions = i19.getAllActions();
for(int i=0; i<integrateactions.size(); i++)
{
IntegrateAction b = integrateactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAssociatedUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <AcceptanceTestingAction> acceptancetestingactions = a20.getAllActions();
for(int i=0; i<acceptancetestingactions.size(); i++)
{
AcceptanceTestingAction b = acceptancetestingactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Customer)
{
b.removeCust((Customer)a);
}
if(a instanceof Artifact)
{
b.removeAcceptanceTestCases((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
}
Vector <ReleaseCodeAndEndIterationAction> releasecodeandenditerationactions = r21.getAllActions();
for(int i=0; i<releasecodeandenditerationactions.size(); i++)
{
ReleaseCodeAndEndIterationAction b = releasecodeandenditerationactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeAcceptanceTests((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
}
Vector <UpdateUserStoriesAttributesAction> updateuserstoriesattributesactions = u22.getAllActions();
for(int i=0; i<updateuserstoriesattributesactions.size(); i++)
{
UpdateUserStoriesAttributesAction b = updateuserstoriesattributesactions.elementAt(i);
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeCode((Artifact)a);
}
}
Vector <SetEmployeeProductivitiesAction> setemployeeproductivitiesactions = s23.getAllActions();
for(int i=0; i<setemployeeproductivitiesactions.size(); i++)
{
SetEmployeeProductivitiesAction b = setemployeeproductivitiesactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <UpdateProjectAttributesAction> updateprojectattributesactions = u24.getAllActions();
for(int i=0; i<updateprojectattributesactions.size(); i++)
{
UpdateProjectAttributesAction b = updateprojectattributesactions.elementAt(i);
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
}
Vector <RequireReleasePlanDoOverAction> requirereleaseplandooveractions = r25.getAllActions();
for(int i=0; i<requirereleaseplandooveractions.size(); i++)
{
RequireReleasePlanDoOverAction b = requirereleaseplandooveractions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeReleasePlan((Artifact)a);
}
if(a instanceof Employee)
{
b.removeCustRep((Employee)a);
}
}
Vector <CustomerComplainsAction> customercomplainsactions = c26.getAllActions();
for(int i=0; i<customercomplainsactions.size(); i++)
{
CustomerComplainsAction b = customercomplainsactions.elementAt(i);
if(a instanceof Employee)
{
b.removeCustRep((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <AllEmployeesIdleAction> allemployeesidleactions = a27.getAllActions();
for(int i=0; i<allemployeesidleactions.size(); i++)
{
AllEmployeesIdleAction b = allemployeesidleactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <DeliverFinalProductToCustomerAction> deliverfinalproducttocustomeractions = d28.getAllActions();
for(int i=0; i<deliverfinalproducttocustomeractions.size(); i++)
{
DeliverFinalProductToCustomerAction b = deliverfinalproducttocustomeractions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
if(a instanceof Artifact)
{
b.removeAcceptanceTests((Artifact)a);
}
}
Vector <WarnOfImpendingDeadlineAction> warnofimpendingdeadlineactions = w29.getAllActions();
for(int i=0; i<warnofimpendingdeadlineactions.size(); i++)
{
WarnOfImpendingDeadlineAction b = warnofimpendingdeadlineactions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
}
Vector <GameOverAction> gameoveractions = g30.getAllActions();
for(int i=0; i<gameoveractions.size(); i++)
{
GameOverAction b = gameoveractions.elementAt(i);
if(a instanceof Employee)
{
b.removeEmp((Employee)a);
}
if(a instanceof Project)
{
b.removeProj((Project)a);
}
if(a instanceof Artifact)
{
b.removeUserStories((Artifact)a);
}
}
}

public CreateUserStoriesActionStateRepository getCreateUserStoriesActionStateRepository()
{
return c0;
}
public ReleasePlanningMeetingActionStateRepository getReleasePlanningMeetingActionStateRepository()
{
return r1;
}
public StartIterationActionStateRepository getStartIterationActionStateRepository()
{
return s2;
}
public IterationPlanningMeetingActionStateRepository getIterationPlanningMeetingActionStateRepository()
{
return i3;
}
public ChooseUserStoriesForIterationActionStateRepository getChooseUserStoriesForIterationActionStateRepository()
{
return c4;
}
public CreateProgrammingTasksActionStateRepository getCreateProgrammingTasksActionStateRepository()
{
return c5;
}
public CreateAcceptanceTestsActionStateRepository getCreateAcceptanceTestsActionStateRepository()
{
return c6;
}
public DesignActionStateRepository getDesignActionStateRepository()
{
return d7;
}
public CreateUnitTestsActionStateRepository getCreateUnitTestsActionStateRepository()
{
return c8;
}
public LearnCodingStandardActionStateRepository getLearnCodingStandardActionStateRepository()
{
return l9;
}
public ProgramActionStateRepository getProgramActionStateRepository()
{
return p10;
}
public PairProgramRobertJoyceActionStateRepository getPairProgramRobertJoyceActionStateRepository()
{
return p11;
}
public PairProgramTimothyRedaActionStateRepository getPairProgramTimothyRedaActionStateRepository()
{
return p12;
}
public PairProgramPegSigfreidoActionStateRepository getPairProgramPegSigfreidoActionStateRepository()
{
return p13;
}
public UnitTestingAndFixingActionStateRepository getUnitTestingAndFixingActionStateRepository()
{
return u14;
}
public RefactorActionStateRepository getRefactorActionStateRepository()
{
return r15;
}
public IntegrateRobertJoyceActionStateRepository getIntegrateRobertJoyceActionStateRepository()
{
return i16;
}
public IntegrateTimothyRedaActionStateRepository getIntegrateTimothyRedaActionStateRepository()
{
return i17;
}
public IntegratePegSigfreidoActionStateRepository getIntegratePegSigfreidoActionStateRepository()
{
return i18;
}
public IntegrateActionStateRepository getIntegrateActionStateRepository()
{
return i19;
}
public AcceptanceTestingActionStateRepository getAcceptanceTestingActionStateRepository()
{
return a20;
}
public ReleaseCodeAndEndIterationActionStateRepository getReleaseCodeAndEndIterationActionStateRepository()
{
return r21;
}
public UpdateUserStoriesAttributesActionStateRepository getUpdateUserStoriesAttributesActionStateRepository()
{
return u22;
}
public SetEmployeeProductivitiesActionStateRepository getSetEmployeeProductivitiesActionStateRepository()
{
return s23;
}
public UpdateProjectAttributesActionStateRepository getUpdateProjectAttributesActionStateRepository()
{
return u24;
}
public RequireReleasePlanDoOverActionStateRepository getRequireReleasePlanDoOverActionStateRepository()
{
return r25;
}
public CustomerComplainsActionStateRepository getCustomerComplainsActionStateRepository()
{
return c26;
}
public AllEmployeesIdleActionStateRepository getAllEmployeesIdleActionStateRepository()
{
return a27;
}
public DeliverFinalProductToCustomerActionStateRepository getDeliverFinalProductToCustomerActionStateRepository()
{
return d28;
}
public WarnOfImpendingDeadlineActionStateRepository getWarnOfImpendingDeadlineActionStateRepository()
{
return w29;
}
public GameOverActionStateRepository getGameOverActionStateRepository()
{
return g30;
}

public Action getActionWithId(int id) {
if (c0.getActionWithId(id) != null) {
return c0.getActionWithId(id);
}
else if (r1.getActionWithId(id) != null) {
return r1.getActionWithId(id);
}
else if (s2.getActionWithId(id) != null) {
return s2.getActionWithId(id);
}
else if (i3.getActionWithId(id) != null) {
return i3.getActionWithId(id);
}
else if (c4.getActionWithId(id) != null) {
return c4.getActionWithId(id);
}
else if (c5.getActionWithId(id) != null) {
return c5.getActionWithId(id);
}
else if (c6.getActionWithId(id) != null) {
return c6.getActionWithId(id);
}
else if (d7.getActionWithId(id) != null) {
return d7.getActionWithId(id);
}
else if (c8.getActionWithId(id) != null) {
return c8.getActionWithId(id);
}
else if (l9.getActionWithId(id) != null) {
return l9.getActionWithId(id);
}
else if (p10.getActionWithId(id) != null) {
return p10.getActionWithId(id);
}
else if (p11.getActionWithId(id) != null) {
return p11.getActionWithId(id);
}
else if (p12.getActionWithId(id) != null) {
return p12.getActionWithId(id);
}
else if (p13.getActionWithId(id) != null) {
return p13.getActionWithId(id);
}
else if (u14.getActionWithId(id) != null) {
return u14.getActionWithId(id);
}
else if (r15.getActionWithId(id) != null) {
return r15.getActionWithId(id);
}
else if (i16.getActionWithId(id) != null) {
return i16.getActionWithId(id);
}
else if (i17.getActionWithId(id) != null) {
return i17.getActionWithId(id);
}
else if (i18.getActionWithId(id) != null) {
return i18.getActionWithId(id);
}
else if (i19.getActionWithId(id) != null) {
return i19.getActionWithId(id);
}
else if (a20.getActionWithId(id) != null) {
return a20.getActionWithId(id);
}
else if (r21.getActionWithId(id) != null) {
return r21.getActionWithId(id);
}
else if (u22.getActionWithId(id) != null) {
return u22.getActionWithId(id);
}
else if (s23.getActionWithId(id) != null) {
return s23.getActionWithId(id);
}
else if (u24.getActionWithId(id) != null) {
return u24.getActionWithId(id);
}
else if (r25.getActionWithId(id) != null) {
return r25.getActionWithId(id);
}
else if (c26.getActionWithId(id) != null) {
return c26.getActionWithId(id);
}
else if (a27.getActionWithId(id) != null) {
return a27.getActionWithId(id);
}
else if (d28.getActionWithId(id) != null) {
return d28.getActionWithId(id);
}
else if (w29.getActionWithId(id) != null) {
return w29.getActionWithId(id);
}
else if (g30.getActionWithId(id) != null) {
return g30.getActionWithId(id);
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
c0.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
r1.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
s2.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
i3.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
c4.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
c5.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
c6.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
d7.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
c8.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
l9.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
p10.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
p11.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
p12.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
p13.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
u14.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
r15.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
i16.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
i17.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
i18.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
i19.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
a20.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
r21.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
u22.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
s23.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
u24.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
r25.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
c26.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
a27.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
d28.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
w29.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
g30.refetchParticipants(artifactRep, customerRep, employeeRep, projectRep, toolRep);
}
}