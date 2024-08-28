package ProjectHospitalMang;

public class Patient {
    private static int idcounter=1;
    private int id;
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender){
        this.id= idcounter++;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public int getid(){
        return id;
    }
    public String toString(){
        return "Name: "+name+", age: "+ age+", Gender "+gender;
    }
}
