package LIVE;
class Account{
    private double balance;
    public void setBalance(double balance){
        boolean result= validation("Nikhil","Nikhil123");
        if (result) {
            this.balance=this.balance+balance;
            System.out.println("Amount is credited");
        }
        else{
            System.out.println("You have entered wrong username and password try again.../");
        }
    }
    public double getBalance(){
        boolean result=validation("Nikhil", "Nikhil123");
        if (result) {
        return balance;
        }else{
            System.out.println("You have entered wrong username and password try again.../");
            return 0.0;
        }
    }
    private boolean validation(String user, String pass){
        return user.equalsIgnoreCase("Nikhil") && pass.equals(pass);
    }
}
class TestApp {
    public static void main(String[] args){
        Account acc=new Account();
        acc.setBalance(100.45);
        double balance=acc.getBalance();
        System.out.println("Your account balance is "+balance);
    }    
}
