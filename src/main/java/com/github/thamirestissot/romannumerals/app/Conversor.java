package com.github.thamirestissot.romannumerals.app;

public class Conversor {

    public static int toInteger(String romanNumber) {
        int decimalNumber = 0;
        romanNumber=romanNumber.toUpperCase();
        for (int i = 0; i <= romanNumber.length(); i++) {
            if (romanNumber.startsWith("I", i)) {
                if (romanNumber.startsWith("V", i + 1)) {
                    decimalNumber += 4;
                    i++;
                } else if (romanNumber.startsWith("X", i + 1)) {
                    decimalNumber += 9;
                    i++;
                } else if (romanNumber.startsWith("L", i + 1)) {
                    decimalNumber += 49;
                    i++;
                } else if (romanNumber.startsWith("C", i + 1)) {
                    decimalNumber += 99;
                    i++;
                } else if (romanNumber.startsWith("D", i + 1)) {
                    decimalNumber += 499;
                    i++;
                } else if (romanNumber.startsWith("M", i + 1)) {
                    decimalNumber += 999;
                    i++;
                } else
                    decimalNumber += 1;
            } else if (romanNumber.startsWith("V", i))
                decimalNumber += 5;
            else if (romanNumber.startsWith("X", i))
                decimalNumber += 10;
            else if (romanNumber.startsWith("L", i))
                decimalNumber += 50;
            else if (romanNumber.startsWith("C", i))
                decimalNumber += 100;
            else if (romanNumber.startsWith("D", i))
                decimalNumber += 500;
            else if (romanNumber.startsWith("M", i))
                decimalNumber += 1000;
        }
        return decimalNumber;
    }

    public static String toRoman(int numeroDecimal) {
        String numeroRomano = new String();
        numeroRomano = "";
        do {
            while (numeroDecimal >= 1000) {
                numeroRomano += "M";
                numeroDecimal -= 1000;
            }
            while (numeroDecimal >= 999) {
                numeroRomano += "IM";
                numeroDecimal -= 999;
            }
            while (numeroDecimal >= 500) {
                numeroRomano += "D";
                numeroDecimal -= 500;
            }
            while (numeroDecimal >= 499) {
                numeroRomano += "ID";
                numeroDecimal -= 499;
            }
            while (numeroDecimal >= 100) {
                numeroRomano += "C";
                numeroDecimal -= 100;
            }
            while (numeroDecimal >= 99) {
                numeroRomano += "IC";
                numeroDecimal -= 99;
            }
            while (numeroDecimal >= 50) {
                numeroRomano += "L";
                numeroDecimal -= 50;
            }
            while (numeroDecimal >= 49) {
                numeroRomano += "IL";
                numeroDecimal -= 49;
            }
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