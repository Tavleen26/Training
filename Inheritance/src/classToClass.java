class Shoe{
	void show(){
		System.out.println("This is show");
	}
	static void hello(){
		System.out.println("This is hello");
	}
}
class lace extends Shoe{
	
}
public class classToClass {

	public static void main(String[] args) {
		lace lac=new lace();
		lac.show();
		lace.hello();

	}

}
