package personal.renault.model;

import java.util.HashSet;
import java.util.Set;

/**
 * ���ŵ�ʵ����
 * @author Administrator
 *
 */
public class Department {
	//部门ID
	private Integer did;
	//部门名称
	private String dname;
	//部门描述
	private String description;
	//员工列表
	private Set<Employee> employees = new HashSet<Employee>();
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
