package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.PatientDto;

public class RemovePatDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();


	public void remove(int id) {
	PatientDto patientDto = entityManager.find(PatientDto.class, id);
	
	entityTransaction.begin();
	entityManager.remove(patientDto);
	entityTransaction.commit();
		
	}
}
