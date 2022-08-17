package Interface;

public class vehicle {
     int noseats;
     String fuel;
	 int speed;
     public vehicle(int noseats,String fuel, int speed) {
    	 this.noseats=noseats;
    	 this.fuel=fuel;
    	 this.speed=speed;
     }
     public String toString() {
    	 return "No of Seats :"+noseats+"Fuel used :"+fuel+"Speed :"+speed;
     }
}
