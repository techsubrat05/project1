package com.myapp.org.TestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetch")
public class FetchController {

	@GetMapping("/dataFetch")
	public String getFetchedData(@RequestParam String fetchedData) {

		return fetchedData;
	}

}
