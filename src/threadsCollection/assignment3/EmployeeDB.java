package threadsCollection.assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	
	private List<Employee> list = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e) {
		list.add(e);
		return true;
	}
	
	public boolean deleteEmployee(int eCode) {
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.geteCode() == eCode) {
				iterator.remove();
				return true;
			}
		}
    	return false;
	}
    public String showPaySlip(int eCode) {
    	Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.geteCode() == eCode) {
				return employee.getPaySlip();
			}
		}
    	return null;
    }
    public List<Employee> listAll() {
    	return list;
    }
}
