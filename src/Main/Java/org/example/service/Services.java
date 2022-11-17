package org.example.service;


import org.example.gui.NewJFrame2;
import org.example.model.Account;
import org.example.repository.AccountRepository;

import javax.swing.*;

public class Services {
    Account acc=new Account();
    AccountRepository accountRepository= new AccountRepository();


    public void login(JTextField textField,JPasswordField passwordField){
        String acountid=textField.getText();
        acountid=acountid.trim();
        Integer number = Integer.parseInt(acountid);
        String pasword=passwordField.getText();
        pasword=pasword.trim();

        AccountRepository accountRepository=new AccountRepository();
        Account accountused =accountRepository.GetAccount(number);
        System.out.println(accountused);

        if(number == accountused.getID() && pasword.equals(accountused.getPassword()))

        {
            NewJFrame2 x= new NewJFrame2(number);
            x.setVisible(true);

        }
        else JOptionPane.showMessageDialog(null,"TE DHENAT NUK JANE TE SAKTA. JU lUTEMI PROVONI PERSERI OSE NQS NUK KENI HAPNI NJE TE TILLE");
    }


    public void createAccount(JTextField textField1,JTextField textField2,JTextField textField3,JPasswordField passwordField) {
    String name=textField1.getText();
    String surnname=textField2.getText();
    String SSN=textField3.getText();
    String paswordi=passwordField.getText();

    Account newaccount=new Account();
            newaccount.setName(name);
            newaccount.setSSD(SSN);
            newaccount.setSurname(surnname);
            newaccount.setPassword(paswordi);
    // newaccount.setCreationDate(Date.valueOf("2022/02/27"));
    AccountRepository accountRepository1=new AccountRepository();
            accountRepository1.insert(newaccount);
    }

public void getAccountBalance(int accountid,JTextField textField){


    acc=accountRepository.GetAccount(accountid);
    //butoni i pare veprimi bank statement
    textField.setText( " Llogaria juaj ka "+ acc.getBalance()+" euro");

}

public  void depositMoney( int accountid,JTextField textField){

    AccountRepository accountRepository= new AccountRepository();
    acc=accountRepository.GetAccount(accountid);
    String amount=textField.getText();
    amount=amount.trim();
    int amountMoney=Integer.parseInt(amount);
            accountRepository.UpdateDeposit(acc,amountMoney);
            JOptionPane.showMessageDialog(null,"Ju sapo deposituat "+ amountMoney+ " euro ne llogari"+"\n"+
            "Gjendja e llogarise suaj eshte "+ (acc.getBalance()+amountMoney)+ " euro") ;

}


    public  void withdrawMoney(int accountid,JTextField textField){
        acc=accountRepository.GetAccount(accountid);
        String amount=textField.getText();
        amount=amount.trim();
        int amountMoney=Integer.parseInt(amount);
        accountRepository.UpdateDeposit(acc,amountMoney);
        JOptionPane.showMessageDialog(null,"Ju sapo deposituat "+ amountMoney+ " euro ne llogari"+"\n"+
                "Gjendja e llogarise suaj eshte "+ (acc.getBalance()+amountMoney)+ " euro") ;

    }


    public void deleteAccount(int accountid){
        AccountRepository accountRepository= new AccountRepository();
        acc=accountRepository.GetAccount(accountid);
        accountRepository.Delete(acc.getID());
    }


    public void closeApplication(){
        System.exit(0);
}

}