package molly;

import java.util.Date;
import java.util.List;
import molly.StudentData;
import molly.Student;

public class Test_JDBC {

	public static void main(String[] args) {
		/*
		Student stu = new Student();
		stu.setName("���޷�");
		stu.setSno("18044312");
		stu.setSex("Ů");
		stu.setCls("�������3��");	
		stu.setBirthday(new Date());
		stu.setAddTime(new Date());
		StudentData SD =new StudentData();
		SD.saveData(stu);	
		*/
		StudentData SD =new StudentData();
		//List<Student> d = SD.searchAllData();
		/*List<Student> dd =SD.searchStudentByClass("�������");
		for(Student stu:dd) {
			System.out.println(stu.getName()+","+stu.getCls()+","+stu.getBirthday()+","+stu.getAddTime());	
		}	
		Student stu = SD.searchStudentBysno("18044231");
		if(stu!=null) {
			//System.out.println(stu.getName()+","+stu.getCls()+","+stu.getBirthday()+","+stu.getAddTime());	
			stu.setName("����");
			stu.setCls("�������2��");
			SD.editData(stu);
			System.out.println(stu.getName()+","+stu.getCls()+","+stu.getBirthday()+","+stu.getAddTime());	
		}
		*/
		SD.deleteById(1);
	}

}
