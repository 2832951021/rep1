package JavaSX3;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.china.Person;

public class test {

	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		Menu();
		int choose = 10;
		while (true) {
			System.out.println ("input your choose:");
			choose = student.nextInt();
			switch (choose) {
			case 1:
				addPerson();
				break;
			case 2:
				updatePerson();
				break;
			case 3:
				System.out.println("input id:");
				int id = student.nextInt();
				delectPerson(id);
				break;
			case 4:
				System.out.println("input name:");
				String name=student.next();
				delectPerson1(name);
				break;
			case 5:
				System.out.println("input id:");
				int idd = student.nextInt();
				findAllPerson1(idd);
				break;
			case 6:
				findAllPerson(null);
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}
	
	private static void Menu() {
		System.out.println("1：添加数据：");
		System.out.println("2：修改数据：");
		System.out.println("3：根据姓名进行删除：");
		System.out.println("4：根据id进行删除：");
		System.out.println("5：根据id进行查询：");
		System.out.println("6：查询所有：");
		System.out.println("0：退出");
	}
	
	//添加信息
	private static void addPerson(){
		Scanner student = new Scanner(System.in);
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "insert into person(id,name,username,password,age,descc,height) values(?,?,?,?,?,?,?)";
		System.out.println("input id:");
		int id = student.nextInt();
		System.out.println("input name:");
		String name = student.next();
		System.out.println("input username:");
		String username = student.next();
		System.out.println("input password:");
		String password = student.next();
		System.out.println("input age:");
		int age = student.nextInt();
		System.out.println("input descc:");
		String descc = student.next();
		System.out.println("input height:");
		double height = student.nextDouble();
		int update =jt.update(sql,id,name,username,password,age,descc,height);
		System.out.println("添加了"+update+"条信息");
	}
	//修改信息
	private static void updatePerson(){
		Scanner student = new Scanner(System.in);
		System.out.println("input id:");
		int id = student.nextInt();
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		while(true){
			System.out.println("input name:");
			System.out.println("input username:");
			System.out.println("input password:");
			System.out.println("input age:");
			System.out.println("input descc:");
			System.out.println("input height:");
			int a =student.nextInt();
			switch(a){
			case 1:
				break;
			case 2:
				System.out.println("input new name:");
				String name = student.next();
				int update2 = jt.update("update person set name = ? where id = ?",name,id);
				System.out.println("修改数为:"+update2);
				break;
			case 3:
				System.out.println("input new username:");
				String username = student.next() ;
				int update3 = jt.update (" update person set username = ? where id= ?",username,id);
				System.out.println("修改数为:"+update3);
				break;
			case 4:
				System.out.println("input new password:"); 
				String password = student.next();
				int update4 = jt. update("update person set password = ? where id = ?",password,id) ;
				System. out. println ("修改数为:"+update4);
				break;
			case 5:
				System.out.println("input new age:");
				int age = student.nextInt();
				int update5 = jt. update("update person set age = ? where id = ? ",age,id) ;
				System.out.println("修改数为:"+update5) ;
				break;
			case 6:
				System.out.println ("input new username:");
				String descc = student.next() ;
				int update6 = jt. update(" update person set des = ? where id = ? ",descc,id) ;
				System. out. println("修改数为:"+update6) ;
				break;
			case 7:
				System.out. println ("input new username:");
				double height = student.nextDouble();
				int update7 = jt.update("update person set hight = ? where id=? ",height, id) ;
				System.out.println ("修改数为: "+update7);
				break;
			default:
				break;
			}
		}
	}
	
	//根据id删除信息
	private static void delectPerson(int a){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delect from person where id = ? ",a);
		System.out.println ("修改数为: "+update);
	}
	//根据姓名删除信息
	private static void delectPerson1(String a){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		int update = jt.update("delect from person where name = ? ",a);
		System.out.println ("修改数为: "+update);	
	}
	//根据id查询信息
	private static void findAllPerson1(int a){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select * from person where id = ?";
		List<Person> list = jt.query(sql, new BeanPropertyRowMapper<Person>(Person.class),a);
		
		for(Person person : list){
			System.out.println(person);
		}
	}
	//查询所有信息
	private static void findAllPerson(String a){
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		String sql = "select * from person";
		List<Person> list = jt.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
		
		for(Person person : list){
			System.out.println(person);
		}
	}
}

