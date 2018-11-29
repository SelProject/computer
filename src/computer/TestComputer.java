package computer;

public class TestComputer {

	public static void main(String[] args) {
		//calling zero parameterized constructor.
		Computer   computer = new    Computer();
		//accesing non-static variable of Computer class through its objects form test computer class
		System.out.println("non-static variable of Computer class from TestComputer class is ="+computer.i);
		//accssing non-static methoods of Computer class through its objects from test computer class.
		computer.methodOne();
		computer.methodTwo();
		//accssing static variable of computer class through its static context from test computer class
		
		System.out.println("static variable of Computer class from TestComputer class is ="+Computer.j);
		//accesing static methoods of computer class through its static context from test computer class.
		
		Computer.methodThree();
		Computer.methodFour();
	}		
		
}
