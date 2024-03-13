package com.faten.test;

import com.faten.dao.ParfumDao;
import com.faten.entities.parfums;

public class ParfumTest {
	public static void main(String[] args) {

		parfums p = new parfums();
		p.setNomParfum("la vie est belle");
		p.setPrix(5597);
		
		parfums p1 = new parfums();
		p1.setNomParfum("black opuim");
		p1.setPrix(6000);
		
		ParfumDao parDao = new ParfumDao();
		parDao.ajouter(p);
		parDao.ajouter(p1);
		System.out.println("Appel de la méthode listerTous");
		for (parfums pr : parDao.listerTous())
			System.out.println(p1);
		System.out.println("Appel de la méthode listerParNom");
		for (parfums pr : parDao.listerParNom("GUCCI"))

			System.out.println(p1);

	}
}