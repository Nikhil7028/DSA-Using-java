package LIVE;

import Recusion.print1toN;

// public class Student{
//     private int rollno;
//     private String name;
//     private String address;

//     public void setrollno(int rollno){
//         this.rollno=rollno;
//     }
//     public void setname(String name){
//         this.name=name;
//     }
//     public void setaddress(String address){
//         this.address=address;
//     }
//     public int getrollno(){
//         return rollno;
//     }
//     public String getname(){
//         return name;
//     }
//     public String getaddress(){
//         return address;
//     }
    
// }

class StudentApp {
    public static void main(String[] args) {
        Student Nikhil=new Student();
        Nikhil.setrollno(123);
        Nikhil.setname("Nikhil Choudhari");
        Nikhil.setaddress("Paithan, Beed");

        System.out.println("Your rollno is :: "+Nikhil.getrollno());
        System.out.println("Your name is   :: "+Nikhil.getname());
        System.out.println("address is     :: "+Nikhil.getaddress());

    }
    
}
