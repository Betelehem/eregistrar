package edu.mum.studentcrud.serviceImp;

import edu.mum.studentcrud.domin.Student;
import edu.mum.studentcrud.repository.StudentRepository;
import edu.mum.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll() ;
    }


    @Override
    public void deleteById(Integer stuId) {

        studentRepository.delete(studentRepository.getOne(stuId));
    }

    @Override
    public Student findById(Integer theId) {
        return studentRepository.findById(theId).get();
    }





    @Override
    public void save(Student stud) {
        studentRepository.save(stud);
    }
}
