/*creating a GUI with the attributes from the pervious project */

import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    private JFrame jf;
    private JTabbedPane jtp;
    private JPanel bc_panel,dc_panel,cc_panel;
    private JLabel bcheader,bcclient,bccardid,bcissuer,bcaccount,bcbalance,dc_header,dc_client,dc_balance,dc_issuer,dc_account,dc_cardid,dc_pin,dc_drawalamt,dc_drawaldate,cc_header,cc_client,cc_issuer,cc_account,cc_balance,cc_cvc,cc_interest,cc_expdate,cc_cardid,cc_climit,cc_grace;
    
    private JTextField bctfclient,bctfcardid,bctfissuer,bctfaccount,bctfbalance,dc_tf_client,dc_tf_balance,dc_tf_issuer,dc_tf_account,dc_tf_cardid,dc_tf_pin,dc_tf_drawal_amt,cctf_client,cctf_issuer,cctf_account,cctf_balance,cctf_cvc,cctf_interest,cctf_cardid,cctf_climit,cctf_grace;
    private JComboBox<String> dc_comb_drawaldate,cc_comb_expdate;
    private JButton bc_btn_display,bc_btn_clear,dc_btn_adddebit,dc_btn_drawal,dc_btn_display,dc_btn_clear,cc_btn_addcredit,cc_btn_cancelcard,cc_btn_setlimit,cc_btn_display,cc_btn_clear;
    
    //creating an arraylist of the BankCard Class
    private ArrayList<BankCard> main_al = new ArrayList<BankCard>();
    private BankCard BC;
    private DebitCard DC;
    private CreditCard CC;
    public BankGUI()
    {
        jf =new JFrame("22067877 - Manoj Gautam's : Banking Portal");
        jtp =new JTabbedPane();
        bc_panel= new JPanel();
        dc_panel=new JPanel();
        cc_panel =new JPanel();
        
        //Start of Bank Card panel
        //labels
        bcheader=new JLabel("BANK CARD CLASS");
        bcclient= new JLabel("Client Name :");
        bccardid= new JLabel("Card ID :");
        bcissuer= new JLabel("Issuer Bank :");
        bcaccount= new JLabel("Bank Account :");
        bcbalance= new JLabel("Balance Amount :");
        // text fields for the labels above
        bctfclient= new JTextField();
        bctfcardid= new JTextField();
        bctfissuer= new JTextField();
        bctfaccount= new JTextField();
        bctfbalance= new JTextField();
        
        //buttons for bankcard
        bc_btn_display=new JButton("DISPLAY");
        bc_btn_clear=new JButton("CLEAR");
        //this is for BankCard Class attributes
        bcheader.setBounds(290,20,200,30);
        bcclient.setBounds(190,100,120,40);
        bccardid.setBounds(190,180,120,40);
        bcissuer.setBounds(190,260,120,40);
        bcaccount.setBounds(190,340,120,40);
        bcbalance.setBounds(190,420,120,40);
        
        //text fields for first panel 
        bctfclient.setBounds(340,100,240,40);
        bctfcardid.setBounds(340,180,240,40);
        bctfissuer.setBounds(340,260,240,40);
        bctfaccount.setBounds(340,340,240,40);
        bctfbalance.setBounds(340,420,240,40);
        
        //buttons for bankcard section
        bc_btn_display.setBounds(150,550,180,50);
        bc_btn_clear.setBounds(440,550,180,50);
        
        //setting the font and color of the labels
        bcheader.setFont(new Font("Aerial",Font.BOLD,20));
        bcheader.setForeground(Color.CYAN); //CYAN [red=0, green=255, blue=255]
        bcclient.setForeground(Color.CYAN);
        bccardid.setForeground(Color.CYAN);
        bcissuer.setForeground(Color.CYAN);
        bcaccount.setForeground(Color.CYAN);
        bcbalance.setForeground(Color.CYAN);
        
        bc_btn_display.setBackground(Color.CYAN);
        bc_btn_clear.setBackground(Color.CYAN);
        
        //adding to the first panel for BankCard Class
        bc_panel.add(bcheader);
        bc_panel.add(bcclient);
        bc_panel.add(bccardid);
        bc_panel.add(bcissuer);
        bc_panel.add(bcaccount);
        bc_panel.add(bcbalance);
        
        bc_panel.add(bctfclient);
        bc_panel.add(bctfcardid);
        bc_panel.add(bctfissuer);
        bc_panel.add(bctfaccount);
        bc_panel.add(bctfbalance);
        
        bc_panel.add(bc_btn_display);
        bc_panel.add(bc_btn_clear);
        //end of the bank card class 
        
        //Start of the Debit Card class
        //labels of the debit card class
        dc_header=new JLabel("DEBIT CARD CLASS");
        dc_client= new JLabel("Client Name :");
        dc_balance= new JLabel("Balance Amount :");
        dc_issuer= new JLabel("Issuer Bank :");
        dc_account= new JLabel("Bank Account :");
        dc_cardid= new JLabel("Card ID :");
        dc_pin= new JLabel("Pin Number :");
        dc_drawalamt= new JLabel("Withdrawal Amount :");
        dc_drawaldate= new JLabel("Withdrawal Date :");
        
        dc_tf_client = new JTextField();
        dc_tf_balance = new JTextField();
        dc_tf_issuer = new JTextField();
        dc_tf_account = new JTextField();
        dc_tf_cardid = new JTextField();
        dc_tf_pin = new JTextField();
        dc_tf_drawal_amt = new JTextField();
        
        String withdrawal_date[]={"2023-05-12","2023-05-14","2023-05-16","2023-05-18","2023-05-20","2023-05-22"};
        dc_comb_drawaldate= new JComboBox<String>(withdrawal_date);//for dc_drawaldate lable
        
        dc_btn_adddebit=new JButton("ADD DEBIT CARD");
        dc_btn_drawal=new JButton("WITHDRAW");
        dc_btn_display=new JButton("DISPLAY");
        dc_btn_clear=new JButton("CLEAR");
        
        dc_header.setFont(new Font("Aerial",Font.BOLD,20));
        dc_header.setBounds(290,20,200,30);
        dc_client.setBounds(50,90,120,40);
        dc_balance.setBounds(440,90,120,40);
        dc_issuer.setBounds(50,180,120,40);
        dc_account.setBounds(440,180,120,40);
        dc_cardid.setBounds(50,270,120,40);
        dc_pin.setBounds(440,270,120,40);
        dc_drawalamt.setBounds(50,390,120,40);
        dc_drawaldate.setBounds(50,460,120,40);//combo box //getSelectedItem() for getting the combo box details` 
        
        dc_tf_client.setBounds(180,90,150,40);
        dc_tf_balance.setBounds(570,90,150,40);
        dc_tf_issuer.setBounds(180,180,150,40);
        dc_tf_account.setBounds(570,180,150,40);
        dc_tf_cardid.setBounds(180,270,150,40);
        dc_tf_pin.setBounds(570,270,150,40);
        dc_tf_drawal_amt.setBounds(180,390,150,40);
        dc_comb_drawaldate.setBounds(180,460,150,40);
        
        dc_btn_adddebit.setBounds(270,325,230,50);
        dc_btn_drawal.setBounds(440,450,180,50);
        dc_btn_display.setBounds(150,550,180,50);
        dc_btn_clear.setBounds(440,550,180,50);
        
        dc_header.setForeground(Color.CYAN);
        dc_client.setForeground(Color.CYAN);
        dc_balance.setForeground(Color.CYAN);
        dc_issuer.setForeground(Color.CYAN);
        dc_account.setForeground(Color.CYAN);
        dc_cardid.setForeground(Color.CYAN);
        dc_pin.setForeground(Color.CYAN);
        dc_drawalamt.setForeground(Color.CYAN);
        dc_drawaldate.setForeground(Color.CYAN);
        
        dc_btn_adddebit.setBackground(Color.CYAN);
        dc_btn_drawal.setBackground(Color.CYAN);
        dc_btn_display.setBackground(Color.CYAN);
        dc_btn_clear.setBackground(Color.CYAN);
        
        //adding to the debit card class
        dc_panel.add(dc_header);
        dc_panel.add(dc_client);
        dc_panel.add(dc_balance);
        dc_panel.add(dc_issuer);
        dc_panel.add(dc_account);
        dc_panel.add(dc_cardid);
        dc_panel.add(dc_pin);
        dc_panel.add(dc_drawalamt);
        dc_panel.add(dc_drawaldate);
        
        dc_panel.add(dc_tf_client);//debit
        dc_panel.add(dc_tf_balance);
        dc_panel.add(dc_tf_issuer);
        dc_panel.add(dc_tf_account);
        dc_panel.add(dc_tf_cardid);
        dc_panel.add(dc_tf_pin);
        dc_panel.add(dc_tf_drawal_amt);
        
        dc_panel.add(dc_comb_drawaldate);
        dc_panel.add(dc_btn_adddebit);
        dc_panel.add(dc_btn_drawal);
        dc_panel.add(dc_btn_display);
        dc_panel.add(dc_btn_clear);
        //end of debit Card class
        
        //start of credit card class
        //labels of the credit card class
        cc_header=new JLabel("CREDIT CARD CLASS");
        cc_client= new JLabel("Client Name :");
        cc_issuer= new JLabel("Issuer Bank :");
        cc_account= new JLabel("Bank Account :");
        cc_balance= new JLabel("Balance Amount :");
        cc_cvc= new JLabel("CVC Number :");
        cc_interest= new JLabel("Interest Rate :");
        cc_expdate=new JLabel("Expiration Date :");//combo box labels
        cc_cardid= new JLabel("Card ID :");
        cc_climit= new JLabel("Credit Limit :");
        cc_grace= new JLabel("Grace Period :");
        
        cctf_client = new JTextField();
        cctf_issuer = new JTextField();
        cctf_account = new JTextField();
        cctf_balance = new JTextField();
        cctf_cvc = new JTextField();
        cctf_interest = new JTextField();
        cctf_cardid = new JTextField();
        cctf_climit = new JTextField();
        cctf_grace = new JTextField();
        
        String expiration_date[]={"2026-05-12","2026-05-14","2026-05-16","2026-05-18","2026-05-20","2026-05-22"};
        cc_comb_expdate=new JComboBox<String>(expiration_date);
        
        cc_btn_addcredit=new JButton("ADD CREDIT CARD");
        cc_btn_cancelcard=new JButton("CANCEL CREDIT CARD");
        cc_btn_setlimit=new JButton("SET CREDIT LIMIT");
        cc_btn_display=new JButton("DISPLAY");
        cc_btn_clear=new JButton("CLEAR");
        
        cc_header.setFont(new Font("Aerial",Font.BOLD,20));
        cc_header.setBounds(280,20,220,30);
        cc_client.setBounds(50,80,120,40);
        cc_issuer.setBounds(440,80,120,40);
        cc_account.setBounds(50,140,120,40);
        cc_balance.setBounds(440,140,120,40);
        cc_cvc.setBounds(50,200,120,40);
        cc_interest.setBounds(440,200,120,40);
        cc_cardid.setFont(new Font("SansSerif",Font.BOLD,20));
        cc_expdate.setBounds(50,260,120,40);
        cc_cardid.setBounds(220,320,100,40);//card id
        cc_climit.setBounds(50,380,120,40);
        cc_grace.setBounds(50,440,120,40);
        
        cctf_client.setBounds(180,80,150,40);
        cctf_issuer.setBounds(570,80,150,40);
        cctf_account.setBounds(180,140,150,40);
        cctf_balance.setBounds(570,140,150,40);
        cctf_cvc.setBounds(180,200,150,40);
        cctf_interest.setBounds(570,200,150,40);
        cc_comb_expdate.setBounds(180,260,150,40);
        
        cctf_cardid.setBounds(330,320,150,40);//card id
        cctf_climit.setBounds(180,380,150,40);
        cctf_grace.setBounds(180,440,150,40);
        
        cc_btn_addcredit.setBounds(570,260,150,60);
        cc_btn_cancelcard.setBounds(540,360,180,50);
        cc_btn_setlimit.setBounds(290,495,190,50);
        cc_btn_display.setBounds(150,560,180,50);
        cc_btn_clear.setBounds(440,560,180,50);
        
        cc_header.setForeground(Color.CYAN);
        cc_client.setForeground(Color.CYAN);
        cc_issuer.setForeground(Color.CYAN);
        cc_account.setForeground(Color.CYAN);
        cc_balance.setForeground(Color.CYAN);
        cc_cvc.setForeground(Color.CYAN);
        cc_interest.setForeground(Color.CYAN);
        cc_expdate.setForeground(Color.CYAN);
        cc_cardid.setForeground(Color.CYAN);
        cc_climit.setForeground(Color.CYAN);
        cc_grace.setForeground(Color.CYAN);
        
        cc_btn_addcredit.setBackground(Color.CYAN);
        cc_btn_cancelcard.setBackground(Color.CYAN);
        cc_btn_setlimit.setBackground(Color.CYAN);
        cc_btn_display.setBackground(Color.CYAN);
        cc_btn_clear.setBackground(Color.CYAN);
        
        cc_panel.add(cc_header);
        cc_panel.add(cc_client);
        cc_panel.add(cc_issuer);
        cc_panel.add(cc_account);
        cc_panel.add(cc_balance);
        cc_panel.add(cc_cvc);
        cc_panel.add(cc_interest);
        cc_panel.add(cc_expdate);
        cc_panel.add(cc_cardid);
        cc_panel.add(cc_climit);
        cc_panel.add(cc_grace);
        
        cc_panel.add(cctf_client);
        cc_panel.add(cctf_issuer);
        cc_panel.add(cctf_account);
        cc_panel.add(cctf_balance);
        cc_panel.add(cctf_cvc);
        cc_panel.add(cctf_interest);
        cc_panel.add(cctf_cardid);
        cc_panel.add(cctf_climit);
        cc_panel.add(cctf_grace);
        cc_panel.add(cc_comb_expdate);
        
        cc_panel.add(cc_btn_addcredit);
        cc_panel.add(cc_btn_cancelcard);
        cc_panel.add(cc_btn_setlimit);
        cc_panel.add(cc_btn_display);
        cc_panel.add(cc_btn_clear);
        //end of credit card class
        
        jtp.setBackground(Color.WHITE);//setting color of the tab
        //Adding colors to different panels
        bc_panel.setBackground(Color.DARK_GRAY);
        dc_panel.setBackground(Color.DARK_GRAY);
        cc_panel.setBackground(Color.DARK_GRAY);
        //setting it null as the java panel has default in flow method
        bc_panel.setLayout(null);
        dc_panel.setLayout(null);
        cc_panel.setLayout(null);
        
        //setting up the tabbed used in the java frame 
        jtp.setBounds(0,0,770,650);
        //adding panels to the tabbedpane
        jtp.add("Bank Card Class",bc_panel);
        jtp.add("Debit Card Class",dc_panel);
        jtp.add("Cerdit Card Class",cc_panel);
        jf.add(jtp);
        
        //event handling
        bc_btn_display.addActionListener(this);
        bc_btn_clear.addActionListener(this);
        dc_btn_adddebit.addActionListener(this);
        dc_btn_drawal.addActionListener(this);
        dc_btn_display.addActionListener(this);
        dc_btn_clear.addActionListener(this);
        
        cc_btn_addcredit.addActionListener(this);
        cc_btn_cancelcard.addActionListener(this);
        cc_btn_setlimit.addActionListener(this);
        cc_btn_display.addActionListener(this);
        cc_btn_clear.addActionListener(this);
        
        //setting the java frame
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);
        jf.setSize(785,690);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent clk)
    {
        //for all the clear buttons in three different panels
        if (clk.getSource()== bc_btn_clear || clk.getSource()== dc_btn_clear || clk.getSource()== cc_btn_clear)
        {
            bctfclient.setText("");
            bctfcardid.setText("");
            bctfissuer.setText("");
            bctfaccount.setText("");
            bctfbalance.setText("");
            dc_tf_client.setText("");
            dc_tf_balance.setText("");
            dc_tf_issuer.setText("");
            dc_tf_account.setText("");
            dc_tf_cardid.setText("");
            dc_tf_pin.setText("");
            dc_tf_drawal_amt.setText("");
            cctf_client.setText("");
            cctf_issuer.setText("");
            cctf_account.setText("");
            cctf_balance.setText("");
            cctf_cvc.setText("");
            cctf_interest.setText("");
            cctf_cardid.setText("");
            cctf_climit.setText("");
            cctf_grace.setText("");
            JOptionPane.showMessageDialog(jf,"Clear out","Alert",JOptionPane.ERROR_MESSAGE);
        }
        //display method of bank card class
        else if(clk.getSource() == bc_btn_display)
        {
            if(main_al.isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"It's empty. Please provide information firstly!");
            }
            else
            {
                for(BankCard disp:main_al)
                {
                    disp.display();
                }
            }
        }
        //operation for the add debit card button 
        else if(clk.getSource()== dc_btn_adddebit)
        {
            if(dc_tf_client.getText().isEmpty() || dc_tf_balance.getText().isEmpty() || dc_tf_issuer.getText().isEmpty() ||dc_tf_account.getText().isEmpty()||dc_tf_cardid.getText().isEmpty()||dc_tf_pin.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"Empty Field Found You need to all the text fields above the add button","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    String clientname = dc_tf_client.getText();
                    int balanceamount= Integer.parseInt(dc_tf_balance.getText()); 
                    String issurebank = dc_tf_issuer.getText();
                    String bankaccount= dc_tf_account.getText();
                    int cardId= Integer.parseInt(dc_tf_cardid.getText()); 
                    int pin= Integer.parseInt(dc_tf_pin.getText());
                    boolean hasWithdrawal = false;
                    //creating object of bankcard
                    if(main_al.isEmpty())
                    {
                        DebitCard obj= new DebitCard(balanceamount,cardId,bankaccount,issurebank,clientname,pin);
                        main_al.add(obj);
                        JOptionPane.showMessageDialog(jf,"DEBIT CARD ADDED");
                        JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+dc_tf_client.getText());
                        hasWithdrawal = false;
                        dc_tf_client.setText("");
                        dc_tf_balance.setText("");
                        dc_tf_issuer.setText("");
                        dc_tf_account.setText("");
                        dc_tf_cardid.setText("");
                        dc_tf_pin.setText("");
                    }
                    else
                    {
                        for( BankCard add_debit: main_al)//al vanyako arko object ho 
                        {
                            if(add_debit instanceof DebitCard)
                            {
                                DebitCard debitcard = (DebitCard) add_debit;
                                if(add_debit.getCardid()==cardId)
                                {
                                   JOptionPane.showMessageDialog(jf,"Sorry!The entered CardId is already taken");
                                   
                                   break;
                                }
                                else
                                {
                                    DebitCard obj =new DebitCard(balanceamount,cardId,bankaccount,issurebank,clientname,pin);
                                    main_al.add(obj);
                                    JOptionPane.showMessageDialog(jf,"DEBIT CARD ADDED");
                                    JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+dc_tf_client.getText());
                                    hasWithdrawal = false;
                                    dc_tf_client.setText("");
                                    dc_tf_balance.setText("");
                                    dc_tf_issuer.setText("");
                                    dc_tf_account.setText("");
                                    dc_tf_cardid.setText("");
                                    dc_tf_pin.setText("");
                                    break;
                                }
                            }
                            else
                            {
                                DebitCard obj =new DebitCard(balanceamount,cardId,bankaccount,issurebank,clientname,pin);
                                main_al.add(obj);
                                JOptionPane.showMessageDialog(jf,"DEBIT CARD ADDED");
                                JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+dc_tf_client.getText());
                                dc_tf_client.setText("");
                                dc_tf_balance.setText("");
                                dc_tf_issuer.setText("");
                                dc_tf_account.setText("");
                                dc_tf_cardid.setText("");
                                dc_tf_pin.setText("");
                                hasWithdrawal = false;
                                break;
                            }
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(jf,"Please provide Integer value in required textfields","Alert",JOptionPane.ERROR_MESSAGE);
                    dc_tf_balance.setText("");
                    dc_tf_cardid.setText("");
                    dc_tf_pin.setText("");
                }
            }
        }
        //for the withdraw button in debit card
        else if(clk.getSource() == dc_btn_drawal)
        {
            if(dc_tf_cardid.getText().isEmpty() || dc_tf_pin.getText().isEmpty() || dc_tf_drawal_amt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"Empty Field Found You need to fill the CardId,Withdrawal Amount, Pin Number for withdrawal","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               try
               {
                   int CardId = Integer.parseInt(dc_tf_cardid.getText());
                   int Pinnumber = Integer.parseInt(dc_tf_pin.getText());
                   int Withdrawalamount = Integer.parseInt(dc_tf_drawal_amt.getText());
                   String Date = dc_comb_drawaldate.getSelectedItem().toString();
                   boolean hasWithdrawal =false;
                   if(main_al.isEmpty())
                   {
                       JOptionPane.showMessageDialog(jf,"No Any data is found. Please add your Debit Card firstly");
                   }
                   else
                   {
                       for(BankCard drawal: main_al)
                       {
                           if(drawal instanceof DebitCard)
                           {
                               DebitCard withdrawal =(DebitCard) drawal;
                               if(CardId != withdrawal.getCardid())
                               {
                                   JOptionPane.showMessageDialog(jf,"CardID INVALID","Alert",JOptionPane.ERROR_MESSAGE);
                                   break;
                               }
                               else
                               {
                                   if(Pinnumber == withdrawal.getpinNumber())
                                   {
                                       if(Withdrawalamount > withdrawal.getwithDrawalAmount())
                                       {
                                           DebitCard DC =(DebitCard) drawal;
                                           DC.Withdraw(Withdrawalamount,Pinnumber,Date);
                                           JOptionPane.showMessageDialog(jf,"Withdrawal succesful");
                                           dc_tf_cardid.setText("");
                                           dc_tf_pin.setText("");
                                           dc_tf_drawal_amt.setText("");
                                           hasWithdrawal = true;
                                           break;
                                       }
                                       else
                                       {
                                           JOptionPane.showMessageDialog(jf,"Insufficient Balance","Alert",JOptionPane.ERROR_MESSAGE);
                                       }
                                   }
                                   else
                                   {
                                       JOptionPane.showMessageDialog(jf,"Invalid PIN NUMBER","Alert",JOptionPane.ERROR_MESSAGE);
                                   }
                               }
                           }
                       }
                   }
               }
               catch(NumberFormatException ab)
               {
                    JOptionPane.showMessageDialog(jf,"Number format expection handeling is done","Alert",JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(jf,"Please put integer value in the text fields");
                    dc_tf_cardid.setText("");
                    dc_tf_pin.setText("");
                    dc_tf_drawal_amt.setText("");
               }
            }
        }
        //display method in debit card class ho
        else if(clk.getSource() == dc_btn_display)
        {
            if(main_al.isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"It's empty. Please provide information firstly!");
            }
            else
            {
                for( BankCard disp_debit:main_al)
                {
                    if(disp_debit instanceof DebitCard)
                    {
                        DebitCard dis=(DebitCard) disp_debit;
                        dis.display();
                        break;
                    }
    
                }
            }
        }
        //for add credit card 
        else if(clk.getSource() == cc_btn_addcredit)
        {
            if(cctf_client.getText().isEmpty() || cctf_issuer.getText().isEmpty() || cctf_account.getText().isEmpty() || cctf_balance.getText().isEmpty() || cctf_cvc.getText().isEmpty() || cctf_interest.getText().isEmpty() || cctf_cardid.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"Empty Field Found You need to all the text fields above the add button and cardID","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    String Clientname = cctf_client.getText();
                    String Issurebank = cctf_issuer.getText();
                    String Bankaccount= cctf_account.getText();
                    int Balanceamount= Integer.parseInt(cctf_balance.getText()); 
                    int Cvc = Integer.parseInt(cctf_cvc.getText());
                    double Interest= Double.parseDouble(cctf_interest.getText());
                    int Cardid= Integer.parseInt(cctf_cardid.getText());
                    String Exdate= cc_comb_expdate.getSelectedItem().toString();
                    boolean isGranted= false;
                    if(main_al.isEmpty())
                    {
                       CreditCard cre = new CreditCard(Balanceamount,Cardid,Bankaccount,Issurebank,Clientname,Cvc,Interest,Exdate);
                       main_al.add(cre);
                       isGranted = false;
                       JOptionPane.showMessageDialog(jf,"Credit Card Added");
                       JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+cctf_client.getText());
                       
                    }
                    else
                    {
                        for(BankCard add_credit:main_al)
                        {
                            if(add_credit instanceof CreditCard)
                            {
                                CreditCard creditcard=(CreditCard) add_credit;
                                if(creditcard.getCardid()== Cardid)
                                {
                                    JOptionPane.showMessageDialog(jf,"Sorry!The entered CardId is already taken");
                                    break;
                                }
                                else
                                {
                                    CreditCard cre = new CreditCard(Balanceamount,Cardid,Bankaccount,Issurebank,Clientname,Cvc,Interest,Exdate);
                                    main_al.add(cre);
                                    isGranted = false;
                                    JOptionPane.showMessageDialog(jf,"Credit Card Added");
                                    JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+cctf_client.getText());
                                    break;
                                }
                            }
                            else
                            {
                                CreditCard cre = new CreditCard(Balanceamount,Cardid,Bankaccount,Issurebank,Clientname,Cvc,Interest,Exdate);
                                main_al.add(cre);
                                isGranted = false;
                                JOptionPane.showMessageDialog(jf,"Credit Card Added");
                                JOptionPane.showMessageDialog(jf,"Saved your infromation Mr/Mrs: "+cctf_client.getText());
                                break;
                            }
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(jf,"Number format expection handeling is done","Alert",JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(jf,"Please put integer value in the text fields");
                    cctf_balance.setText("");
                    cctf_cvc.setText("");
                    cctf_interest.setText("");
                    cctf_cardid.setText("");
                }
            }
        }
        //yo cancel credit card
        else if(clk.getSource() == cc_btn_cancelcard)
        {
            if(cctf_cardid.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"EMPTY TEXTFIELD! Please fill the Card ID text field","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int Cardid = Integer.parseInt(cctf_cardid.getText());
                    boolean isGranted =false;
                    for(BankCard cancel: main_al)
                    {
                        if( cancel instanceof CreditCard)
                        {
                            if(Cardid == cancel.getCardid())
                            {
                                CreditCard CC = (CreditCard) cancel;
                                CC.cancelCreditCard();
                                isGranted =false;
                                JOptionPane.showMessageDialog(jf,"Credit card has been cancelled successfully","Alert",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(jf,"Invalid card id for credit card");
                                break;
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(jf,"Cannot found the following Card ID in creditcard","Alert",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(jf,"Please enter integer value in Card ID textfield","Alert",JOptionPane.ERROR_MESSAGE);
                    cctf_cardid.setText("");
                }
            }
        }
        //set credit card
        else if(clk.getSource() == cc_btn_setlimit)
        {
            if(cctf_cardid.getText().isEmpty() || cctf_climit.getText().isEmpty() || cctf_grace.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"EMPTY field found: cardid,creditlimit & grace period is needed to fill","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int cardId= Integer.parseInt(cctf_cardid.getText());
                    double credlimit = Double.parseDouble(cctf_climit.getText());
                    int grace = Integer.parseInt(cctf_grace.getText());
                    boolean isGranted = false;
                    for(BankCard limit: main_al)
                    {
                        if(cardId == limit.getCardid())
                        {
                            if( credlimit > (2.5*(limit.getBalanceAmount())))
                            {
                                JOptionPane.showMessageDialog(jf,"Insufficient Balance Amount. Please decrease the credit limit ","Alert",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            else
                            {
                                CreditCard CC= (CreditCard) limit;
                                CC.setcreditlimit(credlimit,grace);
                                isGranted = true;
                                JOptionPane.showMessageDialog(jf,"Credit Limit is implemented for "+ cardId);
                            }
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(jf,"Invalid CardId for CreditCard","Alert",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(jf,"Number format expection handeling is done","Alert",JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(jf,"Please put integer value in the text fields value and double value in CreditLimit");
                    
                    cctf_cardid.setText("");
                    cctf_climit.setText("");
                    cctf_grace.setText("");
                }
            }
        }
        //display function
        else if(clk.getSource() == cc_btn_display)
        {
            if(main_al.isEmpty())
            {
                JOptionPane.showMessageDialog(jf,"It's empty. Please provide information firstly!");
            }
            else
            {
                for( BankCard disp_credit:main_al)
                {
                    if(disp_credit instanceof CreditCard)
                    {
                        CreditCard dis=(CreditCard) disp_credit;
                        dis.display();
                    }
                    break;
                }
            }    
        }
    }
    public static void main(String[] args)
    {
        new BankGUI();
    }
}

