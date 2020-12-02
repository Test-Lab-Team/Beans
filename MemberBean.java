package ch01.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberTest")
public class MemberBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mem_id;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_account;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_password;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_name;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_gender;
	@Column(columnDefinition = "Date NOT NULL") 
	private Date mem_birthday;
	@Column(columnDefinition = "int NOT NULL")
	private Integer mem_phone;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_mailaddress;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_address;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_idNumber;
	@Column(columnDefinition = "int NOT NULL")
	private Integer mem_refund;
	@Column(columnDefinition = "nvarchar(MAX) NOT NULL") 
	private String mem_pic;
		
	public MemberBean() {
		super();
	}

	public MemberBean(Integer mem_id,String mem_account, String mem_password, String mem_name, String mem_gender, Date mem_birthday,
			Integer mem_phone, String mem_mailaddress, String mem_address, String mem_idNumber, Integer mem_refund,
			String mem_pic) {
		super();
		this.mem_id = mem_id;
		this.mem_account = mem_account;
		this.mem_password = mem_password;
		this.mem_name = mem_name;
		this.mem_gender = mem_gender;
		this.mem_birthday = mem_birthday;
		this.mem_phone = mem_phone;
		this.mem_mailaddress = mem_mailaddress;
		this.mem_address = mem_address;
		this.mem_idNumber = mem_idNumber;
		this.mem_refund = mem_refund;
		this.mem_pic = mem_pic;
	}

	
	public Integer getMem_id() {
		return mem_id;
	}

	public void setMem_id(Integer mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_account() {
		return mem_account;
	}

	public void setMem_account(String mem_account) {
		this.mem_account = mem_account;
	}

	public String getMem_password() {
		return mem_password;
	}

	public void setMem_password(String mem_password) {
		this.mem_password = mem_password;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_gender() {
		return mem_gender;
	}

	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}

	public Date getMem_birthday() {
		return mem_birthday;
	}

	public void setMem_birthday(Date mem_birthday) {
		this.mem_birthday = mem_birthday;
	}

	public Integer getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(Integer mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_mailaddress() {
		return mem_mailaddress;
	}

	public void setMem_mailaddress(String mem_mailaddress) {
		this.mem_mailaddress = mem_mailaddress;
	}

	public String getMem_address() {
		return mem_address;
	}

	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}

	public String getMem_idNumber() {
		return mem_idNumber;
	}

	public void setMem_idNumber(String mem_idNumber) {
		this.mem_idNumber = mem_idNumber;
	}

	public Integer getMem_refund() {
		return mem_refund;
	}

	public void setMem_refund(Integer mem_refund) {
		this.mem_refund = mem_refund;
	}

	public String getMem_pic() {
		return mem_pic;
	}

	public void setMem_pic(String mem_pic) {
		this.mem_pic = mem_pic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberBean [mem_id=");
		builder.append(mem_id);
		builder.append(", mem_account=");
		builder.append(mem_account);
		builder.append(", mem_password=");
		builder.append(mem_password);
		builder.append(", mem_name=");
		builder.append(mem_name);
		builder.append(", mem_gender=");
		builder.append(mem_gender);
		builder.append(", mem_birthday=");
		builder.append(mem_birthday);
		builder.append(", mem_phone=");
		builder.append(mem_phone);
		builder.append(", mem_mailaddress=");
		builder.append(mem_mailaddress);
		builder.append(", mem_address=");
		builder.append(mem_address);
		builder.append(", mem_idNumber=");
		builder.append(mem_idNumber);
		builder.append(", mem_refund=");
		builder.append(mem_refund);
		builder.append(", mem_pic=");
		builder.append(mem_pic);
		builder.append("]");
		return builder.toString();
	}


}
