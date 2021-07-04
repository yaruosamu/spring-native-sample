package com.sample.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.model.Data;
import com.sample.service.DataService;

@Controller
public class MainController {

    @Autowired
    DataService dataService;

	@GetMapping("/")
	public String getInfo(Model model) {

		//List<Data> dataList = new ArrayList<Data>();
		//dataList.add(new Data(1, "Gorillaz", "1st Album"));
		
        List<Data> dataList = dataService.findAllData();

		model.addAttribute("dataList", dataList);

		return "information";
	}
}
