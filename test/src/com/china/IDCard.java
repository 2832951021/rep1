package com.china;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IDCard {
	private String name;
	private String nation;
	private String sex;
	private String cardNo;
	private LocalDateTime birthday;
	private String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString(){
		StringBuffer buffer = new StringBuffer("");
		buffer.append("姓名:");
		buffer.append(this.name);
		buffer.append(" 民族:");
		buffer.append(this.nation);
		buffer.append(" 性别: ");
		buffer.append(this.sex);
		buffer.append(" 出生日期:");
		buffer.append(this.birthday);
		buffer.append(" 身份证号:");
		buffer.append(this.cardNo);
		buffer.append(" 家庭住址:");
		buffer.append(this.addr);
		String stu=buffer.toString();		
		return stu;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((cardNo == null) ? 0 : cardNo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nation == null) ? 0 : nation.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	public boolean equals(Object q) {
		if (this == q)
			return true;
		if (q == null)
			return false;
		if (getClass() != q.getClass())
			return false;
		IDCard other = (IDCard) q;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (cardNo == null) {
			if (other.cardNo != null)
				return false;
		} else if (!cardNo.equals(other.cardNo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nation == null) {
			if (other.nation != null)
				return false;
		} else if (!nation.equals(other.nation))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
}
