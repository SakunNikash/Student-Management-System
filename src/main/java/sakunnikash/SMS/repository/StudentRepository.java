package sakunnikash.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sakunnikash.SMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
