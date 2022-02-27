package com.saksham.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 3, 4, 5, 9};
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;

            }
            digits[i] = 0;

            return;
        }
        for(int k=0; k<= digits.length-1; k++){
            System.out.print(digits[k] + " ");
        }
        int[] temp = new int[digits.length+1];
        temp[0] = 1;


        for(int k=0; k<= digits.length-1; k++){
            System.out.print(digits[k] + " ");
        }

    }
}
