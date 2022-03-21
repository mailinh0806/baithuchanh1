import java.util.Scanner;

public class person {

    int id = 0;
    String personname = new String("personname");
    boolean gender = true;
    String address = new String("address");

    public void info() {
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        this.id = sc.nextInt();
        System.out.print("name: ");
        sc.nextLine();
        this.personname = sc.nextLine();
        System.out.print("male?: ");
        this.gender = sc.hasNext();
        System.out.print("address: ");
        sc.nextLine();
        this.address = sc.nextLine();
        sc.close();

    }

    public void showinfo() {
        System.out.println("info: ");
        System.out.println("id: " + id);
        System.out.println("person name: " + personname);
        if (gender == true)
            System.out.println("male");
        if (gender == false)
            System.out.print("felmale");
        System.out.println("address: " + address);
    }
}