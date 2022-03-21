import java.util.Scanner;

public class ptb2 {

    float a, b, c;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        this.a = sc.nextFloat();
        System.out.print("b= ");
        this.b = sc.nextFloat();
        System.out.print("c= ");
        this.c = sc.nextFloat();
        sc.close();
    }

    public void nghiem() {

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("pt co 2 nghiem: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("pt co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("pt vo nghiem");
        }

    }
}