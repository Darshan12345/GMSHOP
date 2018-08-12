package gmshop.controller;

import gmshop.model.Employee;
import gmshop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/addEmployee")
    public String addEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "employeeRegister";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee")Employee employee, BindingResult result){

        if(result.hasErrors()){
        return "employeeRegister";}

        else
        {
            employeeService.addEmployee(employee);
            return "redirect:/";
        }
    }
}
