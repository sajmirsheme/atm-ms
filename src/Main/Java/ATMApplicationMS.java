import org.example.model.Account;
import org.example.repository.AccountRepository;

import java.util.Date;

public class ATMApplicationMS {
    public static void main(String[] args) {

        //  testGetAll();
       testgetInsert();
        //  testGetById();
        //testUpdate();
        // testDelete();

    }

    /*public static void testGetAll(){
        CarRepository carRepository=new CarRepository();
        List<Car> cars= carRepository.GetAll();
        System.out.println(cars);

    }
    */

    public  static Account createAccount(){
        Account account=new Account();
        Date d = new Date(01/05/2022);
       account.setName("sajmir");
       account.setSurname("sheme");
       account.setBalance(1000);
       account.setPassword("Sajmira1.");
       account.setSSD("J30405060W");
       account.setCreationDate(d);


        return  account;
    }
/*
    public  static Account  createCarforupdate(){
        Car car=new Car();
        car.setId(6);
        car.setBrand("Audi");
        car.setColor(Color.BLACK);
        car.setModel("a4");
        car.setPrice(8000);
        car.setDateofProduction(LocalDate.of(1997, Month.APRIL,12));
        car.isLimitedEdition(true
        );
        return  car;
    }
*/
    public static void testgetInsert() {
        Account  acc1=createAccount();

      AccountRepository accountRepository=new AccountRepository();
        accountRepository.Insert(acc1);
        System.out.println(acc1);
    }
/*
    public static void testGetById() {

        int id =6;
        CarRepository carRepository=new CarRepository();
        System.out.println(carRepository.GetById(id));

    }

    public static void testUpdate() {
        Car car=createCarforupdate();
        CarRepository carRepository=new CarRepository();
        carRepository.Update(car);


    }

    public static void testDelete() {

        int id =8;
        CarRepository carRepository=new CarRepository();
        carRepository.Delete(id);
        System.out.println(carRepository.GetById(8));

    }

*/




    }

