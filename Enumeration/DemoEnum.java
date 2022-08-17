package Enumeration;

enum acc{
	Abc(11),Zxc(22),Bnm(33);
	int val;
	acc(int val){
		this.val=val;
		System.out.println("This Is my const");
	}
	public int accept() {
//		System.out.println("This is our accept meyhod");
	return val;
	}
}

enum food{
	item1(100),item2(200),item3(450),item4(550),item5(50);
	int prize;
	food(int prize){
		this.prize=prize;
	}
	public int showprize() {
		return prize;
	}
}
public class DemoEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   acc a=null;
   food obj[]=food.values();
//   System.out.println("The value is:"+a.Abc.accept());
//   System.out.println("The itme prize  is:"+f.item1.showprize());
   System.out.println("The all item is ");
   for(food f:obj) {
	   System.out.println(f);
   }
   

	}

}
