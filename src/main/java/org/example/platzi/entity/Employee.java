package org.example.platzi.entity;

import javax.persistence.*;

//Entidad que será mapeada en la BD
@Entity
@Table(name="employees")
public class Employee {
    // indicamos que id será la PK y auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // como el nombre de las variable no es igual que el nombre de la col de la table lo podemos indicar con la anotación Column
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "pa_surname")
    private String paSurname;
    @Column(name = "ma_surname")
    private String maSurname;

    private String email;

    private Float salary;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String paSurname, String maSurname, String email, Float salary) {
        this.id = id;
        this.firstName = firstName;
        this.paSurname = paSurname;
        this.maSurname = maSurname;
        this.email = email;
        this.salary = salary;
    }

    public Employee(String firstName, String paSurname, String maSurname, String email, Float salary) {
        this.firstName = firstName;
        this.paSurname = paSurname;
        this.maSurname = maSurname;
        this.email = email;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String firstName) {
        this.firstName = firstName;
    }

    public String getPa_surname() {
        return paSurname;
    }

    public void setPa_surname(String paSurname) {
        this.paSurname = paSurname;
    }

    public String getMa_surname() {
        return maSurname;
    }

    public void setMa_surname(String maSurname) {
        this.maSurname = maSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", paSurname='" + paSurname + '\'' +
                ", maSurname='" + maSurname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary;
    }
}
