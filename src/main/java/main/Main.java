package main;

import Util.UtilEntity;
import entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("SELECT e from Employee e", Employee.class).getResultList();
        System.out.println("------------listar todos-------------");
        employees.forEach(System.out::println);

        System.out.println("---------------Buscar uno---------------");
        int employeeId = 11;
        Employee employee = em.find(Employee.class,employeeId);
        System.out.println("Empleado encontrado --->" + employee);

        System.out.println("----------------Crear uno------------------");
        Employee employeeCreate = new Employee();
        employeeCreate.setFirstName("Dante");
        employeeCreate.setMaSurname("Ayala");
        employeeCreate.setPaSurname("hernandez");
        employeeCreate.setEmail("dante@gmail.com");
        employeeCreate.setSalary(50000000.0F);

        em.getTransaction().begin();
        em.persist(employeeCreate);
        em.getTransaction().commit();

        System.out.println("nuevo empleado creado: "+ employeeCreate);




        System.out.println("----------Actualizar uno----------");

        int employeeToUpdateId = 4;
        Employee employeeUpdate = em.find(Employee.class,employeeToUpdateId);
        employeeUpdate.setFirstName("Mila");
        employeeUpdate.setMaSurname("Ayala");
        employeeUpdate.setPaSurname("hernandez");
        employeeUpdate.setEmail("mila@gmail.com");
        employeeUpdate.setSalary(30000000.0F);

        em.getTransaction().begin();
        em.merge(employeeUpdate);
        em.getTransaction().commit();

        System.out.println("empleado actualizado -> " + employeeUpdate);





        System.out.println("-------------Eliminar-------------");
        System.out.println("digite el id a eliminar");
        Scanner sc = new Scanner(System.in);
        int idDelete = sc.nextInt();
        Employee employeeDelete = em.find(Employee.class,idDelete);
        System.out.println("Empleado a eliminar "+ employeeDelete);


        em.getTransaction().begin();
        em.remove(employeeDelete);
        em.getTransaction().commit();

        List<Employee> employees2 = em.createQuery("SELECT e from Employee e", Employee.class).getResultList();
        System.out.println("------------listar todos-------------");
        employees2.forEach(System.out::println);

        em.close();



    }
}
