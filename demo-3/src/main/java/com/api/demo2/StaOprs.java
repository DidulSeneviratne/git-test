package com.api.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StaOprs {
	
	public List<Station> staList = new ArrayList<Station>();
	
	public StaOprs() {
		Station sta = new Station();
		sta.setStation_id(1);
		sta.setStation_name("Angulana");
		sta.setDay("Monday");
		sta.setStart("Aluthgama");
		sta.setEnd("Colombo Fort");
		sta.setArrive("04.33AM");
		sta.setLeave("04.34AM");
		staList.add(sta);
		
		Station sta1 = new Station();
		sta1.setStation_id(2);
		sta1.setStation_name("Panadura");
		sta1.setDay("Monday");
		sta1.setStart("Panadura");
		sta1.setEnd("Colombo Fort");
		sta1.setArrive("05.03AM");
		sta1.setLeave("05.04AM");
		staList.add(sta1);
		
		Station sta2 = new Station();
		sta2.setStation_id(3);
		sta2.setStation_name("Mount Lavinia");
		sta2.setDay("Friday");
		sta2.setStart("Maradana");
		sta2.setEnd("Wadduwa");
		sta2.setArrive("05.05AM");
		sta2.setLeave("05.06AM");
		staList.add(sta2);
		
	}
	
	public List<Station> getStation(){
		return staList;
	}
	
	public List<Station> getStationById(int id){
		List<Station> newList = staList.stream().filter(e->e.getStation_id()==id).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getStationByName(String name){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().equals(name)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getStationByDay(String day){
		List<Station> newList = staList.stream().filter(e->e.getDay().equals(day)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getStationBySearchName(String searchString){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().contains(searchString)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getEmployeeByNameAndDepartment(String name, String end){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().equals(name)&&e.getEnd().equals(end)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getEmployeeByNameAndDepartment1(String name, String start){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().equals(name)&&e.getStart().equals(start)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getEmployeeByNameAndDepartment2(String name, String start, String end){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().equals(name)&&e.getStart().equals(start)&&e.getEnd().equals(end)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> getEmployeeByNameAndDepartment3(String name, String end, String day){
		List<Station> newList = staList.stream().filter(e->e.getStation_name().equals(name)&&e.getEnd().equals(end)&&e.getDay().equals(day)).collect(Collectors.toList());
		return newList;
	}
	
	public List<Station> saveStation(Station sta){
		staList.add(sta);
		return staList;
	}
	
	public List<Station> updateStation(Station newsta){
		List<Station> newList = new ArrayList<>();
		for(Station oldEmp:staList){
			if(oldEmp.getStation_id()!= newsta.getStation_id()){
				newList.add(oldEmp);
			}else {
				newList.add(newsta);
			}
		}
		staList = newList;
		return newList;
	}
	
	public List<Station> deleteStation(Station newsta){
		List<Station> newList = new ArrayList<>();
		for(Station oldEmp:staList){
			if(oldEmp.getStation_id()!= newsta.getStation_id()){
				newList.add(oldEmp);
			}
		}
		staList = newList;
		return newList;
	}
}