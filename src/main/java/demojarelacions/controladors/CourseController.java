package demojarelacions.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demojarelacions.entitats.Course;
import demojarelacions.entitats.CourseMaterial;
import demojarelacions.repositoris.CourseMaterialRepositori;
import demojarelacions.repositoris.CourseRepositori;



@RestController
@RequestMapping("api")
public class CourseController {
	
	@Autowired
	CourseRepositori alRep;
	@Autowired
	CourseMaterialRepositori alRep2;
	
	@GetMapping("course")
	public Iterable<Course> getCourse() {
		return alRep.findAll();
	}
	
	@GetMapping("course/{id}")
	public Course getCourse(@PathVariable long id) {
		Course course = alRep.findById(id).get();
		return course;
	}
	
	@GetMapping("material")
	public Iterable<CourseMaterial> getCourseMaterial() {
		return alRep2.findAll();
	}
	@GetMapping("material/{id}")
	public CourseMaterial getCourseMaterial(@PathVariable long id) {
		CourseMaterial material = alRep2.findById(id).get();
		return material;
	}
}

