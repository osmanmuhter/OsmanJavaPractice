   package Day44;

public class mathEquation {

	
	public mathEquation() {
		System.out.println("print out massage");
	}
	
	public mathEquation(char operator) {
		this.operator = operator;
	}
	public mathEquation(int oprand1 , int oprand2 , char operator) {
		this.operator = operator;
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
	}
	
	public void resultValue() {
		if(operator =='+' )
		System.out.println(oprand1 + oprand2);
		else if(operator =='-' )
			System.out.println(oprand1 - oprand2);
		else if(operator =='*' )
			System.out.println(oprand1 * oprand2);
		else if(operator =='/' )
			System.out.println(oprand1 / oprand2);
		else
			System.out.println("Please input the valid operator");
	}
	private int oprand1 ;
	@Override
	public String toString() {
		if(operator =='+')
			result = oprand1 + oprand2;
		else if(operator =='-')
			result = oprand1 - oprand2;
		else if(operator =='*')
			result = oprand1 * oprand2;
		else if(operator =='/')
			result = oprand1 / oprand2;
		return "mathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	private int oprand2 ;
	private double result;
	private char operator;
	public int getOprand1() {
		return oprand1;
	}
	public void setOprand1(int oprand1) {
		this.oprand1 = oprand1;
	}
	public int getOprand2() {
		return oprand2;
	}
	public void setOprand2(int oprand2) {
		this.oprand2 = oprand2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
}
