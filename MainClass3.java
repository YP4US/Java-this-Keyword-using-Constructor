//To elucidate concept of "this() statement" it's not keyword(this)  using Constructor OverLoading Concept
//Name: Yogesh Pawar      Date: 16/08/2017
class Demo1
{
	Demo1()
	{
		this(10);
		System.out.println("Running Demo1 Zero arg Constructor of Demo1 class...");
	}

	Demo1( int arg)
	{
		this(12,12.12);
		System.out.println("Running Demo2 int arg Constructor of Demo2 Class...");
	}	

	Demo1(int arg, double args)
	{
		System.out.println("Running Demo3 multiple args Constructor of Demo3 class...");
	}
}

class MainClass3
{
	public static void main(String arg[])
	{
		Demo1 d1=new Demo1();
	}
}