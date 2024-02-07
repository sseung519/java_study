package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        boolean result = (x == 20);
        boolean result2 = (x != 20);

        System.out.println("result:"+result);
        System.out.println("result2:"+result2);

        boolean stop = true;
        if(stop){
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }
    }
}
