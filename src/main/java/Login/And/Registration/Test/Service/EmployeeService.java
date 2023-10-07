package Login.And.Registration.Test.Service;

import Login.And.Registration.Test.DTO.EmployeeDTO;
import Login.And.Registration.Test.DTO.LoginDTO;
import Login.And.Registration.Test.LoginResponse.LoginMessage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMessage loginEmployee(LoginDTO loginDTO);
}
