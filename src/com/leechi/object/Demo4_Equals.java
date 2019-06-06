package com.leechi.object;

import com.leechi.bean.Student;

public class Demo4_Equals {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("张三",23);
		Student s2 = new Student("张三",23);
		boolean b = s1.equals(s2);
		
		System.out.println(s1 == s2);
		System.out.println(b);
	}

}
