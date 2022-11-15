package demojarelacions.repositoris;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import demojarelacions.entitats.Course;

public interface CourseRepositori extends CrudRepository<Course, Serializable>{

}
