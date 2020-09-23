package com.mybatis3.dao;

import java.util.Date;
import java.util.HashMap;

import com.mybatis3.domain.Student;

public class StudentDaoDynamicSqlMain {

	public static void main(String[] args) {
		StudentDaoDynamicSql studentDaoDynamicSql = new StudentDaoDynamicSql();

		System.out.println("---------updateStudentDynamicSql---------");
		Student findStudent = new Student();
		
		studentDaoDynamicSql.findStudents(findStudent);
		System.out.println("###"+studentDaoDynamicSql.findStudents(findStudent) );
		
		findStudent.setDob(new Date());
		System.out.println("###"+studentDaoDynamicSql.findStudents(findStudent) );
		

	}
}
