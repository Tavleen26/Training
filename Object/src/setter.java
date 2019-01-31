class c{
	String name;
	private String type;
	
	void setType(String t){
		type=t;
	}
	String getType(){
		return type;
	}
	
}
public class setter {

	public static void main(String[] args) {
		c obj=new c();
		obj.setType("csj");
		System.out.println(""+obj.getType());

	}

}
