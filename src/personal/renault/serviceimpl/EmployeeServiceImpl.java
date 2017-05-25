package personal.renault.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import personal.renault.dao.EmployeeDao;
import personal.renault.model.Employee;
import personal.renault.service.EmployeeService;

/**
 * Ա����ҵ��ʵ����
 * @author Administrator
 *
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	//ע��employeeDao
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	/**
	 * ҵ���ĵ�¼����
	 */
	
	public Employee login(Employee employee) {
		Employee existEmployee = employeeDao.findByUsernameAndPassword(employee);
		
		return existEmployee;
	}

}
