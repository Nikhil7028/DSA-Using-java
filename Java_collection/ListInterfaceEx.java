package Java_collection;
import java.util.ArrayList;
public class ListInterfaceEx {
    public static void ArrayListex(){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        System.out.println(al.get(1));
        al.set(1, 100);
        System.out.println(al);
        System.out.println(al.contains(10));
        System.out.println(al.contains(15));
        al.clear();
        System.out.println(al);
    }
    public static void main(String[] args) {
        ArrayListex();
        
    }
    
}
