package Interface;

public class Bus extends vehicle{
	String  type;

    public Bus(int noseats, String fuel, int speed, String type2) {
		// TODO Auto-generated constructor stub
    	super(noseats, fuel, speed);
    	this.type=type;
	}
	public String toString() {
    	   String busPrint;
    	   busPrint="Attributes of But\n";
       	   busPrint=busPrint+"\nNo of seat :"+noseats+"\n Fuel used :"+fuel+"\n Speed :"+speed;
           busPrint="Type"+type;
           return busPrint;
    }

	
}
