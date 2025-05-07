//  StringDemo_06.java
// To perform operations on String buffer

public class StringDemo_06{
	public static void main(String[] args){
		StringBuffer name = new StringBuffer("chandu");
		System.out.println(name.indexOf("u"));
		System.out.println(name.append(".S"));
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.charAt(7));
		System.out.println(name.reverse());
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.substring(1,6));
	}
}