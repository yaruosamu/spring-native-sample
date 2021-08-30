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
        List<Data> dataList = dataService.findAllData();
		model.addAttribute("dataList", dataList);
		return "information";
	}

    @GetMapping("oome")
    public String crashByOutOfMemoryError(Model model) {
        StringBuilder strBuilder = new StringBuilder("Combine String until OutOMemoryError Occurs!");
        int cnt = 0;
        while(cnt++ < Integer.MAX_VALUE) {
            strBuilder.append("Let's Crash with OutOfMemoryError!");
        }

        // Can't reach this error page
        return "error";
    }
}
