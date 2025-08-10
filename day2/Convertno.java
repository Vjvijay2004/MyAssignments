package week1.day2;

public class Convertno {
	
	//Pseudocode
	//Start
	// Initialize an integer: number = -40
	//If number < 0:
	    //  Set number = -number  (convert to positive)
	// Print: "The number -40 is converted to 40"
	 //End
	public static void main(String[] args) {
		int number=-40;
		if(number<0)
			number=-number;
		System.out.println("The number -40 is converted to " + number);
	}

}
