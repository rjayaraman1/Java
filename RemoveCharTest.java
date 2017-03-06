package com.raje.interview.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.raje.interview.stringquestions.RemoveCharfromString;
///question1/src/main/java/com/raje/interview/stringquestions

/**
 * @author rajej
 * Date: 03/05/2017
 * Problem: Given a String and a Character, remove all instances of the Character in the String
 *This is a test class to test the java class using TestNG library
 *testStr has test input values
 *expectedResult has the expected result for each input string
 */
public class RemoveCharTest {
	char removechar = 'a';
	String testStr1 = "Programming language Java";
	String testStr2 ="";
	String testStr3 ="        ";
    String testStr4 ="4Programming language3#12";
    String testStr5 = "a";
    String testStr6 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa123456aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String expectedResult1 = "Progrmming lnguge Jv";
    String expectedResult2 = "";
    String expectedResult3 = "";
    String expectedResult4 = "4Progrmming lnguge3#12";
    String expectedResult5 = "";
    String expectedResult6 = "123456";
     
@Test
public void testdeleteAllcharsFromString() {
	System.out.println("Tests to test deleteAllCharsFromString method of RemoveCharfromString class");
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr1,this.removechar),this.expectedResult1); 
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr2,this.removechar),this.expectedResult2); 
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr3,this.removechar),this.expectedResult3);
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr4,this.removechar),this.expectedResult4);
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr5,this.removechar),this.expectedResult5);
	Assert.assertEquals(RemoveCharfromString.deleteAllcharsFromString(this.testStr6,this.removechar),this.expectedResult6); 

 }
@Test
public void testdeleteAllusingCharAt() {
	System.out.println("Tests to test deleteAllusingCharAt method of RemoveCharfromString class");
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr1,this.removechar),this.expectedResult1); 
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr2,this.removechar),this.expectedResult2); 
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr3,this.removechar),this.expectedResult3);
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr4,this.removechar),this.expectedResult4);
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr5,this.removechar),this.expectedResult5);
    Assert.assertEquals(RemoveCharfromString.deleteAllusingCharAt(this.testStr6,this.removechar),this.expectedResult6); 

	}

}


