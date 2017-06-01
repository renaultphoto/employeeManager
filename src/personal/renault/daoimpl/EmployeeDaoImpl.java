package personal.renault.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import personal.renault.dao.EmployeeDao;
import personal.renault.model.Employee;

/**
 * DAO
 * @author Administrator
 *
 */
public  class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	/**
	 * 通过用户名和密码查找用户
	 */
	@Override
		public Employee findByUsernameAndPassword(Employee employee) {
		String hql ="from Employee where username = ? and password = ?";
		List<Employee> list = this.getHibernateTemplate().find(hql, employee.getUsername(),employee.getPassword());
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	

}
