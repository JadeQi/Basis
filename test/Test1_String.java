package com.heima.test;

import java.util.Scanner;

public class Test1_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�뷢��:");
		String s = sc.nextLine();
		
		// 1. �ж��ַ������Ƿ�������д�
		if(s.contains("TMD")){
			// 2. ����  ��TMD
			int index = s.indexOf("TMD");
			String newStr = s.substring(0, index);
			System.out.println(newStr + "***");
		}else{
			System.out.println(s);
		}
		
	}

	public static void method2() {
		String s = "itheima";
		// subString : ��ȡ�ַ���, �ӿ�ʼ��������������, ����ͷ������β
		String newStr = s.substring(0, 2);
		System.out.println(newStr);
		
		System.out.println("----------------");
		
		// subString : �Ӵ��������λ�ÿ�ʼ��ȡ, ��ȡ��ĩβ
		String newStr2 = s.substring(2);
		System.out.println(newStr2);
	}
	
}
