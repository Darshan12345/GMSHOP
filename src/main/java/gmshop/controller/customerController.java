package gmshop.controller;

import gmshop.model.Customer;

import gmshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class customerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/registerCustomer")
    public String registerCustomer(Model model){

        Customer c=new Customer();

        model.addAttribute("customer",c);


        return "customerRegister";

    }

    @RequestMapping("/saveCustomer")
    public String saveCutomer(@ModelAttribute("customer") Customer cutomer)
    {

        System.out.println("save customer"+cutomer);
        customerService.saveCustomer(cutomer);


return "customerRegister";
    }
}
