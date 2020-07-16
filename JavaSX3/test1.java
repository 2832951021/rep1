package JavaSX3;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.china.User;

public class test1 {

	public static void main(String[] args) {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select * from t_user";
		
		List<User> list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		
		for(User student : list){
			System.out.println(student);
		}
	private static void addUser(){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "insert into t_user(id,name,password,age,desc,height Double) values(?,?,?,?,?,?)";
		int update1 =jt.update(sql,"�Ϲ����","shangguanwaner",123456,24,"��ʦ",168);
		int update2 =jt.update(sql,"�ݼ�","yuji",123456,23,"����",170);
		int update3 =jt.update(sql,"����","ake",123456,25,"�̿�",175);
		int update4 =jt.update(sql,"����","lixin",123456,25,"�ߵر���",188);
		int update5 =jt.update(sql,"����","daqiao",123456,20,"���ܸ�",164);
			System.out.println(update1);
			System.out.println(update2);
			System.out.println(update3);
			System.out.println(update4);
			System.out.println(update5);
	}
	private static void updateUser(){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update1 =jt.update(" update t_user set id = ? , name = ? , password = ? , age = ? , desc = ? , height Double = ? ,where id = 6" ,"����","diaochan",123456,22,"��ʦ",165,6);
		System.out.println(update1);
	}
	private static void delectUser(){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update1 = jt.update("delect from t_user where id = ?",7);
		System.out.println(update1);
	}
	private static void count(){
		JdbcTemplace jt = new JdbcTemplate(JDBCUtils.getDataSource());
		Long count =jt.query("select * from t_user",Long.class);
		System.out.println(count);
	}
	private static void findUserById1(){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		User user = jt.queryForObject("select * from t_user where id = ? ",new BeanPropertRowMapper(User.class),6);
		User user2 =list.get(0);
		System.out.println(user2);
		System.out.println(list);
	}
	private static void findUserById(){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		User user = jt.queryForObject("select * from t_user where id = ? ",new BeanPropertRowMapper(User.class),6);
		System.out.println(user);
	}
	}

}
