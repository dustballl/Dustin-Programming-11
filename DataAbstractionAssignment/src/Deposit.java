import java.util.Date;

public class Deposit {
    //Fields
    private double amount;
    private Date date;
    private String account;


    //Deposit constructor
    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }


    //Requires: string
    //Modifies: this
    //Effects: if account is "Checking" return deposit statement into account: Checking.
    //         if account is "Saving" return deposit statement into account: Saving.
    public String toString(){
        if (account.equals("Checking")) {  // If customer deposits into checking account
            return "Deposit of: $" + amount + " Date: " + date + " into account: Checking";
        }
        else {  // If customer deposits into saving account
            return "Deposit of: $" + amount + " Date: " + date + " into account: Saving";
        }
    }


    //Getters to access private fields in other classes
    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getAccount() {
        return account;
    }



    //Usage Method
    public static void main(String [] args) {
        //Create date object to get the date
        Date date = new Date();

        //Create deposit objects
        Deposit deposit1 = new Deposit(400, date,"Checking");
        Deposit deposit2 = new Deposit(500, date,"Saving");

        //Display deposit objects using toString method
        System.out.println(deposit1.toString());
        System.out.println(deposit2.toString());
    }

}