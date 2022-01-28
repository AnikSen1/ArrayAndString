package Strings;

import java.util.Scanner;

public class BufferBuilderScanner {


public static void main(String[] args) {


int[] number1 = {100,4,6,4,7,8,9,9,0,9000};
int max = number1[0];
for (int i = 0; i < number1.length; i++) {
if( max < number1[i]) {
max = number1[i];

}

}
System.out.println("Max Num is : "+ max);

int[] number2 = {7,3,5,2,1,99,11};
int min = number2[0];
for (int j = 0; j < number2.length; j++) {
if(min > number2[j]) {
min = number2[j];

}

}

System.out.println("Min Num is : "+min);

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


StringBuilder sb = new StringBuilder("I am a QA"); 
System.out.println("Before reverse = " + sb);
System.out.println("After Reverse = " + sb.reverse());

/*Write a program to reverse a string word wise.
Input: "My name is Alex"
Output: "Alex is name my"*/

String str1 = "My name is Alex";
String[] str2 = str1.split(" ");



StringBuilder str3 = new StringBuilder();

for(int i = str2.length -1; i>=0; i--) {
str3.append(str2[i]).append(" ");


}

System.out.println(str3.toString().trim());

}


}
