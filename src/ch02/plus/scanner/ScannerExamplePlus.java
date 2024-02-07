package ch02.plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nextLine()입력:");
        String inputNextLine = scanner.nextLine();
        System.out.println((inputNextLine));

        System.out.print("next()입력:");
        String inputNext = scanner.next();
        System.out.println(inputNext);

        System.out.print("int형 입력:");
        int inputInt = scanner.nextInt(); //int타입으로 자동변환
        System.out.println(inputInt);

        System.out.print("double형 입력:");
        double inputDouble = scanner.nextDouble(); //double 타입으로 자동변환
        System.out.println(inputDouble);

        System.out.println("int + double=" + (inputInt + inputDouble));

        System.out.print("boolean형 입력:");
        Boolean inputBoolean = scanner.nextBoolean();
        System.out.println(inputBoolean);
    }
}