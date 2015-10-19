/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.objects;
public class SoftwareDeveloper extends Employee implements Cloneable
{
private String name;
private String softwaredevelopmentexperience;
private int softwaredevelopmentexperiencenumerical;
private boolean initerationplanningmeeting;
private double productivity;
private boolean knowscodingstandard;
private double knowscodingstandardnumerical;
private boolean programming;
private boolean integrating;
private int numprogrammingactions;
private int repnumber;
private boolean idle;

public SoftwareDeveloper(String n0, String s1, int s2, boolean i3, double p4, boolean k5, double k6, boolean p7, boolean i8, int n9, int r10, boolean i11)
{
setName(n0);
setSoftwareDevelopmentExperience(s1);
setSoftwareDevelopmentExperienceNumerical(s2);
setInIterationPlanningMeeting(i3);
setProductivity(p4);
setKnowsCodingStandard(k5);
setKnowsCodingStandardNumerical(k6);
setProgramming(p7);
setIntegrating(i8);
setNumProgrammingActions(n9);
setRepNumber(r10);
setIdle(i11);
}

public Object clone() {
SoftwareDeveloper cl = (SoftwareDeveloper)(super.clone());
cl.name = name;
cl.softwaredevelopmentexperience = softwaredevelopmentexperience;
cl.softwaredevelopmentexperiencenumerical = softwaredevelopmentexperiencenumerical;
cl.initerationplanningmeeting = initerationplanningmeeting;
cl.productivity = productivity;
cl.knowscodingstandard = knowscodingstandard;
cl.knowscodingstandardnumerical = knowscodingstandardnumerical;
cl.programming = programming;
cl.integrating = integrating;
cl.numprogrammingactions = numprogrammingactions;
cl.repnumber = repnumber;
cl.idle = idle;
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

public String getSoftwareDevelopmentExperience()
{
return softwaredevelopmentexperience;
}

public void setSoftwareDevelopmentExperience(String a)
{
softwaredevelopmentexperience = a;
}

public int getSoftwareDevelopmentExperienceNumerical()
{
return softwaredevelopmentexperiencenumerical;
}

public void setSoftwareDevelopmentExperienceNumerical(int a)
{
if(a < 0)
{
softwaredevelopmentexperiencenumerical = 0;
}
else if(a > 10)
{
softwaredevelopmentexperiencenumerical = 10;
}
else
{
softwaredevelopmentexperiencenumerical = a;
}
}

public boolean getInIterationPlanningMeeting()
{
return initerationplanningmeeting;
}

public void setInIterationPlanningMeeting(boolean a)
{
initerationplanningmeeting = a;
}

public double getProductivity()
{
return productivity;
}

public void setProductivity(double a)
{
if(a < 0.0)
{
productivity = 0.0;
}
else
{
productivity = a;
}
}

public boolean getKnowsCodingStandard()
{
return knowscodingstandard;
}

public void setKnowsCodingStandard(boolean a)
{
knowscodingstandard = a;
}

public double getKnowsCodingStandardNumerical()
{
return knowscodingstandardnumerical;
}

public void setKnowsCodingStandardNumerical(double a)
{
if(a < 0.0)
{
knowscodingstandardnumerical = 0.0;
}
else if(a > 1.0)
{
knowscodingstandardnumerical = 1.0;
}
else
{
knowscodingstandardnumerical = a;
}
}

public boolean getProgramming()
{
return programming;
}

public void setProgramming(boolean a)
{
programming = a;
}

public boolean getIntegrating()
{
return integrating;
}

public void setIntegrating(boolean a)
{
integrating = a;
}

public int getNumProgrammingActions()
{
return numprogrammingactions;
}

public void setNumProgrammingActions(int a)
{
if(a < 0)
{
numprogrammingactions = 0;
}
else
{
numprogrammingactions = a;
}
}

public int getRepNumber()
{
return repnumber;
}

public void setRepNumber(int a)
{
if(a < 0)
{
repnumber = 0;
}
else if(a > 1)
{
repnumber = 1;
}
else
{
repnumber = a;
}
}

public boolean getIdle()
{
return idle;
}

public void setIdle(boolean a)
{
idle = a;
}

}