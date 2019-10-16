package com.romanova;

public class RomanNumbers {
    private static String[] romanNumAtString;
    private static int[] romanNumAtInt;
    static String roman = "";

    // метод для конвертации арабских чисел в римские
    public static void convertationArabicToRoman (int arabicNumber){
        roman = ""; // обнуление переменной
        try {
            if (arabicNumber <= 4000) {
                int m1 = arabicNumber / 1000;
                int m2 = arabicNumber - m1 * 1000;
                for (int i = 0; i < m1; i++) {
                    roman += "M";
                }
                if (m2 / 100 == 9) {
                    roman += "CM";
                    m2 -= 900;
                }
                int d1 = m2 / 500;
                int d2 = m2 - d1 * 500;
                for (int i = 0; i < d1; i++) {
                    roman += "D";
                }
                if (d2 / 100 == 4) {
                    roman += "CD";
                    d2 -= 400;
                }
                int c1 = d2 / 100;
                int c2 = d2 - c1 * 100;
                for (int i = 0; i < c1; i++) {
                    roman += "C";
                }
                if (c2 / 10 == 9) {
                    roman += "XC";
                    c2 -= 90;
                }
                int l1 = c2 / 50; // переменная начинается со строчной L
                int l2 = c2 - l1 * 50; // переменная  начинается со строчной L
                for (int i = 0; i < l1; i++) {
                    roman += "L";
                }
                if (l2 / 10 == 4) {
                    roman += "XL";
                    l2 -= 40;
                }
                int x1 = l2 / 10;
                int x2 = l2 - x1 * 10;
                for (int i = 0; i < x1; i++) {
                    roman += "X";
                }
                if (x2 / 1 == 9) {
                    roman += "IX";
                    x2 -= 9;
                }
                int v1 = x2 / 5;
                int v2 = x2 - v1 * 5;
                for (int i = 0; i < v1; i++) {
                    roman += "V";
                }
                if (v2 / 1 == 4) {
                    roman += "IV";
                    v2 -= 4;
                }
                int i1 = v2 / 1;
                for (int i = 0; i < i1; i++) {
                    roman += "I";
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("В метод конвертации из арабских в римские числа попало значение неверного формата." +
                    " Должно быть передано целое число.");
        }

    }

    public static String getRoman () {return roman;} // получить значение римского числв

    // массив с арабскими числами по тому же заданному диапозону, что и для римских
    public static void setRomanNumAtInt (int min, int max){
        int minMethod = min;
        int[] romanNumAtMethod = new int[max];
        for (int i = 0; i < max; i++, minMethod++) { // инициализирую массив заданным диапозоном чисел
            romanNumAtMethod[i] = minMethod;
        }
        romanNumAtInt = romanNumAtMethod; // инициализирую массив, который смогу получить вне этого метода
        RomanNumbers.setRomanNumAtString(min, max);
    }
    public static int [] getRomanNumAtInt () {return romanNumAtInt;}

    // массив  с римскими числами
    public static void setRomanNumAtString (int min, int max){
        String [] romanStrAtMethod = new String[max];
        int minMethod = min;
        for (int i = 0; i < max; i++, minMethod++){
            RomanNumbers.convertationArabicToRoman(minMethod);
            romanStrAtMethod[i] = roman;
        }
        romanNumAtString = romanStrAtMethod;
    }

    public static String [] getRomanNumAtString () {return romanNumAtString;}

}
