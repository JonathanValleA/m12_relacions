package demojarelacions.repositoris;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import demojarelacions.entitats.Student;

public interface StudentRepositori extends CrudRepository<Student, Serializable> {

}
