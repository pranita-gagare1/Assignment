package com.jspider.Assigment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
	        if (checkAnagram(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }
   public static boolean checkAnagram(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        char[] charArray1 = str1.toLowerCase().toCharArray();
	        char[] charArray2 = str2.toLowerCase().toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
}
