/**
 * 
 */
package com.raje.interview.stringquestions;

/**
 * Reference:
 * @author rajej
 * Date: 03/05/2017
 * Problem: Given a String and a Character, remove all instances of the Character in the String
 *Solve this two ways:
 *1. Iterate through the String, one character at a time
 *2. Find a method in the String class that can solve this in one line
 *
 */
public class RemoveCharfromString {
	
	public static void main(String[] args) {
       
		System.out.println("Method 2: Result of deleteAllusingCharAt() using charAt iteative: " + deleteAllusingCharAt("Java Language",'a'));
        System.out.println("Method 2: Result of deleteAllchars() using string method replaceAll: " + deleteAllcharsFromString("Java Language",'a'));
       
    }
	public static String deleteAllcharsFromString(String strGiven, char charToRemove) {
		String charToString = Character.toString(charToRemove);
		String resultStr = new String();
		if(strGiven.isEmpty() || strGiven.trim().isEmpty()) {
			 System.out.println("Empty string..");
		}
		else{
			 resultStr = strGiven.replaceAll(charToString, "");
		}
		return resultStr;

	}
	public static String deleteAllusingCharAt(String strGiven, char charToRemove) {
        StringBuffer buf = new StringBuffer();
        if(strGiven.isEmpty() || strGiven.trim().isEmpty()){
          System.out.println("Empty string..");
        	
        }
        else{
        for (int i = 0; i < strGiven.length(); i++){
        	    if (strGiven.charAt(i) != charToRemove){
                 buf.append(strGiven.charAt(i));
        	    }
        }
        }
        return buf.toString();
    }
 
}

	