package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department findById ===");
		Department department = departmentDao.findById(7);
		System.out.println(department);
		
		/*
		System.out.println("\n=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "TI");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id = " + newDepartment.getId());
		*/
		
		System.out.println("\n=== TEST 5: department update ===");
		department = departmentDao.findById(7);
		department.setName("Automação");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		sc.close();
	}
}

