package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.TractorDAO;
import com.xworkz.dao.TractorDAOImpl;
import com.xworkz.dto.TractorDTO;

public class Tester {
	public static void main(String[] args) {
		String configContextocation = "Application.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configContextocation);
		TractorDAO tractorDAO = applicationContext.getBean(TractorDAO.class);
		TractorDTO tractorDTO = new TractorDTO("Mahindra", 400000, "Red", 45, 50, 6);
		tractorDAO.saveTractor(tractorDTO);
	}

}
