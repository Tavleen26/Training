class Add{
	
	void addNumber(int num1,int num2){
		int num3=num1+num2;
		System.out.println("Result:"+num3);
	}
	void addNumber(int num1,int num2,int num3){
		int num4=num1+num2;
		System.out.println("Result:"+num4);
	}
	void addNumber(double num1,double num2){
		double num3=num1+num2;
		System.out.println("Result:"+num3);
	}
	void addNumber(int num1,double num2){
		double num3=num1+num2;
		System.out.println("Result:"+num3);
	}
	
	void addNumbers(int...arr){
		int sum=0;
		for(int elm:arr){
			sum=sum+elm;
		}
		System.out.println("Sum is:"+sum);
	}
}





public class Overloading {

	public static void main(String[] args) {
		Add obj=new Add();
		obj.addNumber(10,5);
        obj.addNumber(56,89,4);
        obj.addNumber(12.9,34.7);
        obj.addNumber(12,89.5);
        obj.addNumbers(10,67,89,90);
	}

}
