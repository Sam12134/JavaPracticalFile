package I_O_Package;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriter {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
     inputfile(args);
	}
	
	public static void inputfile(String Source[]) {
		FileReader fin;
		FileWriter fout;
		int c;
		
		if(Source.length !=2) {
			System.out.println("Please provide 2 file names");
			return;
		}
		try {
			fin=new FileReader(Source[0]);
			fout=new FileWriter(Source[1]);
			
			do {
				c = fin.read();
				if(c!= -1) {
					fout.write(c);
				}
			}while(c != -1);
		}
		catch( IOException ioe) {
		System.out.println("Exception occurred while processing");
		}
	}

}
