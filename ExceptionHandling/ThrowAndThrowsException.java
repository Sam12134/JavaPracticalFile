package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class ThrowAndThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		ThrowAndThrowsException obj =new ThrowAndThrowsException();
		int val;
		val=ch.nextInt();
		try{
		obj.throwshandling(val);
		}
		catch(Exception e) {
			
		}
	}
		
	
	public void throwshandling(int  a) throws IOException{
		if(a<0) {
			throw new IOException();
		}
		else {
		System.out.println("VAlid value is :"+a);
	}
}	

}
