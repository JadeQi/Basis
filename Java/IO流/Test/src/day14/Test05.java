package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {
/*
 * ��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123
 *	  3.Ҫ��������¹��ܣ�
 *		��������ʱ������̨��ʾ�û�����ע����û��������룻
 * 		��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
 *  			�ǣ�����̨��ʾ���û����Ѵ���
 *  			�񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ��� 
 * */
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���,����");
		String str = sc.nextLine();

		String userName = str.split(",")[0];
		BufferedReader br = new BufferedReader(new FileReader("Test05.txt"));
		String len;
		while ((len = br.readLine()) != null) {
			if (list.contains(str)) {
				System.out.println("�û����Ѿ�����");
			} else {
				list.add(len.split(",")[0]);
			}
		}
		br.close();

		if (list.contains(userName)) {
			System.out.println("�Ѿ�����");
		} else {
			FileWriter bw = new FileWriter("Test05.txt", true);
			bw.write("\r");
			bw.write(str);
			bw.write("\r\n");
			bw.close();
			System.out.println("ע��ɹ�");
		}
	}
}
