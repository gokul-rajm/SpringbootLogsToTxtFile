package LogsToFile.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import LogsToFile.Entity.Employee;
import LogsToFile.Repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@PostMapping("/postEmployee")
	public Employee postEmployee(@RequestBody Employee employee) {
		logger.info("Working very well");
		return employeeRepository.save(employee);
	}

	@GetMapping("/getEmployee")
	public List<Employee> getEmployee(Employee employee) {
		return employeeRepository.findAll();
	}

	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return employeeRepository.findById(id);
	}
}
