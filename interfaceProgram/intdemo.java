package interfaceProgram;

public class intdemo implements intclass,intclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intdemo obj=new intdemo();
		obj.sod();
		obj.check();
		intclass.check();
	}

	@Override
	public void sod() {
		// TODO Auto-generated method stub
		System.out.println("Hello everyone");
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Hi good morning everyone");
		
	}

}
