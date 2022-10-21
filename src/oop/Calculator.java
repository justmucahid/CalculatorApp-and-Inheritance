package oop;

public class Calculator {
    public static void main(String[] args) {
        /*
         * MathBasic math = new MathBasic();
         * int sayi = math.Overload(1, 2, 3, 4);
         * System.out.println(sayi);
         */

        MathBasic math = new MathBasic();

        int sayi = math.Overload(1, 2, 3, 4);
        System.out.println(sayi);

        String fourSymbols = ("+-*/");
        int number1 = 16;
        int number2 = 4;

        for (int i = 0; i <= fourSymbols.length();) {

            if (i == fourSymbols.indexOf("+")) {
                System.out.println(math.Plus(number1, number2));
                break;
            } else if (i == fourSymbols.indexOf("-")) {
                System.out.println(math.Minus(number1, number2));
                break;
            } else if (i == fourSymbols.indexOf("*")) {
                System.out.println(math.Times(number1, number2));
                break;
            } else if (i == fourSymbols.indexOf("/")) {
                System.out.println(math.Or(number1, number2));
                break;
            } else {
                System.out.println(math.Overload(number1, number2, number1, number2));
                break;
            }

        }

    }

}
