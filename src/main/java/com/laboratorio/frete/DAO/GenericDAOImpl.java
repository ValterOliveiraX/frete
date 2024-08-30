package com.laboratorio.frete.DAO;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;


public class GenericDAOImpl<T> implements GenericDAO<T> {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("seu-persistence-unit");
    private EntityManager GerenciadorEntidade;
    private Class<T> entityClass;
   

    public GenericDAOImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
        GerenciadorEntidade = emf.createEntityManager();
    }



    @Override
    public void save(T entity) {
        GerenciadorEntidade.getTransaction().begin();
        GerenciadorEntidade.persist(entity);
        GerenciadorEntidade.getTransaction().commit();
    }

    @Override
    public void update(T entity) {
        GerenciadorEntidade.getTransaction().begin();
        GerenciadorEntidade.merge(entity);
        GerenciadorEntidade.getTransaction().commit();
    }

    @Override
    public void delete(T entity) {
        GerenciadorEntidade.getTransaction().begin();
        GerenciadorEntidade.remove(GerenciadorEntidade.contains(entity) ? entity : GerenciadorEntidade.merge(entity));
        GerenciadorEntidade.getTransaction().commit();
    }

    @Override
    public T findById(Long id) {
        return GerenciadorEntidade.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> cq = GerenciadorEntidade.getCriteriaBuilder().createQuery(entityClass);
        cq.select(cq.from(entityClass));
        return GerenciadorEntidade.createQuery(cq).getResultList();
    }
    
}
