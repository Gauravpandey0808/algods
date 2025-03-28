package chatgptquestions.employeesalarymanagement.service;

import java.util.List;
import java.util.Map;

public interface EmployeeSalary {

    Map<String,Double> getDepartmentAverageSalary();

    Map<String, Double> getTopThreeMostPaidEmployee();

    List<String> getEmployeeByJoiningDate();

    Map<String, Map<String, String>> getSalaryCategory();


}
