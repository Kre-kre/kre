package chapter1;


import chapter1.varianta.*;
import chapter1.variantb.*;

import static chapter1.helper.UserInputReader.getIntUserInput;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = getIntUserInput();

        //1. Четные и нечетные числа.
        OddEvenNumbersPrinter oddEvenNumbersPrinter = new OddEvenNumbersPrinter();
        oddEvenNumbersPrinter.printNumbers(numbers);

        //2. Наибольшее и наименьшее число.
        MaxMinNumberPrinter maxMinNumberPrinter = new MaxMinNumberPrinter();
        maxMinNumberPrinter.printNumbers(numbers);

        //3. Числа, которые делятся на 3 или на 9.
        //4. Числа, которые делятся на 5 и на 7.
        NumberDivisor numberDivisor = new NumberDivisor();
        numberDivisor.printDivisionNumbers(numbers);

        //5. Элементы, расположенные методом пузырька по убыванию модулей.
        BubbleSorter bubbles = new BubbleSorter();
        bubbles.printSortedNumbers(numbers);

        //6. Приветствовать любого пользователя при вводе его имени через команд-
        //ную строку.
        Greeter hello = new Greeter();
        hello.printHello();


        //7. Отобразить в окне консоли аргументы командной строки в обратном
        //порядке.

        ReverseArgsPrinter revers = new ReverseArgsPrinter();
        revers.printRevers(args);

        //8. Вывести заданное количество случайных чисел с переходом и без перехода
        //на новую строку.

        RandomNumbersPrinter randomNumbers = new RandomNumbersPrinter();
        randomNumbers.printRandomNumbers(6);
        //9. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        PasswordChecker checkPassword = new PasswordChecker();
        checkPassword.check();

        //10. Ввести целые числа как аргументы командной строки, подсчитать их сум-
        //мы (произведения) и вывести результат на консоль.
        SumAndMultiArgsPrinter sumMulti = new SumAndMultiArgsPrinter();
        sumMulti.printNumbers(args);


        //11.Все трехзначные числа, в десятичной записи которых нет одинаковых
        //цифр.
        UniqueDigitsPrinter uniqueDigitsPrinter = new UniqueDigitsPrinter();
        uniqueDigitsPrinter.printUniqueNumbers();

        //12. Отсортированные числа в порядке возрастания и убывания.

        BothOrderSortedNumberPrinter increaseNumbers = new BothOrderSortedNumberPrinter();
        increaseNumbers.printSorted(numbers);
        increaseNumbers.printSortedArray(numbers);

        //13. Простые числа.

        PrimeNumberChecker sortSimpleNumbers = new PrimeNumberChecker();
        sortSimpleNumbers.printNumbers(numbers);

    }
}
