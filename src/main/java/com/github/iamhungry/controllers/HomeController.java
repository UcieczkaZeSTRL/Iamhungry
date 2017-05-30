package com.github.iamhungry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by xzymon on 30.05.17.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		return "main-menu";
	}
}
