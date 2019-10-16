package com.romanova;


public class Main {

    public static void main(String[] args) {
        int min = 1; // задаю  минимально возмножное число для выражения
        int max = 10; // задаю максимально возможное число для выражения
        ArabicNumbers.setArabNum(min, max); // инициализирую массив всеми возможными вариантами получения АРАБСКИХ чисел из заданного диапозона
        RomanNumbers.setRomanNumAtInt(min, max); // инициализирую массив всеми возможными вариантами получения РИМСКИХ
                                                 // и соответствующих арабских чисел из заданного диапозона
        GetExpression.getExpression(min, max); // создаю массив с полученным выражением
        if (GetExpression.getTrueExp()) // проверяю массив на количество элементов
        UnderstandNumbers.understandNumbers(GetExpression.getExpArr(), ArabicNumbers.getArabNumAtString(),
                RomanNumbers.getRomanNumAtString(), RomanNumbers.getRomanNumAtInt()); // запускаю процесс по получению результата выражения
    }
}
