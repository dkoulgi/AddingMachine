package cse360assignment01;

public class AddingMachine {
	
	  private int total;
	  private String result = "0";
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  result += " + " + value;
	  }

	  public void subtract (int value) {
		  total = total - value;
		  result += " - " + value;
	  }

	  public String toString () {
		  return result;
	  }

	  public void clear() {
		  result = "0";
	  }
}