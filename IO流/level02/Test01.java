package level02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
/*
 * 1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
 * 2.����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��
 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test01.txt"));
		
		while(true){
			System.out.println("��������֤��:");
			String str = sc.nextLine();
		}
		
	}
}
