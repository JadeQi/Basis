package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test04 {
	/*
	 * ʵ��һ����֤��С����Ҫ�����£� 1.
	 * ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У� 2.
	 * ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		while (true) {
			System.out.println("��������֤��:");
			String str = sc.nextLine();
			if (lhs.contains(str)) {
				System.out.println("�Ѿ�����");
			} else {
				lhs.add(str);
				if (lhs.size() == 3) {
					break;
				}
			}
		}
		FileWriter fw = new FileWriter("Test04.txt");
		for (String s : lhs) {
			fw.write(s);
			fw.write("\r\n");
			fw.flush();
		}
		fw.close();

		System.out.println("������У�����֤���Ƿ����:");
		String strs = sc.nextLine();
		BufferedReader br = new BufferedReader(new FileReader("Test04.txt"));
		ArrayList<String> list = new ArrayList<>();
		String len;
		while ((len = br.readLine()) != null) {
			list.add(len);
		}

		if (list.contains(strs)) {
			System.out.println("�Ѿ�����");
		} else {
			System.out.println("������");
		}
	}
}
