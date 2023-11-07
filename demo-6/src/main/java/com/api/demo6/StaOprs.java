package com.api.demo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StaOprs {
	
private static final String name = "src/main/resources/data.xlsx";
	
public static List<Station> staList = new ArrayList<Station>();
	
	public StaOprs() {
		/*Station sta = new Station();
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
		
		Station sta3 = new Station();
		sta3.setStation_id(4);
		sta3.setStation_name("Mount Lavinia");
		sta3.setDay("Friday");
		sta3.setStart("Maradana");
		sta3.setEnd("Wadduwa");
		sta3.setArrive("05.10AM");
		sta3.setLeave("05.12AM");
		staList.add(sta3);
		
		Station sta4 = new Station();
		sta4.setStation_id(5);
		sta4.setStation_name("Mount Lavinia");
		sta4.setDay("Monday");
		sta4.setStart("Maradana");
		sta4.setEnd("Wadduwa");
		sta4.setArrive("05.10PM");
		sta4.setLeave("05.12PM");
		staList.add(sta4);*/
		
		try {
			FileInputStream file = new FileInputStream(new File(name));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming the first sheet contains the station data

	        for (Row row : sheet) {
	            if (row.getRowNum() == 0) { // Skip the header row
	                continue;
	            }
	            
	            try {
		            Station station = new Station();
		            
		           	station.setStation_id(row.getCell(0).getNumericCellValue());
		           	try {
		           		station.setStation_name(row.getCell(1).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setStation_name("");
		           	}
		           	try {
		           		station.setDay(row.getCell(2).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setDay("");
		           	}
		           	try {
		           		station.setStart(row.getCell(3).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setStart("");
		           	}
		           	try {
		           		station.setEnd(row.getCell(4).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setEnd("");
		           	}
		           	try {
		           		station.setArrive(row.getCell(5).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setArrive("");
		           	}
		           	try {
		           		station.setLeave(row.getCell(6).getStringCellValue());
		           	}catch(Exception e) {
		           		station.setLeave("");
		           	}
		            	
		            staList.add(station);
	            
	            }catch(Exception e) {
	            	break;
	            }
	        }
	        workbook.close();
	    } catch (IOException e) {
	        System.err.println("Error reading Excel file: " + e.getMessage());
	    }
		
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
