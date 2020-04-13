package level01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test03 {
	/*	a)	��������Student�������Ϣд�뵱ǰ��Ŀ�µ�stuInfo.txt����
	b)	�ٶ�ȡstuInfo.txt�����ݵ������У��������ϴ�ӡ����
	����	����˵����
	a)	д����Ϣ�ĸ�ʽ�� it001,������,35,����
	b)	�����Ϣ�ĸ�ʽ�� it001,������,35,����
*/
	public static void main(String[] args) throws IOException {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("it001", "������", 35, "����"));
		list.add(new Student("it002", "������", 35, "����"));
		list.add(new Student("it003", "������", 35, "����"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("Test03_1.txt"));
		
		for (Student s : list) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getCity());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		list.clear();//���ϵ������Ѿ����˹�ȥ,���Կ������һ�� ����Ȼ��ӡ���������
		BufferedReader br = new BufferedReader(new FileReader("Test03_1.txt"));
		String len;
		while((len = br.readLine()) != null){
			String[] arr = len.split(",");
			Student s = new Student();
			s.setId(arr[0]);
			s.setName(arr[1]);
			s.setAge(Integer.parseInt(arr[2]));
			s.setCity(arr[3]);
			list.add(s);
		}
		br.close();
		
		for (Student s : list) {
			System.out.println(s.getId()+","+s.getName()+","+s.getAge()+","+s.getCity());
		}
	}
}





