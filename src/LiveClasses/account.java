package LiveClasses;

public class account {
    //Data security
    private double balance;

    //methods :: public
    public double getBalance(double balance){
        //withdrawing the money
        return 0.0f;
    }

    //methods :: public
    public void setBalance(double balance){

        //perform authentication
        boolean result = validate("sachin","tendulkar");

        if (result==true)
        {
            //deposit the money
            this.balance = this.balance + balance;
            System.out.println("Credited to the account");
        }
        else
        {
            //throw a meaningful message to the user
            System.out.println("Invalid username/password try again....");
        }
    }

    //method :: private
    private boolean validate(String userName,String password)
    {
        //logic for authentication
        return userName.equalsIgnoreCase("sachin")
                && password.equals("sachin123") ;
    }
}

    class TestApp1
    {
        public static void main(String[] args)
        {
            account acc = new account();
            acc.setBalance(1000.0);
        }
    }


