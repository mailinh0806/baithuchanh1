import java.util.Scanner;
public class App74 {
    public static void main(String[] args){
        int[] Array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < Array.length; i++){
            Array[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] % 2 == 0){
                sum += Array[i];
            }
        }
        System.out.println(sum);
        input.close();
    }
}
