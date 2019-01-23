
public class valueVsReference {

	static void  showSingleValueContainer(int container){
		container=container*3;
		System.out.println(""+container);
	}
	static void showMultiValueContainer(int [] arr){
		arr[0]=arr[0]*2;
		arr[1]=arr[1]*4;
		for(int elm:arr){
			System.out.print(" "+elm);
		}
	
	}
	public static void main(String[] args) {
		int x=10;
		valueVsReference.showSingleValueContainer(x);
		System.out.println(""+x);
		int [] a1={10,20,30,40,50};		
		valueVsReference.showMultiValueContainer(a1);
		System.out.println(" ");
		for(int elm:a1){
			System.out.print(" "+elm);
		}
	}

}
