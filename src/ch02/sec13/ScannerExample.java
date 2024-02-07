package ch02.sec13;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
// 2. scanner에서 값 입력받기
        String strX = scanner.nextLine();

        System.out.print("y값 입력: ");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("x + y = " + result);

        //계속 입력을 받을 수 있게 만들고 q를 입력했을 때, 프로그램 종료
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            //data에 입력된 값이 q인가?
            if (data.equals("q")) {
                break; //while문 중단
            }
            System.out.println("출력문자열: " + data);
        }
        //while문 탈출 후 찍는 문자
        System.out.println("프로그램 종료");
    }
}
