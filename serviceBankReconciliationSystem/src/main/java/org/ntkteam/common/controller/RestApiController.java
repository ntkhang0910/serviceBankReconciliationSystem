package org.ntkteam.common.controller;

import org.ntkteam.common.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class RestApiController {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Person getPersonInJSON(@PathVariable String name) {

		Person person = new Person();
		person.setName(name);
		
		return person;
	}
	
}
