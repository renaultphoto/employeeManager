package personal.renault.model;

import java.util.Date;

/**
 * 员工实体类
 * @author Administrator
 *
 */
public class Employee {
	//员工编号
	private Integer eid;
	//员工账号
	private String username;
	//员工姓名
	private String alias;
	//员工密码
	private String password;
	//员工生日
	private Date birthday;
	//员工入职日期
	private Date joindate;
	//员工离职日期
	private Date outdate;
	//员工手机号
	private String phone;
	//是否离职
	private Integer isout;
	//是否管理员
	private Integer isadmin;
	//员工所属部门
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
