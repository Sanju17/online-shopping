package org.sangharsha.onlineshooping.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handleNoHandlerFoundException() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "404 Page Not Found");
		mv.addObject("errorTitle", "The page is not Contructed!");
		mv.addObject("errorDescription", "The page you are looking for is not available now!");
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handleProductNotFoundException() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Product Not Available");
		mv.addObject("errorTitle", "Product Unavaiable!");
		mv.addObject("errorDescription", "The product you are looking for is not available right now!");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleGeneralException(Exception ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("title", "Error!");
		mv.addObject("errorTitle", "Contact your Administrator!!!");
		mv.addObject("errorDescription", ex.toString());
		return mv;
	}
}
