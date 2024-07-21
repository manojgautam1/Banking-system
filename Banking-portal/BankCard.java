
/* Creating the BankCard which is the super class of sub classes DebitCard and
   CreditCard. This show the hierarchical inheritance among the three classes. */
   
   
   public class BankCard
   {
           /* declaring instance variables with different data type
               using private access modifier */
               
           private int cardId; 
           private String clientname;
           private String issurebank;
           private String bankaccount;
           private int balanceamount;
           
           //creating a constructor with four parameters 
           public BankCard(int balanceamount,int cardId, String bankaccount,String issurebank)
           {
               
               this.clientname =""; 
               //initializing clientname to empty string
               
               // assigning values to instance variables
               this.cardId= cardId;
               this.bankaccount= bankaccount;
               this.balanceamount= balanceamount;
               this.issurebank= issurebank;
           }
           
           // creating accessor method for cardId variable
           public int getCardid()
           {
               return this.cardId;
           }
           
           // creating accessor method for clientname variable
           public String getClientName()
           {
               return this.clientname;
           }
           
           // creating accessor method for issurebank attribute
           public String getIssureBank()
           {
               return this.issurebank;
           }
           
           // creating accessor method for bankaccount attribute
           public String getBankAccount()
           {
               return this.bankaccount;
           }
           
           // creating accessor method for balanceamount attribute
           public int getBalanceAmount()
           {
               return this.balanceamount;
           }
           
           // creating mutator method to set new clientname
           public void setClientname(String clientname)
           {
               this.clientname= clientname;
           }
           
           // creating mutator method to set new balanceamount
            public void setBalanceamount(int balanceamount)
           {
               this.balanceamount= balanceamount;
           }
           
           //to display the values of the all the attributes in the BankCard Class
           public void display()
           {
               
               // checking if the clientname is assigned or not in mutator method setClientname
               if(clientname.equals(""))
               {
                  System.out.print("You have no name please try to put your name. Thank you!");
                  //displays when clientname is not assign
               }
               
               else
               {
                  System.out.print("Hello, Mr/Mrs "+clientname);
                  // displays if the clientname is assign
                }
                
                /* always display all these information without being
                    affected from the given condition */
                
                System.out.println("Card No:"+cardId);
                System.out.println("Account no:"+bankaccount);
                System.out.println("Remaining Balance:"+balanceamount);
                System.out.println("Card Issure Bank:" +issurebank);
            }
   }