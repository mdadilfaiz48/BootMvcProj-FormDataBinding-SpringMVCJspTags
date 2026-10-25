package com.adil.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adil.model.Dancer;

@Controller
public class DancerOperationsController {
	
	@GetMapping("/")//this is for welcome page Launching
	public String showHomePage() {
		System.out.println("DancerOperationsController.showHomePage()");
		//return LVN (welcome page)
		return"welcome";
	}
	
	@GetMapping("/register")
	public String showDancerRegisterationFormPage(@ModelAttribute Dancer dcr) {
		System.out.println("DancerOperationsController.ShowDancerRegistrationFormPage()::Model class obj data :"+dcr);
		//return LVN (form page)
		return "dancer_register_form";
	}
	
	@PostMapping("/register")//form page submission
	public String registerDancer(@ModelAttribute Dancer dancer,Map<String,Object> map) {
		
		System.out.println("DancerOperationsController.registerDancer()");
		System.out.println("Model class Obj :"+dancer);
		//b.logic
		if(dancer.getFee() > 10000) {
			map.put("feeRange", "costly");
			
		}else if(dancer.getFee()<=0){
			map.put("feeRange", "Charity dancer");
		}else {
			map.put("feeRange", "Affordable Dancer");
		}
		//return LVN
		return "show_result";
		
	}

}
