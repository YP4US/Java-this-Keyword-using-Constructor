//to elucidate this keyword using constructor
//Yogesh Pawar
class Demo 
{
	int prn;
	String name;
	 /*If we give arguments same name as same instance variable as prn and name
		Here we are just reassigning value of Local variable(as arguments) with same 
		value, and this assignment will not affect global variable and will show default vaues
											*/
/*
	Demo(int prn,String name)  //if we execute this comment code it will give output like-  Prn is:0 Name is:null      
	{
		prn=prn;
		name=name;
	}
*/

	/*If we want to use same both instance variable as well as arguments then we have to use this keyword it is a spetial keyword
	used in java which always point to the current address of the instance of that respective class
	in this class "this" keyword addressing the same address that is stored in instance variable "d" while creating instance */

		Demo(int prn,String name)        
	{
		this.prn=prn;
		this.name=name;
	}
	void Display()
	{
		System.out.println("Prn is:"+prn);
		System.out.println("Name is:"+name);
		System.out.println("this value is:"+this);
	}
}

class MainClass4
{
	public static void main(String args[])
	{
		Demo d=new Demo(47,"Yogesh Pawar");
		System.out.println("Object d value is:"+d);
		d.Display();
	}
}