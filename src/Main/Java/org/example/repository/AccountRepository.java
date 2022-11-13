package org.example.repository;

import org.example.model.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountRepository {

    public void insert(Account account) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("atmsystemdb-em");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(account);

    }
}