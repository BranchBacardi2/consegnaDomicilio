package com.example.OnlineOrder.dao;

import com.example.OnlineOrder.entity.Piatti;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PiattiDaoImpl implements PiattiDao {
    private EntityManager entityManager;
    @Autowired
    public PiattiDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Piatti findById(int id) {
       return entityManager.createQuery("SELECT u from Piatti u WHERE u.id = :id", Piatti.class).
                setParameter("id", id).getSingleResult();
    }
}
