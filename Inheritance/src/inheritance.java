class product{
	int pid;
	String name;
	String brandName;
	int price;
	product(){
		System.out.println("Product Object Constructed");
	}
	
	void setDataForProduct(int pid,String name,String brandName,int price){
		this.pid=pid;
		this.name=name;
		this.brandName=brandName;
		this.price=price;
	}
	void showDataForProduct(){
		System.out.println("*********Product Details********");
		System.out.println("Product ID: "+pid);
		System.out.println("Name of Product: "+name);
		System.out.println("Brand Name: "+brandName);
		System.out.println("Price: "+price);
		System.out.println("*********************************");
	}
}
	class Mobile extends product{
		Mobile(){
			System.out.println("Mobile Object constructed");
		}
		String os;
		int RAM;
		int memory;
		/*Mobile(){
			System.out.println("Mobile Object constructed");
		}*/
		// Overloading
		void setDataForProduct(int pid,String name,String brandName,int price,String os,int RAM,int memory){
			this.pid=pid;
			this.name=name;
			this.brandName=brandName;
			this.price=price;
			this.os=os;
			this.RAM=RAM;
			this.memory=memory;
		}
		// Overriding
		void showDataForProduct(){
			System.out.println("===========Mobile Details===========");
			System.out.println("Product ID: "+pid);
			System.out.println("Name of Product: "+name);
			System.out.println("Brand Name: "+brandName);
			System.out.println("Price: "+price);
			System.out.println("OS: "+os);
			System.out.println("RAM: "+RAM);
			System.out.println("Memory: "+memory);
			System.out.println("===================================");
		}
	}

public class inheritance {

	public static void main(String[] args) {
		//product pref=new product();
		Mobile mref=new Mobile();
		mref.setDataForProduct(1,"Redmi Note 4","Mi",13000,"Android",4,128);
		mref.showDataForProduct();
          
	}

}
