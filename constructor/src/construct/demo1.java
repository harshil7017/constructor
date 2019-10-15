package construct;

public class demo1 
{

	
	private static final String String = null;
	public  demo1(String name)
	{
		
		System.out.println("name is :"+name);
		
	}
	public demo1(int a,int b)
	{
		 
		 int c=a+b;
		 
		System.out.println("addition of value is:"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 demo=new demo1("tommy");
		demo1 de=new demo1(10,20);
	}

}
