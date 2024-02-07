package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20; //컴파일 단계에서 연산을 수행하므로 byte result1 = 30; 와 같다.
        System.out.println("result1:" + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; //int 타입으로 변환 후 연산됨 - > int 타입으로 바꿈
        byte result3 = (byte) (v1 + v2); //강제 타입 -> 강제 타입 변환을 시킴
        System.out.println("result:" + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long reulst4 = v3 + v4 + v5; //long타입으로 변환 후 연산됨 -> ★ 값의 허용범위가 큰 타입으로 변환된다.

        float f1 = 1.2f;
        double d1 = 3.4;
        double result5 = f1 + d1; // double 타입으로 변환 후 연산됨 -> 실수끼리 연산도 허용범위 큰 타입으로 변환

        System.out.println("result5=" + result5);

        //자바에서는 실수 리터럴을 double 타입으로 인식하므로 4.0은 double 타입
        int v9 = 10;
        double result6 = v9 / 4.0; //double 타입(실수)으로 변환 후 연산됨
        float result7 = v9 / 4.0f; //float 타입(실수)으로 변환 후 연산됨
        System.out.println("result6:" + result6);

        //char 와 int의 연산
        char v6 = 'A'; //65
        char v7 = 1;
        int result8 = v6 + v7;
        System.out.println("result8:" + result8);
        System.out.println("result8:" + (char) result8);

        int x = 1;
        int y = 2;
        //★정수 연산의 결과는 항상 정수 -> 결과 값인 0.5에서 소수점을 버린다 -> 0
        double result9 = x / y; //0을 double 타입 변수에 저장하므로 0.0이 출력된다
        System.out.println("result9:" + result9);

        //0.5를 얻기 위한 방법 1
        double result10 = (double) x/ y;
        System.out.println("result10:" + result10);

        //0.5를 얻기 위한 방법 2
        double result11 = x/ (double) y;
        System.out.println("result11:" + result11);

        //0.5를 얻기 위한 방법 3
        double result12 = (double) x / (double) y ;
        System.out.println("result12:" + result12);


    }
}
