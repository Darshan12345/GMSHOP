package gmshop.service.imple;

import java.util.List;

import gmshop.model.Customer;
import gmshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

	
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private gmshop.dao.customerDAO customerDAO;

	public List<Customer> getCustomers() {
		return customerDAO.getCustomer();
	}


	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}
}





