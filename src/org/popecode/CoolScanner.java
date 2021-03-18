package org.popecode;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CoolScanner {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

//        Basic string input
//        System.out.println("Enter your name here: ");
//        String name = myScanner.next();

//        Continuous String Input
//        String string1 = myScanner.next();
//        String string2 = myScanner.next();
//        String string3 = myScanner.next();
//        System.out.println(string1 + string2 + string3);

//        String string1 = myScanner.next();
//        System.out.println(string1);
//        String string2 = myScanner.next();
//        System.out.println(string2);
//        String string3 = myScanner.next();
//        System.out.println(string3);

//        String string1 = "";
//        while(!string1.equals("End")){
//            string1 = myScanner.next();
//            System.out.println(string1);
//        }
//
//        Other data types
//
//        Integer myInt = myScanner.nextInt();
//        Float myFloat = myScanner.nextFloat();
//        Boolean myBool = myScanner.nextBoolean();
//        System.out.println(myInt + " is a " + myInt.getClass().getName());
//        System.out.println(myFloat + " Is a " + myFloat.getClass().getName());
//        System.out.println(myBool + " Is a " + myBool.getClass().getName());

//        Delimiters

//        myScanner.useDelimiter(" ");
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        Type checking

       // String hi = myScanner.next();
//
//        if (myScanner.hasNextInt()){
//            System.out.println("The input is an integer!");
//        }
//
//        else if (myScanner.hasNextFloat()){
//           System.out.println("The input is a float!");
//        }
//
//        else if (myScanner.hasNextBoolean()){
//            System.out.println("The input is a boolean!");
//        }
//
//        else if (myScanner.hasNext()){
//            System.out.println("The input is a string!");
//        }

//        System.out.println(myScanner.hasNextInt());
//        Pattern Matching
//        myScanner.next("Jimmy");

        Pattern phoneNumber = Pattern.compile("\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d\\d\\d");

//        String myPhoneNumber = myScanner.next(phoneNumber);
//        System.out.println(myPhoneNumber);


//        String myPhoneNumber = myScanner.findInLine(phoneNumber);
//        System.out.println(myPhoneNumber);

        myScanner.close();
    }
}
