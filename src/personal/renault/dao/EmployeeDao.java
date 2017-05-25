package personal.renault.dao;

import personal.renault.model.Employee;

/**
 * Dao
 * @author Administrator
 *
 */
public interface EmployeeDao {

	Employee findByUsernameAndPassword(Employee employee);

}
