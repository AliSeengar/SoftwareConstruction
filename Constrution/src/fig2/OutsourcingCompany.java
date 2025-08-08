package fig2;
import java.util.Arrays;
import java.util.List;

import fig2.Employee.Tester;
import fig2.Employee.Programmer;

public class OutsourcingCompany extends Company {
    public List<Employee> getEmployees() {
        return Arrays.asList(
            new Programmer(),
            new Tester()
        );
    }
}