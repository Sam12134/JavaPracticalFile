package ExceptionHandling;

	import java.util.Scanner;
	public class throw_demo 
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			try
			{
				throw_demo obj=new throw_demo();
				obj.demo();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		
		}

		public void demo() throws ArrayIndexOutOfBoundsException
		{
			System.out.println("Enter a size");
			size=sc.nextInt();
			if(size==0)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			int arr[]=new int[size];
			System.out.println("Enter "+size+" numbers");
			for(i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
				System.out.println("The array num is =");
				for(i=0;i<size;i++)
				{
					System.out.println(arr[i]);
				}
		}
		
		throw_demo(){
			super();
		}
	}
//	----------------------

//	public class user_def_exp extends Exception
//	{
//		user_def_exp(String msg)
//		{
//			super(msg);
//		}
//		
//	}
//}
