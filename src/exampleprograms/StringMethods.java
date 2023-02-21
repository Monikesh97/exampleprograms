package exampleprograms;

import java.lang.reflect.Array;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = " Hello world  ?";
		String s2 = "helo world";
		String s3 = " ";
		System.out.println(s1.length());
		System.out.println(s1.startsWith("He"));
	 	System.out.println(s1.endsWith("d"));
		System.out.println(s1.contains("e"));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1==s2);
		System.out.println(s1.trim().length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("r"));
		System.out.println(s1.lastIndexOf("d"));
		System.out.println(s1.substring(2,5));
//		System.out.println(arrays.toString(s1.split("")));
		System.out.println(s1.replace('o','z'));
		System.out.println(s1.isEmpty());
		System.out.println(s3.isBlank());
		}

}
