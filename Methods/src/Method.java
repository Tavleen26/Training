
public class Method {
	// non static method
	void fun1(int x){
		int y=x+1;
		System.out.println(""+y);
	}
	
	// static method
	static int mtrToCm(int w){
		int cms=w*100;
		System.out.println("Conversion in cms:"+cms);
		return w;
	}
	public static void main(String[] args) {
	//Execution of non static method
		Method mth=new Method();
		mth.fun1(15);
	// Execution of static method
		Method.mtrToCm(12);
	// Execution of static method using reference variable
		mth.mtrToCm(10);
		
	}

}
