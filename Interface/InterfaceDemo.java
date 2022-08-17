package Interface;

import java.util.Scanner;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v[]=new vehicle[5];
		Scanner ch=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter 1 to create Bus and 2 to create Airoplane and 3: Rocket");
		    int choice;
		    choice=ch.nextInt();
		    if(choice==1) {
		    	int seats;
		    	String fuel;
		    	int speed;
		    	String type;
		    	System.out.println("Enter Seats, Fuel, Speed, and type of Bus");
		    	seats=ch.nextInt();
		    	fuel=ch.next();
		    	speed=ch.nextInt();
		    	type=ch.next();
		    	v[i]=new Bus(seats,fuel,speed,type);
		    }
		    else if(choice==2){
		    	int seats;
		    	String fuel;		    	
		    	int speed;
		    	int takeoffspeed;
		    	System.out.println("Enter Seats, Fuel, Speed, and take off speed");
		    	seats=ch.nextInt();
		    	fuel=ch.next();
		    	speed=ch.nextInt();
		    	takeoffspeed=ch.nextInt();
		    	v[i]=new Aeroplane(seats,fuel,speed,takeoffspeed);


		    }
		    else {
		    	int seats;
		    	String fuel;		    	
		    	int speed;
		    	System.out.println("Enter Seats, Fuel, Speed of rocket");
		    	seats=4;
		    	fuel=ch.next();
		    	speed=ch.nextInt();
		    	
		    	v[i]=new Rocket(seats,fuel,speed);
		    }
		}
		int count =0;
		for(int i=0;i<5;i++) {
			
			if(v[i] instanceof FlyingObject) {
				count++;
				System.out.println(v[i]);

			}
		}
		System.out.println("Total FlyingObject are: "+count);

	}

}
