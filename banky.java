package pro;
 import java.util.*;

class bankac{
    private String acnum;
    private String acholdername;
    private double balance;
    public bankac (String acnum,String acholdername){
        this.acnum= acnum;
        this.acholdername=acholdername;
        this.balance=0.0;

    }
    public String getacnum(){
        return acnum;


    }
public String getacholdername(){
    return acholdername;

}
public double getbalance(){
    return balance;

}
public void depoist(double amount){
    if (amount >0){
        balance+=amount;
        System.out.println("Deposited:--"+ amount+"  into account:--"+acholdername);
    }
    else
    {
        System.out.println("Invalid deposit amount");
    }
}

 public void withdraw (double amount ){
    if  (amount >0 && amount <=balance ){
        balance =balance -amount;
        System.out.println("Withdrawn "+ amount +"from acount "+acholdername);
    }
    else {
        System.out.println("Insufficient balance:-");
    }
 }

  public void transfer(bankac recipient ,double amount ){
    if (amount >0 && amount <=balance ){
        withdraw(amount );
        recipient.depoist(amount);
        System.out.println("Transfer Rupees:- "+amount +" form account:- "+acholdername+"  to account:-"+ recipient.getacholdername());
    }
    else{
        System.out.println("Invalid transfer amount or Insufficient balance ");
    }
  }

}
 

public class banky {
    public static void main(String[] args) {
        
         bankac ac1= new bankac("301", "dharmu");
         bankac ac2= new bankac("555", "dhaya");


         ac1.depoist(1000);
         ac2.withdraw(400);

         ac1.transfer(ac2,300);

         System.out.println("Account Number :-"+ ac1.getacholdername()+"  Balance: rupees:-"+ac1.getbalance());
         System.out.println("Account Number :-"+ ac2.getacholdername()+"  Balance: rupees:-"+ac2.getbalance());
    }
}