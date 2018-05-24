package com.example.mvc.city;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/city")
public class CityController {

	private static final Logger logger = LoggerFactory.getLogger(CityController.class.getSimpleName());

	@Autowired
	CityService cityService;

	@GetMapping("/")
	public String cityForm(@RequestParam(defaultValue = "") String id, Model model) {
		return "createcity";
	}
	
	@GetMapping("/{id}")
	public String getCity(@PathVariable String id, Model model) {
		logger.info("getCity Controller called.....");
		if (id != null && !id.isEmpty()) {
			Optional<City> city = cityService.getCityById(Long.valueOf(id));
			model.addAttribute("city", city.get());
		}
		return "createcity";
	}

	@PostMapping("/add")
	public String addCity(@RequestParam String name, @RequestParam String state) {
		logger.info("addCity Controller called.....");
		cityService.addCity(name, state);
		return "redirect:/city/getcities";
	}
	
	@PutMapping("/{id}")
	public @ResponseBody String updateCity(@PathVariable("id") Long id, @ModelAttribute City city) throws Exception {
		logger.info("updateCity Controller called.....");
		cityService.updateCity(city, id);
		return "ok";
	}
	
	
	@GetMapping("/getcities")
	public String getCityList(Model model) {
		logger.info("getCityList controller called...");
		model.addAttribute("cities", cityService.getCityList());
		return "showcities";
	}

	@DeleteMapping("/{id}")
	public @ResponseBody String deleteCity(@PathVariable("id") Long id) {
		logger.info("deleteCity controller called...." + id);
		cityService.deleteCity(id);
		return "ok";
	}

}
