package com.aspire.school;


public class SchoolUI {
		public static Student ui(){
			Student student=new Student();
			student.setName(DataValidator.validatename());
			student.setDate(DataValidator.validatedob());
			student.setAddress(DataValidator.validateaddress());
			student.setAge(DataValidator.calculateAge(student.getDate()));
			student.setSslcmark(DataValidator.validatesslcmark());
			student.setMobileNo(DataValidator.validatemobilenumber());
			student.setGroup(GroupSeparator.groupSeparate(student.getSslcmark()));
			return student;
		}
}
