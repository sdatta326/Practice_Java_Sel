package AA;

interface Newspaper
{
	static final int i=10;//interface only supported public,static and final
	public void showmews();//public,static,abstract,default,strictfp
}

interface Magazine
{
	public void showmewsmaga();
}

class s implements  Newspaper,Magazine
{

	@Override
	public void showmews() {
		// TODO Auto-generated method stub
		System.out.println("show news"+i);
		
	}

	@Override
	public void showmewsmaga() {
		// TODO Auto-generated method stub
		System.out.println("show magazine");
	}
	
}
public class InterfaceP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s o1=new s();
		o1.showmews();
		o1.showmewsmaga();
		//System.out.println(o1.showmews()+" "+o1.showmewsmaga()); method calling not print in output
	
		

	}

}
