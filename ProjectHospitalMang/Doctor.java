package ProjectHospitalMang;

public class Doctor {
    private static int idcounter=1;
    private int id;
    private String name;
    private String speciality;

    public Doctor(String name, String speciality){
        this.id= idcounter++;
        this.name=name;
        this.speciality=speciality;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "Name: "+name+", speciality "+speciality;
    }    
}
