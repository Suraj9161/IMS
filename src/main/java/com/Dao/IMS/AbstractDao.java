package com.Dao.IMS;

import java.io.Serializable;
import java.util.List;

import com.config.IMS.HibernateUtil;

import jakarta.persistence.EntityManager;

public abstract class AbstractDao <T, ID extends Serializable> implements GenericDao<T, ID> {
	
	 private Class<T> clazz;
	    protected EntityManager entityManager;

	    public AbstractDao(Class<T> clazz) {
	        this.clazz = clazz;
	        this.entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager();
	    }

	    @Override
	    public void save(T entity) {
	        entityManager.getTransaction().begin();
	        entityManager.persist(entity);
	        entityManager.getTransaction().commit();
	    }

	    @Override
	    public T findByID(ID id) {
	        return entityManager.find(clazz, id);
	    }

	    @Override
	    public void update(T entity) {
	        entityManager.getTransaction().begin();
	        entityManager.merge(entity);
	        entityManager.getTransaction().commit();
	    }

	    @Override
	    public void delete(T entity) {
	        entityManager.getTransaction().begin();
	        entityManager.remove(entity);
	        entityManager.getTransaction().commit();
	    }

	    @Override
	    public List<T> findAll() {
	        return entityManager.createQuery("from " + clazz.getName()).getResultList();
	    }

}
