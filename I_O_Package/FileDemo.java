package I_O_Package;
import java.io.*;
public class FileDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 File myfile = new File("C:\\Users\\Akhla\\Desktop\\RESUME SAURAV Kumar.pdf");
		 System.out.println("File Name: "+myfile.getName());
		 System.out.println("File Path: "+myfile.getPath());
		 System.out.println("File Parent: "+myfile.getParent());
		 System.out.println("File Length: "+myfile.length());
		 System.out.println("File Exicuteable: "+myfile.canExecute());
		 System.out.println("File Read: "+myfile.canRead());
		 System.out.println("File Name: "+myfile.lastModified());

		 
//		 /////////////////////////////////////////////
		 File f = new File("C:\\Akhlak\\one");
		 if(f.mkdirs()) {  //multiple folder create into
			 System.out.println("Created One within program");
		 }
		 else {
			 System.out.println("Sorry check your path");
		 }
		 
		 File f2 = new File("C:\\one");

		 if(f2.mkdir()) {   //single folder create 
			 System.out.println("Created One within program");
		 }
		 else {
			 System.out.println("Sorry check your path");
		 }
	}

}
