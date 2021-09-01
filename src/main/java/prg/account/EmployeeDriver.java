package prg.account;
import java.util.List;
import prg.dto.Employee;
import prg.dao.EmployeeDao;
import prg.dao.EmployeeDaoImpl;
import prg.account.service.EmployeeService;
import prg.account.service.EmployeeServiceImpl;
public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDao employeeDao  = new EmployeeDaoImpl();
		EmployeeService employeeService= new EmployeeServiceImpl(employeeDao);
		List<Employee> empList = employeeService.getEmployees();
		System.out.println("emp"+empList.size());
		for(Employee employee:empList) {
			System.out.println(employee);
		}

	}

}
