package com.github.thamirestissot.romannumerals.app;

public class Conversor {

    public static int toInteger(String romanNumber) {
        int decimalNumber = 0;
        for (int i = 0; i <= romanNumber.length(); i++) {
            if (romanNumber.toLowerCase().startsWith("i", i)) {
                if (romanNumber.toLowerCase().startsWith("v", i + 1)) {
                    decimalNumber += 4;
                    i++;
                } else if (romanNumber.toLowerCase().startsWith("x", i + 1)) {
                    decimalNumber += 9;
                    i++;
                } else
                    decimalNumber += 1;
            } else if (romanNumber.toLowerCase().startsWith("v", i))
                decimalNumber += 5;
            else if (romanNumber.toLowerCase().startsWith("x", i))
                decimalNumber += 10;
        }
        return decimalNumber;
    }

    public static String toRoman(int numeroDecimal) {
        String numeroRomano = new String();
        numeroRomano = "";
        do {
            while (numeroDecimal >= 10) {
                numeroRomano += "X";
                numeroDecimal -= 10;
            }
            while (numeroDecimal >= 9) {
                numeroRomano += "IX";
                numeroDecimal -= 9;
            }
            while (numeroDecimal >= 5) {
                numeroRomano += "V";
                numeroDecimal -= 5;
            }
            while (numeroDecimal >= 4) {
                numeroRomano += "IV";
                numeroDecimal -= 4;
            }
            while (numeroDecimal >= 1) {
                numeroRomano += "I";
                numeroDecimal -= 1;
            }
        } while (numeroDecimal != 0);
        return numeroRomano;
    }
}