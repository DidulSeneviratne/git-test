package com.api.demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StaOprs {
	
	double id;
	String name;
	String day;
	String start;
	String end;
	String arrive;
	String leave;
	
	private static final String url1 = "src/main/resources/Book2.xlsx";
	private static final String url2 = "src/main/resources/Book1.xlsx";
	private static final String url3 = "src/main/resources/Book3.xlsx";
	private static final String url4 = "src/main/resources/Book4.xlsx";
	//private static final String url = "src/main/resources/out.txt";
	
	public static List<Station> staList = new ArrayList<Station>();
	
	public StaOprs() {
		
		/*try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                Station sta = new Station();
                sta.setStation_id(Double.parseDouble(tokens[0]));
                sta.setStation_name(tokens[1]);
                sta.setDay(tokens[2]);
                sta.setStart(tokens[3]);
                sta.setEnd(tokens[4]);
                sta.setArrive(tokens[5]);
                sta.setLeave(tokens[6]);
                staList.add(sta);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: IOException");
            e.printStackTrace();
        }*/
		
		try {
			FileInputStream file = new FileInputStream(new File(url1));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming the first sheet contains the station data

	        for (Row row : sheet) {
	            if (row.getRowNum() == 0) { // Skip the header row
	                continue;
	            }
	            
	            try {
	            	id = row.getCell(0).getNumericCellValue();
		           	try {
		           		name = row.getCell(1).getStringCellValue();
		           	}catch(Exception e) {
		           		name = "";
		           	}
		           	try {
		           		day = row.getCell(2).getStringCellValue();
		           	}catch(Exception e) {
		           		day = "";
		           	}
		           	try {
		           		start = row.getCell(3).getStringCellValue();
		           	}catch(Exception e) {
		           		start = "";
		           	}
		           	try {
		           		end = row.getCell(4).getStringCellValue();
		           	}catch(Exception e) {
		           		end = "";
		           	}
		           	try {
		           		arrive = row.getCell(5).getStringCellValue();
		           	}catch(Exception e) {
		           		arrive = "";
		           	}
		           	try {
		           		leave = row.getCell(6).getStringCellValue();
		           	}catch(Exception e) {
		           		leave = "";
		           	}
		           	
		           	add(id, name, day, start, end, arrive, leave);
	            
	            }catch(Exception e) {
	            	break;
	            }
	        }
	        workbook.close();
	    } catch (IOException e) {
	        System.err.println("Error reading Excel file: " + e.getMessage());
	    }
		
		
		try {
			FileInputStream file = new FileInputStream(new File(url2));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming the first sheet contains the station data

	        for (Row row : sheet) {
	            try {
	            	id = row.getCell(0).getNumericCellValue();
		           	try {
		           		name = row.getCell(1).getStringCellValue();
		           	}catch(Exception e) {
		           		name = "";
		           	}
		           	try {
		           		day = row.getCell(2).getStringCellValue();
		           	}catch(Exception e) {
		           		day = "";
		           	}
		           	try {
		           		start = row.getCell(3).getStringCellValue();
		           	}catch(Exception e) {
		           		start = "";
		           	}
		           	try {
		           		end = row.getCell(4).getStringCellValue();
		           	}catch(Exception e) {
		           		end = "";
		           	}
		           	try {
		           		arrive = row.getCell(5).getStringCellValue();
		           	}catch(Exception e) {
		           		arrive = "";
		           	}
		           	try {
		           		leave = row.getCell(6).getStringCellValue();
		           	}catch(Exception e) {
		           		leave = "";
		           	}
		           	
		           	add(id, name, day, start, end, arrive, leave);
	            
	            }catch(Exception e) {
	            	break;
	            }
	        }
	        workbook.close();
	    } catch (IOException e) {
	        System.err.println("Error reading Excel file: " + e.getMessage());
	    }
		
		
		try {
			FileInputStream file = new FileInputStream(new File(url3));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming the first sheet contains the station data

	        for (Row row : sheet) {
	            try {
	            	id = row.getCell(0).getNumericCellValue();
		           	try {
		           		name = row.getCell(1).getStringCellValue();
		           	}catch(Exception e) {
		           		name = "";
		           	}
		           	try {
		           		day = row.getCell(2).getStringCellValue();
		           	}catch(Exception e) {
		           		day = "";
		           	}
		           	try {
		           		start = row.getCell(3).getStringCellValue();
		           	}catch(Exception e) {
		           		start = "";
		           	}
		           	try {
		           		end = row.getCell(4).getStringCellValue();
		           	}catch(Exception e) {
		           		end = "";
		           	}
		           	try {
		           		arrive = row.getCell(5).getStringCellValue();
		           	}catch(Exception e) {
		           		arrive = "";
		           	}
		           	try {
		           		leave = row.getCell(6).getStringCellValue();
		           	}catch(Exception e) {
		           		leave = "";
		           	}
		           	
		           	add(id, name, day, start, end, arrive, leave);
	            
	            }catch(Exception e) {
	            	break;
	            }
	        }
	        workbook.close();
	    } catch (IOException e) {
	        System.err.println("Error reading Excel file: " + e.getMessage());
	    }
		
		
		try {
			FileInputStream file = new FileInputStream(new File(url4));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0); // Assuming the first sheet contains the station data

	        for (Row row : sheet) {
	            try {
	            	id = row.getCell(0).getNumericCellValue();
		           	try {
		           		name = row.getCell(1).getStringCellValue();
		           	}catch(Exception e) {
		           		name = "";
		           	}
		           	try {
		           		day = row.getCell(2).getStringCellValue();
		           	}catch(Exception e) {
		           		day = "";
		           	}
		           	try {
		           		start = row.getCell(3).getStringCellValue();
		           	}catch(Exception e) {
		           		start = "";
		           	}
		           	try {
		           		end = row.getCell(4).getStringCellValue();
		           	}catch(Exception e) {
		           		end = "";
		           	}
		           	try {
		           		arrive = row.getCell(5).getStringCellValue();
		           	}catch(Exception e) {
		           		arrive = "";
		           	}
		           	try {
		           		leave = row.getCell(6).getStringCellValue();
		           	}catch(Exception e) {
		           		leave = "";
		           	}
		           	
		           	add(id, name, day, start, end, arrive, leave);
	            
	            }catch(Exception e) {
	            	break;
	            }
	        }
	        workbook.close();
	    } catch (IOException e) {
	        System.err.println("Error reading Excel file: " + e.getMessage());
	    }
		
	}
	
	public void add(double id, String name, String day, String start, String end, String arrive, String leave) {
		Station sta = new Station();
		sta.setStation_id(id);
		sta.setStation_name(name);
		sta.setDay(day);
		sta.setStart(start);
		sta.setEnd(end);
		sta.setArrive(arrive);
		sta.setLeave(leave);
		staList.add(sta);
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