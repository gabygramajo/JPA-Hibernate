package org.example.platzi.main;

import org.example.platzi.entity.Employee;
import org.example.platzi.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("Select e from Employee e", Employee.class).getResultList();

        System.out.println("---- Listar todos ----");
        employees.forEach(System.out::println);

        System.out.println("---- Listar un empleado ----");
        int employeeID = 3;
        Employee employee = em.find(Employee.class, employeeID);
        System.out.println("Employee : " + employee);

        /* lo comentamos para que no se vuelva a ejecutar
        System.out.println("---- Crear un empleado ----");
        Employee newEmployee = new Employee();
        newEmployee.setFirst_name("Diego");
        newEmployee.setPa_surname("Lechuga");
        newEmployee.setMa_surname("Pimentel");
        newEmployee.setEmail("diego@example.com");
        newEmployee.setSalary(890000F);

        // Iniciamos la transacción
        em.getTransaction().begin();
        em.persist(newEmployee);
        em.getTransaction().commit();
        */
        /*
        System.out.println("---- Actualizar un empleado ----");
        int employeeToUpdateId = 2;
        Employee employeeToUpdate = em.find(Employee.class, employeeToUpdateId);

        employeeToUpdate.setFirst_name("Irving");
        employeeToUpdate.setPa_surname("Juarez");
        employeeToUpdate.setSalary(97000F);

        // Iniciamos la transacción
        em.getTransaction().begin();
        em.merge(employeeToUpdate);
        em.getTransaction().commit();

        System.out.println("Empleado actualizado" + employeeToUpdate);
        */

        System.out.println("---- Eliminar un empleado ----");
        int employeeToDeleteId = 1;
        Employee employeeToDelete = em.find(Employee.class, employeeToDeleteId);

        // Iniciamos la transacción
        em.getTransaction().begin();
        em.remove(employeeToDelete);
        em.getTransaction().commit();

        // cerramos el EntityManagerFactory
        em.close();
    }
}
