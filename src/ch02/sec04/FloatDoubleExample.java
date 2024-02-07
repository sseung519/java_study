package ch02.sec04;

import org.w3c.dom.ls.LSOutput;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 (float < double)
        float var1 = 0.1234567890123456789f; //실수형은 기본 리터럴을 double 타입으로 인식하므로 float를 사용할 때에는 f를 붙여야함.
        double var2 = 0.123456789123456789;

        System.out.println(var1);
        System.out.println(var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3.0 x 10^6
        System.out.println("var3:" + var3);

        float var4 = 3e6f;
        System.out.println("var4:" + var4);

        double var5 = 2e-3; // 2.0 x 10^(-3)
        System.out.println("var5:" + var5);
    }
}
