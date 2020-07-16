package molly;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import molly.Student;
import molly.JDBC;
import molly.Prosess;

public class StudentData {
	public int saveData(Student stu) {
		int flag=0;
		Connection C = null;
		PreparedStatement S =null;	
		String SQL = "insert into t_stus(sno,name,sex,class,birthday,addtime) values (?,?,?,?,?,?)";
	    try {
			C = JDBC.getConnection();
			S = C.prepareStatement(SQL);
			S.setString(1,stu.getSno());
			S.setString(2,stu.getName());
			S.setString(3,stu.getSex());
			S.setString(4,stu.getCls());
			//日期处理
			S.setDate(5, new java.sql.Date(stu.getBirthday().getTime()));
			S.setTimestamp(6,new java.sql.Timestamp(stu.getAddTime().getTime()));
			flag = S.executeUpdate();
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(null, S, C);	
		}
	    return flag;
	}
	public List<Student> searchAllData(){
		List<Student> data = new ArrayList<Student>();
		Connection C = null;
		Statement S =null;	
		ResultSet RS = null;
		String SQL = "select id,sno,name,sex,class,birthday,addtime from t_stus";
	    try {
			C = JDBC.getConnection();
			S = C.createStatement();
			RS = S.executeQuery(SQL);
			while(RS.next()) {
				Student stu = new Student();
				stu.setId(RS.getInt("id"));
				stu.setSno(RS.getString("sno"));
				stu.setName(RS.getString("name"));
				stu.setSex(RS.getString("sex"));
				stu.setCls(RS.getString("class"));
				stu.setBirthday(RS.getDate("birthday"));
				stu.setAddTime(RS.getTimestamp("addtime"));
				data.add(stu);
			}
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(RS, S, C);	
		}
	    return data;
	}
	public List<Student>searchStudentByClass(String className){
		List<Student> data = new ArrayList<Student>();
		Connection C = null;
		PreparedStatement S =null;	
		ResultSet RS = null;
		String SQL = "select id,sno,name,sex,class,birthday,addtime from t_stus where class like ?";
		String key =Prosess.Prosesskey(className);
	    try {
			C = JDBC.getConnection();
			S = C.prepareStatement(SQL);
			S.setString(1,key);
			RS = S.executeQuery();		
			while(RS.next()) {
				Student stu = new Student();
				stu.setId(RS.getInt("id"));
				stu.setSno(RS.getString("sno"));
				stu.setName(RS.getString("name"));
				stu.setSex(RS.getString("sex"));
				stu.setCls(RS.getString("class"));
				stu.setBirthday(RS.getDate("birthday"));
				stu.setAddTime(RS.getTimestamp("addtime"));
				data.add(stu);
			}
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(RS, S, C);	
		}
	    return data;	
	}
	public Student searchStudentBysno(String sno){
		Student stu =null;
		Connection C = null;
		PreparedStatement S =null;	
		ResultSet RS = null;
		String SQL = "select id,sno,name,sex,class,birthday,addtime from t_stus where sno =?";
		//String key =proccess.proccesskey(className);
		try {
			C = JDBC.getConnection();
			S = C.prepareStatement(SQL);
			S.setString(1,sno);
			RS = S.executeQuery();
			if(RS.next()) {
				stu = new Student();
				stu.setId(RS.getInt("id"));
				stu.setSno(RS.getString("sno"));
				stu.setName(RS.getString("name"));
				stu.setSex(RS.getString("sex"));
				stu.setCls(RS.getString("class"));
				stu.setBirthday(RS.getDate("birthday"));
				stu.setAddTime(RS.getTimestamp("addtime"));
			}
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(RS, S, C);	
		}
	    return stu;		
	}
	public int editData(Student stu) {
		int flag=0;
		Connection C = null;
		PreparedStatement S =null;	
		String SQL ="update t_stus set sno=?,name=?,sex=?,class=?,birthday=? where id=?";
		try {
			C = JDBC.getConnection();
			S = C.prepareStatement(SQL);
			S.setString(1,stu.getSno());
			S.setString(2,stu.getName());
			S.setString(3,stu.getSex());
			S.setString(4,stu.getCls());
			S.setDate(5, new java.sql.Date(stu.getBirthday().getTime()));
			S.setInt(6,stu.getId());
			flag = S.executeUpdate();
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(null, S, C);	
		}
		return flag;
	}
	public int deleteById(int id) {
		int flag=0;
		Connection C = null;
		PreparedStatement S =null;	
		String SQL="delete from t_stus where id=?";
		try {
			C = JDBC.getConnection();
			S = C.prepareStatement(SQL);
			S.setInt(1,id);
			flag = S.executeUpdate();
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			JDBC.free(null, S, C);	
		}
		return flag;
		//如果执行的SQL语句：insert,into,update...set...,delete from  ->PreparedStatement的executeUpdate()返回的是一个int型数字
		//如果执行的SQL语句：select from ->PreparedStatement的executeUpdate();才会返回ResultSet
	}
}
