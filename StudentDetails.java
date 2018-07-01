package org.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	private String studentName;

	/* Indicates hibernate that this is a java collection */
	@ElementCollection
	@JoinTable(name = "STUDENT_HOBBIES", // customised table name
			 joinColumns = @JoinColumn(name = "STUDENT_ID")) //customised joining column name
	private Collection<HobbyDetails> hobbies = new ArrayList<HobbyDetails>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Collection<HobbyDetails> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Collection<HobbyDetails> hobbies) {
		this.hobbies = hobbies;
	}
}
