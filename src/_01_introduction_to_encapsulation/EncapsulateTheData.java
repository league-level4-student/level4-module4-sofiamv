package _01_introduction_to_encapsulation;


/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public void setItem(int itemsReceived) {
		if(itemsReceived < 0) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;
	}
	public int getItem() {
		return this.itemsReceived;
	}
	
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	public void setDegrees(float dt) {
		if(dt <= 360 && dt >= 0) {
			this.degreesTurned = dt;
		}else {
			this.degreesTurned = 9000;
		}
	}
	public float getDegrees() {
		return this.degreesTurned;
	}
	
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	public void setString(String nc) {
		if(nc != "") {
			this.nomenclature = nc;
		}else {
			this.nomenclature = " ";
		}
	}
	public String getString() {
		return this.nomenclature;
	}
	
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	public void setObject(Object mo) {
		if(mo instanceof String) {
		this.memberObj = new Object();	
		}
	}
	public Object getObject() {
		return this.memberObj;
	}
	public static void main(String[] args) {
		
	}

}
