package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.PatientDto;

public class UpdatePatDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();

public void update(int id, String b_group) {
	PatientDto dto = entityManager.find(PatientDto.class, id);
	dto.setB_group(b_group);
	
	entityTransaction.begin();
	entityManager.merge(dto);
	entityTransaction.commit();
}
}
