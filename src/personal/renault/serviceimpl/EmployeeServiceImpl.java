package personal.renault.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import personal.renault.dao.EmployeeDao;
import personal.renault.model.Employee;
import personal.renault.service.EmployeeService;

/**
 * 员工的业务实现类
 * @author Administrator
 *
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	//注入employeeDao
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	/**
	 * 业务层的登录方法
	 */
	
	public Employee login(Employee employee) {
		Employee existEmployee = employeeDao.findByUsernameAndPassword(employee);
		
		return existEmployee;
	}

}
