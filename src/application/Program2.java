package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== TEST 1: department insert ====");
        Department department = new Department(null, "Food");
        departmentDao.insert(department);
        System.out.println("Inserted! New id: " + department.getId());

        System.out.println("=== TEST 2: department findById ====");
        Department obj = departmentDao.findById(7);
        System.out.println(obj);

        System.out.println("\n=== TEST 3: department update ====");
        department = departmentDao.findById(6);
        department.setName("Drinks");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 4: department delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed!");

        System.out.println("\n=== TEST 5: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department d:list){
            System.out.println(d);
        }

    }
}
