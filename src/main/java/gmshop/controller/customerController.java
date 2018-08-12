package gmshop.controller;

import gmshop.model.Customer;

import gmshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public String saveCutomer(@Valid @ModelAttribute("customer") Customer cutomer, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "customerRegister";
        }
    else {
           // System.out.println("save customer" + cutomer);
            customerService.saveCustomer(cutomer);

            return "redirect:/";
        }

    }


}
