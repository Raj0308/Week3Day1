package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("studentName:Varadharaj");
	}
	
	public void studentDept() {
		System.out.println("studentDept:CS");
	}
	public void studentId() {
		System.out.println("studentId:RG1542");
	}

	public static void main(String[] args) {
		Student details = new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentDept();
		details.studentId();

	}

}
