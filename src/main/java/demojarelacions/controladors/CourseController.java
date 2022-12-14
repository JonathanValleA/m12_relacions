package demojarelacions.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demojarelacions.entitats.Course;
import demojarelacions.entitats.CourseMaterial;
import demojarelacions.entitats.Student;
import demojarelacions.repositoris.CourseMaterialRepositori;
import demojarelacions.repositoris.CourseRepositori;
import demojarelacions.repositoris.StudentRepositori;

@RestController
@RequestMapping("api")
public class CourseController {
	
	// Repositorios Course y CourseMaterial
	@Autowired
	CourseRepositori alRep;
	@Autowired
	CourseMaterialRepositori alRep2;
	@Autowired
	StudentRepositori alRep3;
	// listar todos los cursos
	@GetMapping("course")
	public Iterable<Course> getCourse() {
		return alRep.findAll();
	}
	// listar un curso por id
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course course = alRep.findById(id).get();
		
		System.out.println("Lazy");
		return course;
	}
	
	// listar todos los CourseMaterial
	@GetMapping("material")
	public Iterable<CourseMaterial> getCourseMaterial() {
		return alRep2.findAll();
	}
	// listarlo por id
	@GetMapping("material/{id}")
	public CourseMaterial getCourseMaterial(@PathVariable long id) {
		CourseMaterial material = alRep2.findById(id).get();
		return material;
	}
	// Borar curso por id
	@DeleteMapping("course/{id}")
	public void getDelete(@PathVariable("id") long id) {
		alRep.deleteById(id);
	}
	
	@GetMapping("student")
	public Iterable<Student> getStudent(){
		return alRep3.findAll();
	}
	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable long id) {
		Student student = alRep3.findById(id).get();
		return student;
	}
}

