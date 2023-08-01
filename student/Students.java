package org.student;

import org.college.College;
import org.department.Department;

public class Students {
//studentName(),studentDept(),studentId()
	public void StudentName() {
		System.out.println("StudentName:Meena");
	}
	public void StudentDept() {
		
	}
	public void StudentId() {
		System.out.println("Student ID: 589452");
	}
	public static void main(String[] args) {
		College cg=new College();
		Department dep=new Department();
		Students std= new Students();
		cg.CollegeName();
		cg.CllegeCode();
		cg.CollegeRank();
		dep.DeptName();
		std.StudentName();
		std.StudentDept();
		std.StudentId();
		
	}
}
