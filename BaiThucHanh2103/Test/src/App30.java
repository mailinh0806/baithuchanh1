import java.util.Scanner;
public class App30 {
     public static int main(String[] args) throws Exception  {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    
    int sum =0;
    while(n > 0){
        sum += n % 10;
        n /= 10;
    }
         
    System.out.println("Sum = " + sum);
    }
}