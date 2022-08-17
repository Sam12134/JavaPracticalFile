package Encapsulation;

public class EncaapDemo2 extends EncapDemo {
  
	private static double avg;
	private static char grd;
	
	
	public double avreg() {
		avg =total/5.0;
		return avg;
	}
	public char grdvalue() {
		return grd;
	}
	public void grd(float avg) {
		this.avg=avg;
		 if (avg >= 90)
		 {
			 grd = 'A';
		 }
	     else if (avg >= 80 && avg < 90)
	     {
	    	 grd = 'B';
	     }
	     else if (avg >= 70 && avg < 80)
	            {
	    	 grd = 'C';
	            }
	      else if (avg >= 60 && avg < 70)
	            {
	    	  grd = 'D';
	            }
	      else {
	            grd = 'E';
	      }
	      }
	
}
