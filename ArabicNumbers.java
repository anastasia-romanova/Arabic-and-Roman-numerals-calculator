package com.romanova;

import java.util.Arrays;

public class ArabicNumbers {
    private static int[] arabNum;
    private static String[] arabNumAtString;

    public static void setArabNum(int min, int max) {
        int[] arabNumAtMethod = new int[max];
        for (int i = 0; i < max; i++, min++) { // инициализирую массив заданным диапозоном чисел
            arabNumAtMethod[i] = min;
        }
        arabNum = arabNumAtMethod; // инициализирую массив, который смогу получить вне этого метода
        arabNumAtString = Arrays.toString(arabNum).split("[\\[\\]]")[1].split(", "); // инициализирую массив в String  типе
    }

    public static int [] getArabNum (){return arabNum;}
    public static String [] getArabNumAtString () {return arabNumAtString;}

}
