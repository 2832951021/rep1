package molly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class JDBC {
	//加载数据库驱动
static {
	try {
		Class.forName(Imolly.JDBC_DRIVER);
	} catch (ClassNotFoundException a) {
		a.printStackTrace();
	}	
}
	//获取数据库连接
public static Connection getConnection () throws SQLException{
	return DriverManager.getConnection(Imolly.JDBC_URL,Imolly.JDBC_USER,Imolly.JDBC_PASSWORD);
}
	//释放数据库连接
public static void free(ResultSet RS,Statement S,Connection C) {
	try {
		if(RS !=null) {
			RS.close();
		}
	} catch (SQLException a) {
		a.printStackTrace();
	}finally {
		try {
			if(S !=null) {
				S.close();
			}
		} catch (SQLException a) {
			a.printStackTrace();
		}finally {
			try {
				if(C !=null) {				
					C.close();
				}
					
				} catch (SQLException a) {
					a.printStackTrace();
				}
			}
		}
    }
}
