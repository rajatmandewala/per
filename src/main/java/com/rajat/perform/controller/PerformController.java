package com.rajat.perform.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.perform.model.PerformModel;
import com.rajat.perform.service.PerformService;

@RestController
public class PerformController {
	
	@Autowired
	private PerformService performService;
	
	@GetMapping(value="/")
	public List<PerformModel> getHome() {	
		
		performService.generateExcel();
		return performService.getList();
	}
}
