package molly;

import java.sql.Timestamp;
import java.util.Date;

public class Student {
	private int id;
	private String sno;
	private String name;
	private String sex;
	private String cls;
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getAddTime() {
		return this.getAddTime();
	}
	public void setAddTime(Timestamp timestamp) {
		this.setAddTime(timestamp);
		
	}	
}
