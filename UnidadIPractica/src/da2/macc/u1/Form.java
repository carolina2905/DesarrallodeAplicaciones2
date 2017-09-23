package da2.macc.u1;

import java.io.Serializable;

public class Form implements Serializable{
	private double x;

	private double result;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getResult() {
		return (3*(Math.pow(x, 2))*3)-(7+5*(x))+(-2+(6)*x)+Math.pow(x, 3)-(7*(Math.pow(x, 2)));
				
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Form [x=" + x + ", result=" + result + "]";
	}
		
}
