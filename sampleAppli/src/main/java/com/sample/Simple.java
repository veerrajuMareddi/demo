package com.sample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody*/
@RestController
@RequestMapping("/google")
public class Simple {
	@GetMapping("/page1")
	public Data method()
	{
		return new Data("facebook","employee");
	}
	@GetMapping("/page2")
	public Data method2()
	{
	  return new Data(1,"sabhash")	;
	}
	

}
