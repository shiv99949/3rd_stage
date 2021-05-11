//package com.cognizant.ormlearn;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import com.cognizant.ormlearn.model.Country;
//import com.cognizant.ormlearn.service.CountryService;
//import com.cognizant.springlearn.service.exception.CountryNotFoundException;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//
//import org.slf4j.LoggerFactory;
//@SpringBootApplication
//public class OrmLearnApplication {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
//	public static CountryService countryService;
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
//		 countryService = context.getBean(CountryService.class);
//		testGetAllCountries();
//		getAllCountriesTest();
//		testAddCountry();
//		testUpdateCountry();
//		testDeleteCountry();
//		LOGGER.info("Inside main");   DAY 1 - one

//		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
//		countryService = context.getBean(CountryService.class);
//		
//		 testGetAllCountries(); testFindCountryByCode(); testAddCountry();
//		 testUpdateCountry(); testDeleteCountry();
//		 
//		 testFindByNameContaining();
//		testFindByNameContainingOrderByAsc();
//		testfindByNameStartingWith();
//		LOGGER.info("Inside main");
//	}
//	private static void testGetAllCountries() {
//
//		 LOGGER.info("Start");
//
//		 List<Country> countries = countryService.getAllCountries();
//
//		 LOGGER.debug("countries={}", countries);
//
//		 LOGGER.info("End");
//
//		 }
//	private static void getAllCountriesTest() {
//
//		 LOGGER.info("Start");
//
//			Country country;
//			try {
//				country = countryService.findCountryByCode("IN");
//				LOGGER.debug("Country:{}", country);
//			} catch (CountryNotFoundException e) {
//				e.printStackTrace();
//			}
//
//			LOGGER.info("End");
//
//		 }
//	private static void testAddCountry() {
//		 Country country = new Country();
//		 country.setCode("KM");
//		 country.setName("MEGH");
//		 countryService.addCountry(country);
//		 getAllCountriesTest();
//	 }
//	 
//	 private static void testUpdateCountry() {
//			countryService.updateCountry("KM","Megh");
//		}
//	 
//	 private static void testDeleteCountry() {
//			countryService.deleteCountry("KM");
//		}
	
	
	
	//FOR DAY 2 handson-1
//	private static void testGetAllCountries() {
//
//		LOGGER.info("Start");
//
//		Country country;
//		try {
//			country = countryService.findCountryByCode("IN");
//			LOGGER.debug("Country:{}", country);
//		} catch (CountryNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		LOGGER.info("End");
//
//	}
//
//	private static void testFindCountryByCode() {
//		try {
//			Country country = countryService.findCountryByCode("ME");
//			System.out.println(country.getName());
//		} catch (CountryNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void testAddCountry() {
//		Country newCountry = new Country();
//		newCountry.setCode("KM");
//		newCountry.setName("MEGH");
//		countryService.addCountry(newCountry);
//		testFindCountryByCode();
//
//	}
//
//	private static void testUpdateCountry() {
//		countryService.updateCountry("KM", "Megh");
//	}
//
//	private static void testDeleteCountry() {
//		countryService.deleteCountry("KM");
//	}
//
//	private static void testFindByNameContaining() {
//
//		List<Country> cList = countryService.findByNameContaining("ou");
//		System.out.println("----------------------COUTRIES CONTAINING ou IN NAME---------------------------");
//		for (Country c : cList) {
//			System.out.println(c.getCode() + " " + c.getName());
//		}
//		System.out.println("------------------------------------------------------------------");
//	}
//
//	private static void testFindByNameContainingOrderByAsc() {
//
//		List<Country> cList = countryService.findByNameContainingOrderByAsc("ou");
//		System.out.println("------------------------COUTRIES CONTAINING ou IN NAME IN ASCENDING ORDER-------------------");
//		for (Country c : cList) {
//			System.out.println(c.getCode() + " " + c.getName());
//		}
//		System.out.println("-------------------------------------------------------------------");
//	}
//
//	private static void testfindByNameStartingWith() {
//		List<Country> list = countryService.findByNameStartingWith("z");
//		System.out.println("-------------------------------COUNTRIES STARTING WITH z----------------------------------- ");
//		for (Country c : list) {
//			System.out.println(c.getCode() + " " + c.getName());
//		}
//		System.out.println("--------------------------------------------------------------------");
//	}
//	
//
//	 
//}




//DAY-2 handson-2


//package com.cognizant.ormlearn;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import com.cognizant.ormlearn.model.Stock;
//import com.cognizant.ormlearn.repository.StockRepository;
//import com.cognizant.ormlearn.service.StockService;

//import java.sql.Date;
//import java.util.List;
//
//import org.slf4j.Logger;
//
//import org.slf4j.LoggerFactory; 
//@SpringBootApplication
//public class OrmLearnApplication {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
//	private static StockService stockService;
//	
//	public static void main(String[] args) {
//		
//		
//		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
//		LOGGER.info("Inside main"); 
//		stockService = context.getBean(StockService.class);
//		//List<Stock> list=stockService.getByCodeAndDate();
//		//List<Stock> list=stockService.getByCodeAndStockPrice();
//		//List<Stock> list=stockService.getTop3ByVolume();
//		List<Stock> list=stockService.getTop3ByCode();
//		for(Stock s: list) {
//			System.out.println(s.toString());
//		}
//		
//		//System.out.println(stockService.getStocks());
//		
//		
//		
//	}
//
//}


//Handson-4 day 2

package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static EmployeeService employeeService;
	public static DepartmentService departmentService;
	public static SkillService skillService;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		
		testGetEmployee();
		testAddEmployee();
		testUpdateEmployee();
		testGetDepartment();
		testAddSkillToEmployee();
		LOGGER.info("Inside main");
	}
	
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(101);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());
		
		LOGGER.debug("Skills:{}", employee.getSkillList());

		LOGGER.info("End");

		}
	
	private static void testAddEmployee() {
		
		Employee employee = new Employee();
		employee.setId(105);
		employee.setName("Neelima");
		employee.setSalary(25000.00);
		try {
			employee.setDateOfBirth(new SimpleDateFormat("YYYY-MM-DD").parse("1999-04-28"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setPermanent(true);
		
		Department dept= departmentService.get(1);
		employee.setDepartment(dept);
		employeeService.saveEmployee(employee);
		
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());
	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");

		Employee employee = employeeService.get(105);
		Department dept= departmentService.get(3);
		employee.setDepartment(dept);
		employeeService.saveEmployee(employee);
		
		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");
	}
	
	private static void testGetDepartment() {
		LOGGER.info("Start");

		 Department dept= departmentService.get(1);

		LOGGER.debug("Department:{}", dept);

		LOGGER.debug("Department:{}", dept.getEmployeeList());

		LOGGER.info("End");

	}
	
	private static void testAddSkillToEmployee() {
		
		Employee employee = employeeService.get(101);
		Skill skill = skillService.get(13);
		
		Set<Skill> set=employee.getSkillList();
		set.add(skill);
		
		employee.setSkillList(set);
		
		employeeService.saveEmployee(employee);
	}
}
