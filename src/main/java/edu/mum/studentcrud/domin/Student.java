package edu.mum.studentcrud.domin;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
public class Student {
    @Id
    @Column(name="stud_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
 Integer studentId;
    @Column(name="stud_num")
    String studentNumber;
    @Column(name="first_name")
    String firstName;
    @Column(name="middle_name")
    String middleName;
    @Column(name="last_name")
    String lastName;
    @Column(name="stud_gpa")
    double cgpa;
    @Column(name="enrollment_Date")
    String enrollmentDate;
    @Column(name="is_International")
    String isInternational;

    public Student(){

    }

    public Student( String studentNumber, String firstname, String middlename, String lastname, double cgpa, String enrollmentDate, String isInternational) {

        this.studentNumber = studentNumber;
        this.firstName = firstname;
        this.middleName = middlename;
        this.lastName = lastname;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", isInternational='" + isInternational + '\'' +
                '}';
    }
}
