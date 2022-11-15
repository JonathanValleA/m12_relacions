package demojarelacions.entitats;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;

	// Relacion OneToOne Funciona correctamente (Hacer maven clear y maven install)
	/*
	@OneToOne(mappedBy="course")
	@JsonIgnore
	private CourseMaterial courseMaterial;
	*/
	
	// Relacion ManyToOne Funciona correctamente (Hacer maven clear y maven install)
	/*@OneToMany(fetch = FetchType.EAGER, mappedBy="course")
	@JsonIgnore*/

	/*@JoinTable(name="student_course", joinColumns=@JoinColumn(name="student_id"),
			inverseJoinColumns=@JoinColumn(name="course_id"))*/
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JsonIgnoreProperties("course")
	private List<Student> student;
	
}