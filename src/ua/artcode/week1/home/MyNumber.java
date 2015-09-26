package ua.artcode.week1.home;

public class MyNumber { // calculator

	private int value;

	// default constructor - no arguments


	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	// MyNumber num1 = new MyNumber();
	// MyNumber num2 = new MyNumber();
	// num1.add(num2)
	public MyNumber add(MyNumber other){
		int res = this.value + other.value;
		MyNumber resNum = new MyNumber();
		resNum.value = res;
		return resNum;
	}
        
  	public MyNumber divide(MyNumber other){
		int res = this.value / other.value;
		MyNumber resNum = new MyNumber();
		resNum.value = res;
		return resNum;
	}
}
