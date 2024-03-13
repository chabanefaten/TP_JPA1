package com.faten.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.faten.entities.parfums;
import com.faten.util.JPAutil;

public class ParfumDao {
	private EntityManager entityManager = JPAutil.getEntityManager("MonProjetJPA");

	public void ajouter(parfums p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);

		tx.commit();
	}

	public void modifier(parfums p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
	}

	public void supprimer(parfums p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		p = entityManager.merge(p); // important
		entityManager.remove(p);
		tx.commit();
	}

	public parfums consulter(parfums p, Object id) {
		return entityManager.find(p.getClass(), id);
	}

	public List<parfums> listerTous() {
		   @SuppressWarnings("unchecked")
		List<parfums> parfum = entityManager.createQuery("select p from parfums p").getResultList();

		return parfum;
	}

	public List<parfums> listerParNom(String nom_Parfum) {
		   @SuppressWarnings("unchecked")
		List<parfums> parfum = entityManager.createQuery("select p from Parfums p where p.nom_Parfum like :pnom").setParameter("pnom", "%" + nom_Parfum + "%").getResultList();

		return parfum;
	}
}