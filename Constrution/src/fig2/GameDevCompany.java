package fig2;

import java.util.Arrays;
import java.util.List;
import fig2.Employee.Designer;
import fig2.Employee.Artist;

public class GameDevCompany extends Company {
    public List<Employee> getEmployees() {
        return Arrays.asList(
            new Designer(),
            new Artist()
        );
    }
}
