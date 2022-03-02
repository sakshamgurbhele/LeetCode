package com.saksham.String;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abcde";
        if(s.length() == 0) return;
        int count = 0;
        for(int i = 0; i<=t.length()-1; i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;
                if(count == s.length()){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
