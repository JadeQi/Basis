package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test01 {
	/*
	 * һ��	����˵������UTF-8����ĸ�ʽд�� ����á����ļ���, ����������ȷ�Ķ�ȡ������ӡ�ڿ���̨
	 * */
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Test01.txt"),"UTF-8");
		osw.write("���");
		osw.close();
		InputStreamReader isw = new InputStreamReader(new FileInputStream("Test01.txt"),"UTF-8");
		int len;
		while((len = isw.read()) != -1){
			System.out.print((char)len);
		}
		isw.close();
	}
}
