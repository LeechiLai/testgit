package com.leechi.object;

import com.leechi.bean.Student;

public class Demo3_ToString {

	public static void main(String[] args) {
		Student s = new Student("张三",23);
		String str = s.toString();
		System.out.println(str);
	}

}
