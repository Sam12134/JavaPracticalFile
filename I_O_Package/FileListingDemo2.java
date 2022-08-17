package I_O_Package;

import java.io.*;
import java.util.Date;

class FileListingDemo2{
	public static void main(String [] args){
		String dirName = args[0];
		File dirFile = new File(dirName);
		
		if (!dirFile.isDirectory()){
			System.out.println(dirName + " is not a Directory");
			return;
		}
		
		/*for(String f:dirFile.list())
			System.out.println(f);*/
		
		File [] files = dirFile.listFiles();
		Date fileDate = new Date();
		
		for (File a_file:files){
			fileDate.setTime(a_file.lastModified());
			String content;
			content = a_file.isDirectory()?"<DIR>": " " + a_file.length(); 
			System.out.println(fileDate + "\t" + content + "\t" + a_file.getName());
		}
		
	}
}
		
		