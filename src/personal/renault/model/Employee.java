package personal.renault.model;

import java.util.Date;

/**
 * Ա��ʵ����
 * @author Administrator
 *
 */
public class Employee {
	//Ա�����
	private Integer eid;
	//Ա���˺�
	private String username;
	//Ա������
	private String alias;
	//Ա������
	private String password;
	//Ա������
	private Date birthday;
	//Ա����ְ����
	private Date joindate;
	//Ա����ְ����
	private Date outdate;
	//Ա���ֻ���
	private String phone;
	//�Ƿ���ְ
	private Integer isout;
	//�Ƿ����Ա
	private Integer isadmin;
	//Ա����������
	private Department department;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public Date getOutdate() {
		return outdate;
	}
	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getIsout() {
		return isout;
	}
	public void setIsout(Integer isout) {
		this.isout = isout;
	}
	public Integer getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(Integer isadmin) {
		this.isadmin = isadmin;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
