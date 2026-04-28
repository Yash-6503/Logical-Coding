
import java.util.*;

public class Fibonacii{
    void main(){
        try(Scanner sc = new Scanner(System.in);){

            System.out.println("Enter a number : ");
            int n = sc.nextInt();

            int first = 0;
            int second = 1;
            int sum = 0;
            for(int i=0; i<=n; i++){
                int third = first + second;
                IO.print(first+" ");
                first = second;
                second = third;
            }

        }catch(Exception e){
            IO.println(e.getMessage());
        }
    }
}