package com.api.demo2;

import java.util.List;

public interface StaService {
	
	public List<Station> getStationList();
	public List<Station> findByStaId(int id);
	public List<Station> findByStaName(String name);
	public List<Station> findByStaDay(String day);
	public List<Station> findBySearchString(String searchKeyword);
	public List<Station> findByNameAndDepartment(String name, String end);
	public List<Station> findByNameAndDepartment1(String name, String start);
	public List<Station> findByNameAndDepartment2(String name, String start, String end);
	public List<Station> findByNameAndDepartment3(String name, String end, String day);
	public List<Station> saveStation(Station sta);
	public List<Station> updateStation(Station sta);
	public List<Station> deleteStation(Station sta);
	
}
