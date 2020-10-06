package cse360assignment01;

public class AddingMachine {
	
	  private int total;
	  private String result = "0";
	  
	  /**
	   * @param total
	   * the total value of the calculations
	   * @param result
	   * the resulting string showing the calculations
	   */
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * @param value
	   * the number being entered into the calculation
	   */
	  
	  public void add (int value) {
		  total = total + value;
		  result += " + " + value;
	  }
	  
	  /**
	   * @param value
	   * the number being entered into the calculation
	   */

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