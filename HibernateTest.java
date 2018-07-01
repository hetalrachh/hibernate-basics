package org.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Address;
import org.hibernate.dto.EmpDetails;
import org.hibernate.dto.HobbyDetails;
import org.hibernate.dto.LoginDetails;
import org.hibernate.dto.StudentDetails;
import org.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		//Adding a new UserDetails record
		UserDetails user = new UserDetails();
		LoginDetails login = new LoginDetails();
		login.setLoginId("hetalrachh");
		login.setLoginName("hetal_rachh");
		user.setLoginDetails(login);
		user.setUserName("New user");
		
		//Adding a new EmpDetails record
		EmpDetails details = new EmpDetails();
		Address addr = new Address();
		addr.setStreet("street");
		addr.setTown("town");
		
		Address addr1 = new Address();
		addr1.setStreet("office street");
		addr1.setTown("office town");
		
		details.setEmpId(1);
		details.setName("First user");
		details.setHomeAddress(addr);
		details.setOfficeAddress(addr1);
		details.setDob(new Date());
		details.setHobby("Drawing");
		
		EmpDetails details1 = new EmpDetails();
		Address addr2 = new Address();
		addr2.setStreet("street1");
		addr2.setTown("town1");
		
		details1.setEmpId(2);
		details1.setName("Second user");
		details1.setOfficeAddress(addr2);
		details1.setDob(new Date());
		details1.setHobby("Painting");
		
		
		//Adding new StudentDetails record
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setStudentName("Hetal Rachh");
		
		HobbyDetails hobby1 = new HobbyDetails();
		hobby1.setHobbyName("Painting");
		hobby1.setHobbyType("Indoor");
		studentDetails.getHobbies().add(hobby1);
		
		HobbyDetails hobby2 = new HobbyDetails();
		hobby2.setHobbyName("Cricket");
		hobby2.setHobbyType("Outdoor");
		studentDetails.getHobbies().add(hobby2);
		
		
		//create a session factory which reads hibernate config file to connect to db
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//open a new session
		Session session = factory.openSession();
		
		//begin a transaction
		session.beginTransaction();
		
		//save the user
		//session.save(details);
		//session.save(details1);
		//session.save(user);
		session.save(studentDetails);
		
		//commit the transaction
		session.getTransaction().commit();
		
		//closing the session
		session.close();
		
		
		//Code for retrieving the inserted value of EmpDetails
		details = null;
		
		//open a new session for retrieval
		session = factory.openSession();
		
		session.beginTransaction();
		
		EmpDetails emp = session.get(EmpDetails.class, 1);
		
		System.out.println("Emp name is " + emp.getName());

	}

}
