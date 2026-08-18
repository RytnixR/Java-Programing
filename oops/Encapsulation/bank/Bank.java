package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getter and setters is use to access private modifier
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class Bank{
    public static void main(String[] args) {
        Account acc1 = new Account();
       acc1.name = "Rytnix";
       acc1.email = "rytnix@gmail.com";
       acc1.setPassword("kickbatoskick");
       System.out.println(acc1.getPassword());

    }
}