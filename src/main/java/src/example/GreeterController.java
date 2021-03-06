package src.example;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreeterController {
	//localhost:8989/hello1/habib
	@GetMapping("/hello1/{name}")
	public String sayHello(@PathVariable String name ) {		
		return "Hello "+name;
	}
	//localhost:8989/hello2?name=habib
	@GetMapping("/hello2")
	public String sayHelloToMe(@RequestParam String name ) {		
		return "Say Hello "+name;
	}
	//localhost:8989/add?num1=10&num2=20
	@GetMapping("/add")	
	public String add(@RequestParam String num1,String num2 ) {		
		return num1+num2;
	}
	
	@GetMapping("/getemp")
	public Employee getEmployee() {		
		return new Employee(123,"habib",34344);
	}
	
	@PostMapping("/saveemp")	
	public String getEmployee(@RequestBody Employee emp) {	
		
		return "Inserted "+ emp.getEno();
	}
	
	@PutMapping("/updateemp")	
	public String updateEmployee(@RequestBody Employee emp) {	
		
		return "Update "+ emp.getEno();
	}
	
	
	@DeleteMapping("/removeemp")	
	public String removeEmployee(@RequestParam int eno) {	
		//database return value
		return "Record Deleted: "+ eno;
	}
	

}
