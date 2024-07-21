

/* Creating a CreditCard class which inheritance the property of class BankCard
    which makes it sub class of BankCard class */
    
public class CreditCard extends BankCard
{
    /* declaring instance variables with different data type
        using private access modifier */
    
    private int CVCNumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean IsGranted;
    
    //creating a constructor with eight parameters
    public CreditCard(int balanceamount, int cardId, String bankaccount, String issurebank, String clientname, int CVCNumber,double InterestRate, String ExpirationDate)
    {
        super(balanceamount,cardId,bankaccount,issurebank);
        // calling of constructor in super class with four parameters
        
        super.setClientname(clientname);
        //calling to a mutator method setClientname in super class
        
        // assigning values to instance variables
        this.CVCNumber=CVCNumber;
        this.InterestRate=InterestRate;
        this.ExpirationDate=ExpirationDate;
        this.IsGranted=false;
        
    }
    
    // creating accessor method for CVCNumber variable
    public int getCvcnumber()
    {
        return this.CVCNumber;
    }
    
    // creating accessor method for CreditLimit variable
    public double getCreditlimit()
    {
        return this.CreditLimit;
    }
    
    // creating accessor method for InterestRate variable
    public double getInterestrate()
    {
        return this.InterestRate;
    }
    
    // creating accessor method for Expiration variable
    public String getExpirationdate()
    {
        return this.ExpirationDate;
    }
    
    // creating accessor method for GracePeriod variable
    public int getGraceperiod()
    {
        return this.GracePeriod;
    }
    
    // creating accessor method for IsGranted variable
    public boolean getIsgranted()
    {
        return this.IsGranted;
    }
    
    /* creating a mutator method to set the credit limit and
      grace period of credit card */
    public void setcreditlimit(double CreditLimit, int GracePeriod)
    {
        /* checking the balance amount as if it is 2.5 the credit 
            limit assign in setcreditlimit */
        if(CreditLimit <= 2.5* getBalanceAmount())
        {
            //assigning the value of attributes present as the parameter
            this.CreditLimit= CreditLimit;
            this.GracePeriod=GracePeriod;
            
            // setting IsGranted value 
            this.IsGranted=true;
            
        }
        
        else
        {
            System.out.println("You don't have enough balance in your account");
            /* displays when the credit limit exceeds
             2.5 times of the balance amount in the client account */
        }
    }
    
    // method to remove client's credit card and assign new value to different attributes
    public void cancelCreditCard()
    {
        
        this.CVCNumber=0; // assigning value to zero
        this.CreditLimit=0; // assigning value to zero
        this.GracePeriod=0; // assigning value to zero
        this.IsGranted= false;
        //revoking IsGranted value
        
    }
    
    /* method to display details of CreditCard and 
        overrides the display method of BankCard class */
    public void display()
    {
        // checking the conditions
        if(IsGranted==true)
        {
            super.display();
            // call to BankCard display method
            
            // details of CreditCard
            System.out.println("CVC Number:"+CVCNumber);
            System.out.println("Interest Rate:"+InterestRate);
            System.out.println("Expiration Date:"+ExpirationDate);
            System.out.println("is Granted:"+IsGranted);
            System.out.println("Credit Limit:"+CreditLimit);
            System.out.println("Grace Period:" +GracePeriod);
            /* displays all the value of attributes present in BankCard 
             and CreditCard when the condition is satisfied*/ 
        }
        
        else
        {
            // displays when the credit card is not granted
            System.out.println("CVC Number:"+CVCNumber);
            System.out.println("Interest Rate:"+InterestRate);
            System.out.println("Expiration Date:"+ExpirationDate);
            System.out.println("is Granted:"+IsGranted);
            
        }
        
    }
    
}    
