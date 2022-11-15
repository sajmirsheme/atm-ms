package org.example.repository;

import org.example.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountRepository {
    public void connect() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void insert(Account account) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(account);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

    public void UpdateDeposit(Account account,long amount) {

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        Account existing = entityManager.find(Account.class,new Integer((int) account.getID()));

        existing.setBalance(existing.getBalance()+amount);
        Account updatedCar = entityManager.merge(existing);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println(updatedCar);

    }
    public void UpdateWithdraw(Account account,int amount) {

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        Account existing = entityManager.find(Account.class,new Integer((int) account.getID()));

        existing.setBalance(existing.getBalance()-amount);
        Account updatedCar = entityManager.merge(existing);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        System.out.println(updatedCar);

    }

    public void Delete(int id) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Account accountodelete=new Account();
        accountodelete.setID(id);

        Account account=entityManager.find(Account.class,new Integer((int) accountodelete.getID()));
        entityManager.remove(account);

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }

    public Account GetAccount(Integer id) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Account account=new Account();
        account.setID(id);
        Account account1=entityManager.find(Account.class,new Integer((int) account.getID()));

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        System.out.println(account1);
        return account1;

    }

}
