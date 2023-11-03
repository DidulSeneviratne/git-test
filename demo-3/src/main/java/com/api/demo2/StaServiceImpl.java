package com.api.demo2;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StaServiceImpl implements StaService{

	@Override
	public List<Station> getStationList() {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getStation();
	}

	@Override
	public List<Station> findByStaId(int id) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getStationById(id);
	}

	@Override
	public List<Station> findByStaName(String name) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getStationByName(name);
	}

	@Override
	public List<Station> findByStaDay(String day) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getStationByDay(day);
	}

	@Override
	public List<Station> findBySearchString(String searchKeyword) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getStationBySearchName(searchKeyword);
	}
	
	@Override
	public List<Station> findByNameAndDepartment(String name, String end) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getEmployeeByNameAndDepartment(name, end);
	}
	
	@Override
	public List<Station> findByNameAndDepartment1(String name, String start) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getEmployeeByNameAndDepartment1(name, start);
	}
	
	@Override
	public List<Station> findByNameAndDepartment2(String name, String start, String end) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getEmployeeByNameAndDepartment2(name, start, end);
	}
	
	@Override
	public List<Station> saveStation(Station emp) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.saveStation(emp);
	}

	@Override
	public List<Station> updateStation(Station emp) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.updateStation(emp);
	}

	@Override
	public List<Station> deleteStation(Station emp) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.deleteStation(emp);
	}

	@Override
	public List<Station> findByNameAndDepartment3(String name, String end, String day) {
		// TODO Auto-generated method stub
		StaOprs staOprs = new StaOprs();
		return staOprs.getEmployeeByNameAndDepartment3(name, end, day);
	}
	
}
