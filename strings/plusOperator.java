package strings;
// Program to append string using plus operator
public class plusOperator 
{
    public static void main(String[] args) {
        String str="abc", x="tuv";
        str+=x;
        System.out.println("append string using plus operator "+str);
        System.out.println("abc"+10+20);
        System.out.println("abc"+(10+20));

    }
    
}
