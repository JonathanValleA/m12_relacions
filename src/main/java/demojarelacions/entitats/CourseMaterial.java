package demojarelacions.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;

	// Relacion OneToOne Funciona correctamente (Hacer maven clear y maven install)
	/*
	@OneToOne
	private Course course;
	*/
	
	// Relacion ManyToOne Funciona correctamente (Hacer maven clear y maven install)
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;	
	
}
