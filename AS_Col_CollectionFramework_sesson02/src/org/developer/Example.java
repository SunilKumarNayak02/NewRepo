package org.developer;
public class Example {

    public static void main(String[] args) {
        String str = "a1b2c3";

        String s1 = ""; 
        String s2 = ""; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                s1 += ch;
            } else if (Character.isLetter(ch)) {
                s2 += ch;
            }
        }

        System.out.println("s1: " + s1); 
        System.out.println("s2: " + s2); 
    }
}