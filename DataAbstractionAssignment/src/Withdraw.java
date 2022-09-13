import java.util.Date;

public class Withdraw {
    //Fields
    private double amount;
    private Date date;
    private String account;


    //Withdraw constructor
    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }


    //Requires: string
    //Modifies: this
    //Effects: if account is "Checking" return withdraw statement into account: Checking.
    //         if account is "Saving" return withdraw statement into account: Saving.
    public String toString(){
        if (account.equals("Checking")) {  // If customer withdraws from checking account
            return "Withdrawing: $" + amount + " Date: " + date + " into account: Checking";
        }
        else { // If customer withdraws from saving account
            return "Withdrawing: $" + amount + " Date: " + date + " into account: Saving";
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
    public static void main(String[] args) {
        //Create date object to get the date
        Date date = new Date();

        //Create withdraw objects
        Withdraw withdraw1 = new Withdraw(400, date, "Checking");
        Withdraw withdraw2 = new Withdraw(500, date, "Saving");

        //Display withdrawn objects using toString method
        System.out.println(withdraw1.toString());
        System.out.println(withdraw2.toString());
    }

}