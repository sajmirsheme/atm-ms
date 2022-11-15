import org.example.gui.NewJFrame;
import org.example.model.Account;
import org.example.repository.AccountRepository;

import java.util.Date;

public class ATMApplicationMS {
    public static void main(String[] args) {
        new NewJFrame().setVisible(true);

        //  testGetAll();
       //testgetInsert();
        //  testGetById();
        //testUpdateDeposit();
      //  testUpdateWithdraw();
      // testDelete();
        //testGetAccount();

    }

    public  static Account createAccount(){
        Account account=new Account();
        Date d = new Date(01/05/2022);
       account.setName("lolo");
       account.setSurname("popo");
       account.setBalance(1000);
       account.setPassword("Sajmira1.");
       account.setSSD("J30405060W");
       account.setCreationDate(d);
        return  account;
    }

    public static void testgetInsert() {
        Account  acc1=createAccount();
      AccountRepository accountRepository=new AccountRepository();
        accountRepository.insert(acc1);
        System.out.println(acc1);
    }


 public static void testUpdateWithdraw()


    {Account account=new Account();

        account.setID(7);

      AccountRepository accountRepository=new AccountRepository();
        accountRepository.UpdateWithdraw(account,50);


    }
public static void testUpdateDeposit()
    {Account account=new Account();
        account.setID(7);
      AccountRepository accountRepository=new   AccountRepository();
        accountRepository.UpdateDeposit(account,1000);


    }

    public static void testDelete() {
        int id =7;
    AccountRepository accountRepository=new   AccountRepository();
        accountRepository.Delete(id);

}

    public static void testGetAccount(){

        AccountRepository accountRepository=new   AccountRepository();
        accountRepository.GetAccount(1);


    }
    /*
*/




    }

