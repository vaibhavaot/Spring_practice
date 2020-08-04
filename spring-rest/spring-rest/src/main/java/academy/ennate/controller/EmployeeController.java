package academy.ennate.controller;

import academy.ennate.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@ResponseBody
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET , value = "/employees")
    public List<Employee>findAll(){
        return null;
    }
    @RequestMapping(method = RequestMethod.GET , value = "/employees/{id}")
    public Employee findOne(@PathVariable("id") String Eid){
        return null;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public Employee create(@RequestBody Employee employee){
        return null;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public Employee update(@PathVariable("id") String id, @RequestBody Employee employee){
        return null;
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void delete(@PathVariable("id") String id){

    }
}
