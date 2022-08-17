package ExceptionHandling;

public class GetCauseMethodDemo8 {
	public static void main(String args[]) throws Exception{
		try{
			m1();
		}
		catch(Exception e){
			System.out.println("Cause:" + e.getCause());
		}
	}
	
	public static void m1() throws Exception{
		int arr [] = {1,2,3,4,5};
		
		try{
			if (arr[2]==3)
				arr[10] = 43;
			
		}
		catch (ArrayIndexOutOfBoundsException ae){
			Exception e = new Exception();
			e.initCause(ae);
			throw(e);
		}
		catch(ArithmeticException ae){
			Exception e = new Exception();
			e.initCause(ae);
			throw(e);
		}
	}
}
