package Enumeration;
enum demo{
	akhlak,anasri;
}

enum demo1{
	
}
public class enumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    demo n1[]=demo.values();
    System.out.println(n1);//reference of n1 value 
   
    for (demo n:n1) {
    	System.out.println(n+" "+n.ordinal());
     }
	}
	

}
