package org.example.repository;

import org.example.model.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TransactionRepository {
    public void connect() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void insertTransaction(Transaction transaction) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(transaction);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

    public void Delete(int ID_Transaction) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Transaction transactionToDelete = new Transaction();
        transactionToDelete.setID_Transaction(ID_Transaction);

        Transaction transaction = entityManager.find(Transaction.class, new Integer((int) transactionToDelete.getID_Transaction()));
        entityManager.remove(transaction);

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();

    }

    public Transaction GetTransaction(Integer ID_Transaction) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Transaction transaction = new Transaction();
        transaction.setID_Transaction(ID_Transaction);
        Transaction transaction1 = entityManager.find(Transaction.class, ID_Transaction);


        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return transaction1;


    }
}