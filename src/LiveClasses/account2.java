package LiveClasses;

public class account2 {

        //Data security
        private double balance;

        //methods :: public
        public double getBalance(double balance){

            //perform authentication
            boolean result = validate("sachin","tendulkar");

            //withdrawing the money
            if (result == true)
            {
                this.balance = this.balance - balance;
                return balance;
            }
            else
            {
                //throw a meaningful message to the user
                System.out.println("Invalid username/password try again....");
                return 0.0;
            }


        }

        //methods :: public
        public void setBalance(double balance){

            //perform authentication
            boolean result = validate("sachin","sachin123");

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

    class TestApp
    {
        public static void main(String[] args)
        {
            account2 acc = new account2();
            acc.setBalance(1000.0);

            double balance=acc.getBalance(500.0);
            System.out.println("Witdrawing :: "+balance +" Amount");
        }
    }

