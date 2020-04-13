package day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test06 {
	/*���� : ��Ŀ��·������text.txt�ļ�����������
		�Ұ�����
		123456
		
		����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ���
		654321
		��ڰ���
*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Test06.txt"));
		ArrayList<String> list = new ArrayList<>();
		String len;
		while((len = br.readLine()) != null){
			String s = new StringBuilder(len).reverse().toString();
			list.add(s);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test06.txt"));
		for(int i = list.size()-1;i>=0;i--){
			bw.write(list.get(i));
			bw.newLine();//����
		}
		bw.close();
		System.out.println(list);
	}
}










