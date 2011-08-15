package org.ejb.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {


	public ClientController() {
		System.out.println("--------------------------------PAOLAAAAAAAAA---------------------------------------");
	}


	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public String client(ModelMap model, HttpServletRequest request, HttpServletResponse response){
		model.addAttribute("client", "diana");
		return "client";
	}
}
