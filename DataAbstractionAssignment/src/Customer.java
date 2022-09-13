import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    //Fields
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private double checkDeposit;
    private double savingDeposit;
    private double amt;
    private Date date;
    private String account;


    Customer(){
        //Create default Customer constructor
        name = "";
        accountNumber = 1;
        checkDeposit = 400.0;
        savingDeposit = 400.0;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //Customer constructor with parameters
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkDeposit = checkDeposit;
        this.savingDeposit = savingDeposit;
    }


    //Requires: double, amt
    //Modifies: this, deposits
    //Effects: if the account is "Checking", the amt is equal to the checkBalance.
    //         if the account is "Saving", the amt is equal to the savingBalance.
    public double deposit(double amt, Date date, String account){
        if (account.equals("Checking")) {
            amt = checkBalance;
        }
        else if (account.equals("Saving")) {
            amt = savingBalance;
        }
        return 0;
    }


    //Requires: double, amt
    //Modifies: this, withdraws
    //Effects: if the account is "Checking", the amt is equal to the checkBalance - checkDeposit.
    //         if the account is "Saving", the amt is equal to the savingBalance - savingDeposit.
    public double withdraw(double amt, Date date, String account){
        if (account.equals("Checking")) {
            amt = checkBalance - checkDeposit;
        }
        else if (account.equals("Saving")) {
            amt = savingBalance - savingDeposit;
        }

        // Check overdraft for withdraw method
        if (amt > amt + 100) {
            return OVERDRAFT;
        }

        return 0;
    }


    //Requires: double, amt
    //Effects: returns false if the overdraft is bigger than 100
    private boolean checkOverdraft(double amt, String account) {
        if (OVERDRAFT > 100) {
            amt = -amt;
        }
        return false;
    }


    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }


    //Getters to access private fields in other classes
    public int getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public String getName() {
        return name;
    }

    public final int getOVERDRAFT() {
        return OVERDRAFT;
    }

    public double getCheckDeposit() {
        return checkDeposit;
    }

    public double getSavingDeposit() {
        return savingDeposit;
    }

    public double getAmt() {
        return amt;
    }

    public Date getDate() {
        return date;
    }

    public String getAccount() {
        return account;
    }



    //Usage Method
    public static void main(String [] args) {
        //Create a customer object
        Customer customer = new Customer("Bob", 30, 400, 400);

        //Create deposits ArrayList and withdraws ArrayList
        ArrayList<Deposit> deposits = new ArrayList<>();
        ArrayList<Withdraw> withdraws = new ArrayList<>();

        //Create date object to get the date
        Date date = new Date();

        //Create deposit objects and add them to deposits ArrayList
        Deposit deposit1 = new Deposit(400, date,"Checking");
        deposits.add(deposit1);
        Deposit deposit2 = new Deposit(500, date,"Saving");
        deposits.add(deposit2);

        //Create withdraw objects and add them to withdraws ArrayList
        Withdraw withdraw1 = new Withdraw(400, date, "Checking");
        withdraws.add(withdraw1);
        Withdraw withdraw2 = new Withdraw(500, date, "Saving");
        withdraws.add(withdraw2);

        //Display deposit objects
        System.out.println(deposit1.toString());
        System.out.println(deposit2.toString());

        //Display withdraw objects
        System.out.println(withdraw1.toString());
        System.out.println(withdraw2.toString());

        //Display deposits ArrayList and withdraws ArrayList
        System.out.println("deposits Arraylist: " + deposits);
        System.out.println("withdraws Arraylist: " + withdraws);
    }

}
