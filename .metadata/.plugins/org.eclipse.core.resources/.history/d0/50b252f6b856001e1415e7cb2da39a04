package com.training.studentservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
public class StudentServiceTest extends StudentServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	
	@Test
	public void testStudent() throws Exception {
		mockMvc.perform(get("/studapi/stud/2")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json"))
				.andExpect(jsonPath("$.studName").value("James")).andExpect(jsonPath("$.age").value(22))
				.andExpect(jsonPath("$.studId").value(2)).andExpect(jsonPath("$.grade").value("A"));

	}
	
}
