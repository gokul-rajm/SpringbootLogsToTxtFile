package LogsToFile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LogsToFile.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
