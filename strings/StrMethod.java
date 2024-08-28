package strings;

public class StrMethod {
    public static void main(String[] args) {
        String a="abc";
        String b="dbc";
        String x="abc";

        //compareTo(); comapre string lexographically {it will subtract the ascii value}
        
        System.out.println("-----------CompareTo---------------");
        System.out.println("CompareTo : "+a.compareTo(b));
        System.out.println("CompareTo : "+a.compareTo(x));

        System.out.println("----------Contain function----------------");
        System.out.println("Contain function "+a.contains("b"));
        System.out.println("Contain function "+a.contains("x")); 

        System.out.println("-----------startWith---------------");
        System.out.println("Start with "+a.startsWith("a"));
        System.out.println("Start with "+a.startsWith("c"));

        System.out.println("-----------endswith---------------");
        System.out.println("Start with "+a.endsWith("a"));
        System.out.println("Start with "+a.endsWith("c"));

        System.out.println("-----------Case---------------");
        System.out.println("lower case "+a.toLowerCase());
        System.out.println("upper case "+a.toUpperCase());

        




    }
}
