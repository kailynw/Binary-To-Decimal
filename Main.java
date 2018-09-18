package com.williams.kailyn;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input="";

        do {
            System.out.println("Enter Binary Value: ");
             input = keyboard.nextLine();

            if (isBinaryNumber(input)) {
                String reverse = reverse(input);
                System.out.println("Decimal Value: " + calcDecToBinary(reverse));
            } else
                System.out.println("Please enter a binary number (1 or 0)\n");
        }while(!isBinaryNumber(input));

    }

    //Checks to see if number is a valid binary number
    public static boolean isBinaryNumber(String input){
        if(input.contains("0")&& input.contains("1") || input.contains("0")||input.contains("1")){
            return true;
        }
        return false;
    }

    //Binary count starts from right to left. Therefore, you have to reverse the string
    public static String reverse(String input){
        String reverse="";

        for(int i=input.length()-1;i>=0;i--){
            reverse= reverse + input.charAt(i);
        }
        return reverse;
    }

    public static int calcDecToBinary(String input){

        int endValue=0;
        for(int i=0; i<input.length();i++){
            char binaryValue= input.charAt(i);
            int decimalConv= ((Integer.parseInt(String.valueOf(binaryValue)))* (int)Math.pow(2,i));
            endValue+=decimalConv;
        }
        return endValue;
    }

}
