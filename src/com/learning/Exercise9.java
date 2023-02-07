package com.learning;

/*
 * String Transformation, Convert input string to output string and print the output string.

Input String: "        JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy    "



Output String: "java was developed by james gosling at sun microsystems inc in the year 1991- later acquired by oracle corporation. it is a simple programming language. java makes writing- compiling- and debugging programming easy"


 * 
 * 
 * */
public class Exercise9 {

public static void main(String[] args) {
       System.out.println(printResult() );
    }

    public static String printResult(){
        String finalStr = "       JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1991, later acquired by Oracle Corporation. It is a simple programming language. Java makes writing, compiling, and debugging programming easy    ";
        
        // Write your string transformation logic here, like finalStr = finalStr + "New String"
                finalStr = finalStr.trim().toLowerCase().replaceAll(",","-");
        String strArr[] = finalStr.split(" ");
        return finalStr+ "\nTotal words in this string is "+strArr.length;
        
    }
}
