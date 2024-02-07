package ch03.sec01;

public class IncDecOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        System.out.println("x=" + x);

        ++x;
        System.out.println("x=" + x);

        y--;
        System.out.println("y=" + y);

        --y;
        System.out.println("y=" + y);

        System.out.println("===============");

        //선대입 후증가(z에 값을 대 입후 x값을 증가시킨다.
        z= x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        z= ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        //현재 x는 14, y는 8
        z = ++x + y++; // 더해질때 x는 15, y는 8
        // 더해지고나서 x는 15, y는 9
        z= ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
