package ua.artcode.week1.home;

public class MyNumber {

	private int value;

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

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
