package day45;

public class MathEquation2 {

	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;
	
public void calculateX(double num1, double num2) {
		
		this.oprand1 = num1;
		this.oprand2 = num2;
		
	calculate();
	
	
		}
	
	public void calculate() {
		
		switch(operator) {
		case '+':
			result = oprand1 + oprand2;
			break;
		case '-':
			result = oprand1 - oprand2;
			break;
		case '*':
			result = oprand1 * oprand2;
			break;
		case '/':
			result = oprand1 / oprand2;
			break;
			default :
				System.out.println("Invalid!!!");
				
		}
		
	
			
		
	}
	public MathEquation2() {
		System.out.println("no arg");
	}
	
	public double getOprand1() {
		return oprand1;
	}
//	public void setOprand1(double oprand1) {
//		this.oprand1 = oprand1;
//	}
	public double getOprand2() {
		return oprand2;
	}
//	public void setOprand2(double oprand2) {
//		this.oprand2 = oprand2;
//	}
	public char getOperator() {
		return operator;
	}
//	public void setOperator(char operator) {
//		this.operator = operator;
//	}
	public double getResult() {
		return result;
	}
	public MathEquation2(double oprand1, double oprand2, char operator) {
	
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator;
	}

	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	
}
  