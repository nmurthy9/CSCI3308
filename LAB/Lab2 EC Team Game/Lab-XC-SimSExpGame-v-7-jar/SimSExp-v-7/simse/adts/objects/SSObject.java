/* File generated by: simse.codegenerator.stategenerator.ADTGenerator */
package simse.adts.objects;
public abstract class SSObject implements Cloneable
{
public SSObject(){}

public Object clone() {
try {
SSObject cl = (SSObject) (super.clone());
return cl;
} catch (CloneNotSupportedException c) {
System.out.println(c.getMessage());
}
return null;
}
}