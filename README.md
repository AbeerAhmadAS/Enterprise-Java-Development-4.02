# Enterprise-Java-Development-4.02

Good work.

Only advice that in EmployeeController, you must put @RequestParam if you want filter by a param (or put a param in route for the variable to find)

In this line, for example

@GetMapping("/employee/department")
public List<Employee> getDoctorsByDepartment(@PathVariable String department){  <----- This must be @RequestParam, not @PathVariable
    return  employeeRepository.findByDepartment(department);
}

Or write this like:
@GetMapping("/employee/department/{department}") <----- Note the {department} part
public List<Employee> getDoctorsByDepartment(@PathVariable String department){
    return  employeeRepository.findByDepartment(department);
}

But as i said, its a good work.
^_^
