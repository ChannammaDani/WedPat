package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.PatientDto;

public class PatientDao {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
EntityManager entityManager  = entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();

public void insert(PatientDto patientDto) {
	entityTransaction.begin();
	entityManager.persist(patientDto);
	entityTransaction.commit();
	}

}
