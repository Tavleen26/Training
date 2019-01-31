
public class mutuableStrings {

	public static void main(String[] args) {
		// Mutable Strings
		StringBuffer buff=new StringBuffer("welcome");
		StringBuilder build=new StringBuilder("hello world");
		buff.append(" to the world");
		build.append(" friends");
		System.out.println(" "+buff);
		System.out.println("");
		System.out.println(" "+build);
	}

}
