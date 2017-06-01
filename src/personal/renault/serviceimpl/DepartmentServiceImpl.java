package personal.renault.serviceimpl;

import personal.renault.dao.DepartmentDao;
import personal.renault.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public void findAll() {
		
	}
	

}
