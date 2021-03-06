package com.corp.OilcorpController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.corp.OilcorpModel.OilCorp;
import com.corp.OilcorpModel.OilCorpEmployees;
import com.corp.OilcorpModel.OilCorpPrices;
//import com.corp.OilcorpModel.OilCorpTransactions;
import com.corp.OilcorpRepository.OilCropEmployeesRepository;
import com.corp.OilcorpRepository.PricesRepository;
import com.corp.OilcorpRepository.Repository;
//import com.corp.OilcorpRepository.TransactionRepository;
import com.corp.OilcorpService.OilCorpService;

@Controller
@RequestMapping("/src")
public class OilCorpController {
	
	
	  @Autowired private OilCorpService service;
	  
	  @Autowired private Repository repo;
	  
	  @Autowired private OilCropEmployeesRepository empSer;
	  
	  @Autowired private PricesRepository price;
	 

	@GetMapping("/index")
	public String homePage() 
	{
		return "index";
	}
	
	@GetMapping("/callsave")
	public String savepage()
	{
		return "save";
	}

	@RequestMapping("/saveModel")
	public String savei(@ModelAttribute OilCorp oil, Model model)
	{
		OilCorpEmployees cop = oil.getEmp();
		cop.setCorp(oil);
	    model.addAttribute("add",oil);
		OilCorpPrices ops=oil.getPrices();
		ops.setOilPrices(oil);		
		service.saveData(oil);	
		return "employees";
	}
	@RequestMapping("/employees")
	public String sts(@ModelAttribute("pric") OilCorp oil)
	{
		
		return "simple";
	}
	@RequestMapping("/saveTotal")
	public String sav(@ModelAttribute("details") OilCorp oil)
	{
		  OilCorpEmployees cop = oil.getEmp(); 
		  cop.setCorp(oil);
		 // model.addAttribute("add",oil);
		  OilCorpPrices ops=oil.getPrices();
		  ops.setOilPrices(oil);
		 		
		service.saveData(oil);	
		return "single";
	}
	@PostMapping("/ps")
	public OilCorp met(@RequestBody OilCorp op)
	{
		return service.saveData(op);
	}
	
	@GetMapping("/get")
	public String view(Model model) 
	{
		List<OilCorp> oilCorp = service.getAll();
		model.addAttribute("oilCorp", oilCorp);
		return "result";
	}
		
	@GetMapping("/update")
	public String map(@RequestParam("Id") int id, Model model)
	{
		OilCorp oc = service.getBYId(id);
		model.addAttribute("oil", oc);
		return"update"; 
	}
	
    @GetMapping("/child")
    public String call()
    {
	    return("byid");
    }


	@PostMapping("/getByChild")
	public String get(@ModelAttribute OilCorpEmployees id,Model model)
	{
		String num=id.getAssistManager();		
		List<OilCorpEmployees> op= empSer.getByAssistManager(num);
		model.addAttribute("getId",op);
		return "unique";
	}
	
	
	@GetMapping("/parent")
	public String child()
	{
		return("getByParent");
	}
	
	
	@PostMapping("/getByparent")
	public String getg(@ModelAttribute OilCorp id,Model model) 
	{
		int number=id.getBranch();
		OilCorp op= repo.getById(number);
		model.addAttribute("getId",op);
		return "parentId";
	}
	
		
	@GetMapping("/deleteById")
	public String delete(@RequestParam("Id") Integer id)
	{
		service.deleteBYId(id);
		return "redirect:/src/get";
	}
}
