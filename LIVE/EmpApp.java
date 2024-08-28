package LIVE;

class Employee{
    private String eid;
    private String ename;
    private int eage;
    private String eaddress;

    public void seteid(String eid){
        this.eid=eid;
    }
    public void setename(String ename){
        this.ename=ename;
    }
    public void seteage(int eage){
        this.eage=eage;
    }
    public void seteaddress(String eaddress){
        this.eaddress=eaddress;
    }
    
    public String geteid(){
        return eid;
    }
    public String getename(){
        return ename;
    }
    public int geteage(){
        return eage;
    }
    public String geteaddress(){
        return eaddress;
    }


}

public class EmpApp {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.seteid("MC232512");
        emp.setename("Nikhil");
        emp.seteage(22);
        emp.seteaddress("Paithan kaij");

        System.out.println("Employee id is      :: "+emp.geteid());
        System.out.println("Employee name is    :: "+emp.getename());
        System.out.println("Employee age is     :: "+emp.geteage());
        System.out.println("Employee address is :: "+emp.geteaddress());
        
    }
    
}
