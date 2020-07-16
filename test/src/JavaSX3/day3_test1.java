package JavaSX3;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.activation.DataSource;

public class day3_test1 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		InputStream resourceAsStream = day3_test1.class.getClassLoader().getResourceAsStream("jdbc.properties");
		pro.load(resourceAsStream);
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(password);
		System.out.println(property);
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		System.out.println(datasource.getConnection());
		Connection connection = datasource.getConnection();
		Statement createStatement =connection.createStatement();
		String sql = " select.from t_ user ";
		ResultSet rs= createStatement.executeQuery(sql);
		while (rs.next()) {
			String name = rs.getString("name");
			String address = rs.getString("address");
			Integer age = rs.getInt("age");
			System.out.println(name+address+age);

	}
		connection.close();
}
}
