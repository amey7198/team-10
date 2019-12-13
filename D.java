class A
{
	void m1()
	{
		System.out.println("m1:A");
	}
}
class B extends A
{
	void m2()
	{
	System.out.println("m2:B");
	}
}
class C extends B
{
	void m3()
	{
	System.out.println("m3:C");
	}
}
class D 
{
public static void main(String args[])
{
 C d=new C();
d.m1();
d.m2();
d.m3();	
}
}