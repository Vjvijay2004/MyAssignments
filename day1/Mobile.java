package week1.day1;


public class Mobile {
	public void makeCall() {
		String mobileModel="realme narzo 30";
		float mobileweight =150.4f;
		System.out.println("makeCall() method");
		System.out.println("mobile model:"+mobileModel);
		System.out.println("mobile Weight:"+ mobileweight +"g");
}
	public void sendMessage() {
		boolean isFullcharged=false;
		int mobileCost=18000;
		
		System.out.println("sendMsg() method");
		System.out.println("isFullcharged"+isFullcharged);
		System.out.println("mobilecost"+mobileCost);
	}
	public static void main(String[] args) {
		 Mobile Mymobile=new Mobile();
		 Mymobile.makeCall();
		 Mymobile.sendMessage();
		 System.out.println("This is my mobile"); 
	}				

}
