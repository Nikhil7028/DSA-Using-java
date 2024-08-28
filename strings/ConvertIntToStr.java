package strings;
// Take integer as input and convert it into a string
import java.util.Scanner;

public class ConvertIntToStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int num=sc.nextInt();
        
        String dami="";
        dami+=num;
        System.out.println(dami);
    }
    
}
