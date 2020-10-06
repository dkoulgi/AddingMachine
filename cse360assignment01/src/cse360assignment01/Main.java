package cse360assignment01;

public class Main {
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
	}

}
