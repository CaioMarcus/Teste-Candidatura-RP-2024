package com.Caio;

public class Firbonacci {
    public static void main(String[] args) {
        int num = 34;
        String palavraPercente = "percente";
        if (!percenceAFirbonacci(num))
            palavraPercente = "não pertence";
        System.out.printf("O número %d %s a sequência de Firbonacci%n", num, palavraPercente);
    }

    private static boolean percenceAFirbonacci(int num){
        if (num == 0) return true;
        int lastNumber = 1, number = 1;
        while (num >= number){
            if (num == number)
                return true;
            number += lastNumber;
            lastNumber = number - lastNumber;
        }
        return false;
    }
}