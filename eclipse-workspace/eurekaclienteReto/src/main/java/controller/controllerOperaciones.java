package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerOperaciones {

	@GetMapping("/Suma")
	public String suma(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La suma  de "+nm1+"+"+nm2+"es"+nm1+nm2;
		
	}
	
	@GetMapping("/Resta")
	public String resta(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La resta  de "+nm1+"-"+nm2+"es"+ (nm1 - nm2);
		
	}
	@GetMapping("/Multiplicar")
	public String multiplicar(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La multiplicación  de "+nm1+"*"+nm2+"es"+nm1*nm2;
		
	}
	@GetMapping("/Dividir")
	public String dividir(@PathVariable Long nm1,@PathVariable Long nm2) {
		return "La división  de "+nm1+"/"+nm2+"es"+nm1/nm2;
		
	}
	
}
