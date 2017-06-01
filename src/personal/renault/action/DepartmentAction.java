package personal.renault.action;

import personal.renault.model.Department;
import personal.renault.service.DepartmentService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{

	//模型驱动使用的类
	private Department department;
	@Override
	public Department getModel() {
		return department;
	}
	//当前页数
	private Integer currentPage = 1;
	
	private DepartmentService departmentService;
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String findAll(){
		departmentService.findAll();
		
		return null;
	}

	
}
