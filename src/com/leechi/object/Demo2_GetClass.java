package com.leechi.object;

import com.leechi.bean.Student;

public class Demo2_GetClass {

	public static void main(String[] args) {
		Student s = new Student("张三",23);
		Class clazz = s.getClass();  				//获取该对象的字节码文件
		String name = clazz.getName();
		System.out.println(name);
	}

}
