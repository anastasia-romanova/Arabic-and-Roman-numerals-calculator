package com.romanova;

public class Calculator {
    private static int result;

    public static void calculator (int [] expForCalcMeth, String arithOperation, String [] typeOfExp){
        // вычисление результата выражения
        switch (arithOperation) {
            case "+":
                result = expForCalcMeth[0] + expForCalcMeth[2];
                break;
            case "-":
                result = expForCalcMeth[0] - expForCalcMeth[2];
                break;
            case "*":
                result = expForCalcMeth[0] * expForCalcMeth[2];
                break;
            case "/":
                result = expForCalcMeth[0] / expForCalcMeth[2];
                break;
        }
        if (typeOfExp[0].equals("arabic")) { // при арабских входных данных
        System.out.println(result); // вывод ответа  без изменений
        } else if (typeOfExp[0].equals("roman")){ // при римских входных данных
            RomanNumbers.convertationArabicToRoman(result); // запуск метода конвертации арабских чисел в римские
            System.out.println(RomanNumbers.getRoman()); // вывод ответа римскими цифрами
        }
    }
}
