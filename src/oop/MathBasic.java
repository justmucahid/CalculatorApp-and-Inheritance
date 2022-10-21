package oop;

public class MathBasic {

    public MathBasic() {
        System.out.println("Inheritance a özel diğer ekranda yazdırabilirsin");
        System.out.println("Çünkü makarna kod olmasın");
 
    }

    public int Plus(int number1, int number2) {
        return number1 + number2;
    }

    public int Minus(int number1, int number2) {
        return number1 - number2;
    }

    public int Times(int number1, int number2) {
        return number1 * number2;
    }

    public int Or(int number1, int number2) {
        return number1 / number2;
    }

    public int Overload(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

}
