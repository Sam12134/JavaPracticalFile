package Interface;

public class Aeroplane extends vehicle implements FlyingObject{
	int takeoffspeed;
   public Aeroplane(int noseats, String fuel, int speed,int takeoffspeed) {
		super(noseats, fuel, speed);
		this.takeoffspeed=takeoffspeed;
	}
    public String toString() {
    	String aeroPrint="Attributes of Aeroplane\n";
    	aeroPrint=aeroPrint+"\nNo of seat :"+noseats+"\n Fuel used :"+fuel+"\n Speed :"+speed;
        aeroPrint=aeroPrint+"Maximum Height :"+maxheight;
        aeroPrint=aeroPrint+"Take Off Speed :"+takeoffspeed;
        
        return aeroPrint;
        
    }

}
