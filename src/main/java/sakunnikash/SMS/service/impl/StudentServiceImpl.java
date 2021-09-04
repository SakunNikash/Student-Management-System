package sakunnikash.SMS.service.impl;

import org.springframework.stereotype.Service;
import sakunnikash.SMS.entity.Student;
import sakunnikash.SMS.repository.StudentRepository;
import sakunnikash.SMS.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository StudentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        StudentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }
}
