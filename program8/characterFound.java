/* Write a program to do the following process 
-Number of Duplicate Words in String
-Number of Words in Given String
-Occurrences of Each Character in String
-Remove Duplicate Words from String 
-Count of Vowels */
package program8;

import java.util.Scanner;

public class characterFound {
 static Scanner ch=new Scanner(System.in);

	public static void main(String[] args) {
     String string;
		// TODO Auto-generated method stub
     System.out.println("Enter thr value :");
     string=ch.nextLine();
     duplicatechar(string);
	}

	
public static void duplicatechar(String s) {

     int count;
     String duplicate="";
     
     String[] words = s.toLowerCase().trim().split(" ");
     
     for(int i=0;i<s.length();i++) {
    	 char ch=(char)s.charAt(i);
    	for(int j=0;j<s.length();j++) {
    		
    	}
    	 
    	
    	 
     }
     System.out.println(duplicate);
}
	



	public static void vowalsoundCahr(String c) {
		int count=0;
	    String ch = c.toLowerCase();
	
	    for(int i=0;i<c.length();i++) {
			
			if(ch.charAt(i) == 'a'|| ch.charAt(i) == 'e'|| ch.charAt(i) == 'i' || ch.charAt(i) == 'o' || ch.charAt(i) == 'u') {
				count++;
			}
			
	}
		System.out.println(count);
}
}