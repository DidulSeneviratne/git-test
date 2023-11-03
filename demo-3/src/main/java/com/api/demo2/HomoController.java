package com.api.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomoController {
	
	@Autowired
	public StaService service;

	@GetMapping("/getall")
	public List<Station> getStations(){
		return service.getStationList();
	}
	
	@GetMapping("/getbyid/{id}")
	public List<Station> getStationById(@PathVariable("id")int id){
		return service.findByStaId(id);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Station> getStationByName(@PathVariable("name")String name){
		return service.findByStaName(name);
	}
	
	@GetMapping("/getbyday/{day}")
	public List<Station> getStationByDay(@PathVariable("day")String day){
		return service.findByStaDay(day);
	}
	
	@GetMapping("/getbykeyword/{searchString}")
	public List<Station> getStationBySearchString(@PathVariable("searchString")String searchString){
		return service.findBySearchString(searchString);
	}
	
	@GetMapping("/getbyname_and_end/{name}/{end}")
	public List<Station> getEmployeeByNameAndDep(@PathVariable("name")String name,@PathVariable("end")String end){
		return service.findByNameAndDepartment(name,end);
	}
	
	@GetMapping("/getbyname_and_start/{name}/{start}")
	public List<Station> getEmployeeByNameAndDep1(@PathVariable("name")String name,@PathVariable("start")String start){
		return service.findByNameAndDepartment1(name,start);
	}
	
	@GetMapping("/getbyname_and_start_end/{name}/{start}/{end}")
	public List<Station> getEmployeeByNameAndDep2(@PathVariable("name")String name,@PathVariable("start")String start,@PathVariable("end")String end){
		return service.findByNameAndDepartment2(name,start,end);
	}
	
	@GetMapping("/getbyname_and_end_day/{name}/{end}/{day}")
	public List<Station> getEmployeeByNameAndDep3(@PathVariable("name")String name,@PathVariable("end")String end,@PathVariable("day")String day){
		return service.findByNameAndDepartment3(name,end,day);
	}
	
}
