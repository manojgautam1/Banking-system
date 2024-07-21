
/* Creating a DebitCard class which inheritance the property of class BankCard
    which makes it sub class of BankCard */
    
public class DebitCard extends BankCard
{
    
    /* declaring instance variables with different data type
        using private access modifier */
               
    private int PINnumber;
    private int Withdrawalamount;
    private String dateofWithdrawal;
    private boolean hasWithdrawal;
    
    //creating a constructor with six parameters
    public DebitCard(int balanceamount,int cardId,String bankaccount,String issurebank,String clientname,int PINnumber)
    {
        super(balanceamount,cardId, bankaccount,issurebank);
        // calling of constructor in super class with four parameters
        
        super.setClientname(clientname);
        //calling to a mutator method setClientname in super class
        
        // assigning values to instance variable
        this.PINnumber=PINnumber; 
        hasWithdrawal= false;  
        
    }
    
    // creating accessor method for PINnumber variable
    public int getpinNumber()
    {
        return this.PINnumber;
    }
    
    // creating accessor method for Withdrawalamount variable
    public int getwithDrawalAmount()
    {
        return this.Withdrawalamount;
    }
    
    // creating accessor method for dateofWithdrawal variable
    public String getDateofwithdrawal()
    {
        return this.dateofWithdrawal;
    }
    
    // creating accessor method for hasWithdrawal variable
    public boolean getHaswithdrawal()
    {
        return this.hasWithdrawal;
    }
    
    // creating mutator method to set new Withdrawalamount
    public void setwithdrawalamount(int Withdrawalamount)
    {
        this.Withdrawalamount=Withdrawalamount;
    }
    
    // creating a method to accept PINnumber and deduct the balanceamount from client account
    public void Withdraw(int Withdrawalamount, int PINnumber, String dateofWithdrawal)
    {
        
        // checking if the provided PINnumber is same in client account
        if(PINnumber==this.PINnumber)
        {
            //checking if the withdrawal amount is present in the client account
            if(Withdrawalamount<= getBalanceAmount())
            {
                // assigning new value to variables
                this.dateofWithdrawal=dateofWithdrawal;
                this.Withdrawalamount=Withdrawalamount;
                
                System.out.print("withdrawal successful");
                this.hasWithdrawal= true;
                
                //recalculating the main balance amount in the clien account
                setBalanceamount(getBalanceAmount()-Withdrawalamount);
                System.out.println("Remaining balance:"+getBalanceAmount());
                //displaying the money in bankaccount of the client
            }
            
            else
            {
                System.out.println("You don't have enough balance");
                // displays when withdrawal amount is greater than available balance 
            }
            
        }
        
        else
        {
            System.out.println("The provided pin is invalid. Please try again");
            // displays when pin number does not match in the client account
        }
        
    }
    
    // method to display details of debit and overrides the display method of super class
    public void display()
    {
        super.display();
        // call to BankCard display method
        
        System.out.println("Your pin number:"+PINnumber);
        System.out.println("Withdrawn amount:"+Withdrawalamount);
        System.out.println("Withdrawn date:"+dateofWithdrawal);
        
        // when withdrawal has not been done yet 
        if(this.hasWithdrawal==false)
        {
            System.out.println("Available balance:"+getBalanceAmount());
        }
        
    }
    
}

