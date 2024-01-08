import java.util.*;
//import java.lang.*;

public class practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int Age = scan.nextInt();
        scan.close();
        
        if (Age >= 18) {
            System.out.println("Applicable for Vote");
        }
        else {
            System.out.println("Not applicable for Vote");
        }
    }
}
