package com.romanova;

import java.util.Arrays;

public class UnderstandNumbers {
    static int[] expForCalc;
    static String arithOperation;
    static String[] typeOfExp;


    // метод с  проверкой входящих данных на типы переменных
    public static void understandNumbers(String[] expression, String [] arabNumAtString,
                                         String [] romanNumAtString, int [] romanNumAtInt) {
        int [] expForCalcMeth = new int [expression.length];
        String [] typeOfExpMeth = new String[expression.length];
        int [] romNumAtMethod =  romanNumAtInt;

        for (int i = 0; i < expression.length; i++) { // проверяю выражение на римские/арабские числа и арифметический оператор
            for (int j = 0; j < arabNumAtString.length; j++) { // циклом проверяю на соответствие арабским числам
                if (expression[i].equals(arabNumAtString[j])) { // если число равно одному из арабских чисел
                    expForCalcMeth[i] = Integer.parseInt(expression[i]); // то оно преобразовывается из строки в число и записывается в отдельный массив
                    typeOfExpMeth[i] = "arabic"; // присваивается тип арабского числа
                }
            }
            for (int j = 0; j < romanNumAtString.length; j++) { // циклом проверяю на соответствие римским  числам
                if (expression[i].equals(romanNumAtString[j])) {  // если число равно одному из римских чисел
                    expForCalcMeth[i] = romNumAtMethod[j]; // то в массив для рассчёта записывается арабский аналог римскому числу
                    typeOfExpMeth[i] = "roman"; // присваивается тип римского числа
                }
            }
            // определение арифметического оператора
            switch (expression[i]){
                case "+":
                    arithOperation = "+";
                    break;
                case "-":
                    arithOperation = "-";
                    break;
                case "*":
                    arithOperation = "*";
                    break;
                case "/":
                    arithOperation = "/";
                    break;
            }
        }
        expForCalc = expForCalcMeth;
        typeOfExp = typeOfExpMeth;
        UnderstandNumbers.understandType(typeOfExp); // запуск метода с проверкой на однотипность чисел
    }

    // проверка на однотипность  чисел
    public static void understandType (String [] typeOfExpMeth){
        try {
            if (typeOfExpMeth[0].equals(typeOfExpMeth[2])) {
                Calculator.calculator(expForCalc, arithOperation, typeOfExp); // запуск подсчёта результата выражения
            } else {
                System.out.println("Вы ввели неверный тип данных.");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Вы ввели неверный тип данных.");
            System.exit(0);
        }
    }

}