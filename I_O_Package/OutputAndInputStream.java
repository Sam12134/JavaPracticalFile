package I_O_Package;
import java.io.*;
public class OutputAndInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Akhla\\Downloads\\Akhlak.jpg");
		
		// Create InputStream
		
		FileInputStream input=new FileInputStream(f);
		byte b[]=new byte[(int)f.length()];
		int numBytes=input.read(b);
		System.out.println("Data from file read successfully");
		
		//Create OutputStream
		
		FileOutputStream output=new FileOutputStream("C:\\Users\\Akhla\\Downloads\\AkhlakAnsari.pdf");
		output.write(b);
		System.out.println("Data written to from file read successfully");

	}

}
