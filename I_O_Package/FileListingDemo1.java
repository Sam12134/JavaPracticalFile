package I_O_Package;

import java.io.*;


class FilterExt implements FilenameFilter{
	String ext;
	public FilterExt(String ext){
		this.ext = ext;
	}
	
	public boolean accept(File dir, String name){
		return name.endsWith(ext);
	}
}


class FileListDemo1{
	public static void main(String [] args){
		FilenameFilter only = new FilterExt("txt");
		String dirName = args[0];
		File myDir = new File(dirName);
		
		if (myDir.isDirectory()){
			File[] files = myDir.listFiles(only);
			for (File a_file:files)
				System.out.println(a_file.getName());
			System.out.println("Total:" + files.length);
		}
		else
			System.out.println("Not a Directory");
	}
}
		