package sakunnikash.SMS.entity;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "First_Name", nullable = false)
    private String FirstName;
    @Column(name = "Last_Name")
    private String LastName;
    @Column(name = "Email")
    private String Email;

    public Student(){}

    public Student(String firstName, String lastName, String email) {
        super();
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
