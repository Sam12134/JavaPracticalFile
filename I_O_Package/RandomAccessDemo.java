package I_O_Package;
import java.io.*;
public class RandomAccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     accessfile();
	}
	public static void accessfile() {
		 try {
	    	 
	    	  RandomAccessFile rafile= new RandomAccessFile("C:\\Users\\Akhla\\Desktop\\Question.txt","rw");
	    	  byte [] data = new byte[(int) rafile.length()];
	    	  rafile.read();
	    	  
	    	  System.out.println("The original content :"+new String(data));
	    	  
	    	  rafile.seek(0);
	    	  rafile.write("This is the writen in program\n".getBytes());
	    	  rafile.write("I want to modify my file content\n".getBytes());
	    	  rafile.seek(0);
	    	  
	    	  
	    	  data=new byte[(int) rafile.length()];
	    	  rafile.read(data);
	    	  System.out.println("Modified Content :\n");
	    	  System.out.println(new String(data));

	      }
	      catch(IOException ioe) {
	    	  ioe.printStackTrace();
	      }
	}

}
