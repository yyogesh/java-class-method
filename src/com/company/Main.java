package com.company;

public class Main {

    static void printMethod() {
        System.out.println("its simply a print statement");
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static int addReturn(int a, int b) {
        return a + b;
    }

    int addReturnNotStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
	// write your code here
        printMethod();
        add(5, 2);
        add(10, 10);
        add(9, 77);
        int result = addReturn(5, 10);
        System.out.println("Result of sum of two number is " + result);
        add(result, 10);

        Main calc = new Main();
        int result1 = calc.addReturnNotStatic(10, 20);
        System.out.println("Result of sum of two number is " + result1);

        Main calc1 = new Main();
        int result2 = calc.addReturnNotStatic(10, 20);
        System.out.println("Result of sum of two number is " + result2);

        Calculator casio = new Calculator();
        int result3 = casio.square(10);
        System.out.println("Result of sum of two number is " + result3);

        Calculator abc = new Calculator();
        System.out.println("Result of sum of two number is " + casio.square(11));

        System.out.println("Result of sum of two number is " + Math.sqrt(5));


        Student ajay = new Student();

        ajay.setName("Ajay Kumar");
        System.out.println("Person name is  " + ajay.getName());


        Mobile iphone11 = new Mobile();
        System.out.println("IPhone 11 IMEI  " + iphone11.getIMEI());

        Mobile iphone12 = new Mobile();
        System.out.println("IPhone 12 IMEI  " + iphone12.getIMEI());
    }
}

class Calculator {
    public int square(int a) {
        return a * a;
    }
}
