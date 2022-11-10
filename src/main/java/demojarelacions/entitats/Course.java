package demojarelacions.entitats;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@OneToMany(fetch=FetchType.LAZY, mappedBy="course")
	@JsonIgnore
	private List<CourseMaterial> courseMaterial;
	
}