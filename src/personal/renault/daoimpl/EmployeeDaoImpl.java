package personal.renault.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import personal.renault.dao.EmployeeDao;
import personal.renault.model.Employee;

/**
 * 员工的dao实现类
 * @author Administrator
 *
 */
public  class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	/**
	 * dao里面的验证用户方法
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
