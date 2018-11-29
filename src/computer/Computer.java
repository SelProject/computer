package computer;
//creating class name called Computer
public class Computer { //starting of computer class
	//creating non-static variable which name is i
	int i = 10; 
	//creating static variable which name is j
	static int j = 20;
	//creating zero parameterized constructor for class computer line (9-12)
	Computer()
	{
	System.out.println("zero-parameterized constructor");
	}
	//creating one parameterized constructor for class computer line (14-17)
	Computer(int x)
	{
	System.out.println("one-parameterized constructor");	
	}
	//creating two parameterized constructor for class computer line (19-22)
	Computer(int x , int y)
	{
	System.out.println("two-parameterized constructor");	
	}
	//creating non-static method one line (24-27)
	void methodOne()
	{              
	System.out.println("non-static methoodOne");	
	}
	//creating non-static method two line (29-32)
	void methodTwo()
	{              
	System.out.println("non-static methoodTwo");	
	}
	//creating static method three line (34-37)
	static void methodThree()
	{              
	System.out.println("static methoodThree");	
	}
	//creating static method four line (39-42)
	static void methodFour()
	{              
	System.out.println("static methoodFour");	
	}

}//end of class computer.
