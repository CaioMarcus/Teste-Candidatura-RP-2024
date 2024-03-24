package com.Caio;

public class InverterString {
    public static void main(String[] args) {
        String string = "teste";
        System.out.println(inverteString(string));
    }

    private static String inverteString(String string){
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--)
            result += string.charAt(i);
        return result;
    }
}
