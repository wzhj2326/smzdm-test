package com.smzdm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smzdm.model.RequestModel;

@Controller
public class RestFulController {

	@RequestMapping(value = "/post", produces = "application/json", method = RequestMethod.POST, consumes = "application/json")
	public String postJson(@RequestBody RequestModel data, Model model) {
		model.addAttribute("message", data);
		return "hello";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String postForm(RequestModel data, Model model) {
		if (data.getOrder_no() == null || "".equals(data.getOrder_no())) {
			throw new NullPointerException();
		}

		model.addAttribute("message", data);
		return "hello";
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(HttpServletRequest req, Exception exception) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", exception);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName("error");
		return mav;
	}

}
