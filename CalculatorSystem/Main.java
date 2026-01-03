package CalculatorSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        UserInterface user1 = new User();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        BigInteger num1 = new BigInteger( sc.nextLine() );
        user1.setNum1(num1.intValue());
        System.out.println("Enter num2 :");
        BigInteger num2 = new BigInteger( sc.nextLine() );
        user1.setNum2(num2.intValue());
        System.out.println("Enter num3 :");
        BigInteger num3 = new BigInteger( sc.nextLine() );
        user1.setNum3(num3.intValue());
        System.out.println("Enter Calculator type :");
        String type = sc.nextLine();
        user1.setCalculatorType(type);



        if(user1.getCalculatorType().equals("Adder")){
            CalculatorInterface add = new Adder(7,user1);
            user1.setAdd(add);
            add.compute();
            add.calculate(10);
            add.calculate(4,3);
            add.calculate(10,5,1);
        }
        else if(user1.getCalculatorType().equals("Multiplier")){
            MultiplierInterface mul = new Multiplier(8,user1);
            user1.setMul(mul);
            mul.compute();
        }
        else {
            System.out.println("Enter a valid Calc type ");
        }


        UserInterface user2 = new User();

        System.out.println("Enter num1 :");
        BigInteger num = new BigInteger( sc.nextLine() );
        user2.setNum1(num.intValue());
        System.out.println("Enter num2 :");
        BigInteger num11 = new BigInteger( sc.nextLine() );
        user2.setNum2(num11.intValue());
        System.out.println("Enter num3 :");
        BigInteger num22 = new BigInteger( sc.nextLine() );
        user2.setNum3(num22.intValue());
        System.out.println("Enter Calculator type :");
        String type1 = sc.nextLine();
        user2.setCalculatorType(type1);


        if(user2.getCalculatorType().equals("Adder")) {
            CalculatorInterface add = new Adder(9, user2);
            user2.setAdd(add);
            add.compute();
        }

        else if(user2.getCalculatorType().equals("Multiplier")){
            MultiplierInterface mul = new Multiplier(10,user2);
            user2.setMul(mul);
            mul.compute();
        }
        else {
            System.out.println("Enter a valid Calc type ");
        }


    }
}