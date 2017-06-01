package personal.renault.action;

import personal.renault.model.Employee;
import personal.renault.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Action
 * @author Administrator
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	//模型驱动的类
	private Employee employee = new Employee();

	@Override
	public Employee getModel() {
		return employee;
	}
	//employeeService
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String login(){
		System.out.println("login方法");
		//
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null){
			this.addActionError("用户名或者密码错误");
			return "login";
		}else{
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return "index";
		}
	}

	public String toLogin(){
		System.out.println("login");
		return "login";
	}
}
