package JavaSX3;

import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.china.User;

public class day3_test2 {

	public static void main(String[] args) {

		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select * from t_user";
		
		List<User> list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		
		for(User student : list){
			System.out.println(student);
		}
	}

}
