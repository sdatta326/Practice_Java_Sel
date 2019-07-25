/**
 * 
 */
/**
 * @author ibm
 *
 */
package AA;

public class p
{

private int i=20;
int j=20;
protected int k=30;
public int l=40;

void show()
{
	System.out.println(i+j+k+l);
}

}

class sp
{
	 p o1=new p();
	void show()
	{
		System.out.println(o1.j+o1.k+o1.l+"hello first package");
	}
}