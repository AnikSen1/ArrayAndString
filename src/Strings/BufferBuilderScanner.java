package Strings;


import java.util.Scanner;

public class BufferBuilderScanner {


public static void main(String[] args) {



Scanner input = new Scanner (System.in);

System.out.println("Enter first number: ");
int a = input.nextInt();

System.out.println("Enter Second number: ");
int b = input.nextInt();

System.out.println("The value of first number you entered is " + a);
System.out.println("The value of Second number you entered is " + b);
a= a+b;  // a = 5 , b= 10
b = a-b;
a = a-b;

System.out.println("The value of first number is now : " + a);
System.out.println("The value of second number is now : " + b);


StringBuilder sb = new StringBuilder("My name is Alex"); 
System.out.println("Before reverse = " + sb);
System.out.println("After Reverse = " + sb.reverse());

/*Write a program to reverse a string word wise.
Input: "My name is Alex"
Output: "Alex is name my"*/



String str = "My name is Alex";
String[] str3 = str.split(" ");


StringBuilder str4 = new StringBuilder();

for(int i = str3.length -1; i>=0; i--) {
str4.append(str3[i]).append(" ");


}

System.out.println("Reverse using split StringBuilder and for loop: "+ str4.toString().trim());



String str1 = "My name is Alex";
int str2 = str1.split(" ").length;
System.out.println(str2);
}


}
