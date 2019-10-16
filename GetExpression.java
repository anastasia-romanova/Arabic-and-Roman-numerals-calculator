package com.romanova;

import java.util.Scanner;

public class GetExpression {
    private static String [] expArr = new String[3];
    private static boolean trueExp = true;

    // создаю массив с выражением
    public static void getExpression (int min, int max ){
        System.out.println("Введите выражение с двумя числами от " + min + " до " + max + ".\n" +
        "Числа должны быть одного типа (арабские или римские) и выражение должно содержать пробелы " +
                "до и после арифметического оператора:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine(); // получаю строку с выражением
        try {
            String [] expArrMeth = expression.split(" "); // инициализирую массив выражением
            expArr = expArrMeth;
            if (expArr.length != 3) {// проверяю на количество переменных
                System.out.println("Вы ввели выражение не в верном формате");
                trueExp = false;
            }
        } catch (Exception e) {
            System.out.println("Вы ввели выражение не в верном формате");
            System.exit(0);
        }
    }
    public static boolean getTrueExp () {return trueExp;}
    public static String[] getExpArr (){return expArr;} // получить массив выражения
}
