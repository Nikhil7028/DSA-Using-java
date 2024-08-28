package LIVE;
class Person{
    public String name;
    public int age;
    public String address; 
}
class Student extends Person{
    public int marks;
    public String grade;
        
    public Student(String name,int age,String address, int marks, String grade){
        this.name=name;
        this.age=age;
        this.address=address;
        this.marks=marks;
        this.grade=grade;
    }
    void display(){
        System.out.println("Name is            :: "+name);
        System.out.println("Age of student     :: "+age);
        System.out.println("Address of student :: "+address);
        System.out.println("Grade of student   :: "+grade);
    }
}

public class StudInheritance {
    public static void main(String[] args) {
        Student st=new Student("Nikhil", 21, "Paithan kaij", 73, "A");
        st.display();
    }
}
