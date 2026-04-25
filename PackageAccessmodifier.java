package bank;
class Account{
    public String name;
    protected String email;
    private String password;

     //getter&setter
    public String getPassword(){
        return this.password;
    }
     public void setPassword(String pass){
        this.password=pass;
    }
}
public class PackageAccessmodifier {
    public static void main(String[]args){
        Account ac1=new Account();
        ac1.name="Aman";
        ac1.email="amanyxyz@gmail.com";
        //ac1.password="abcd";cannot be accesed
        ac1.setPassword("abcd");
        System.out.println(ac1.getPassword());

    }
}
