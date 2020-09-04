package com.careerit.projtasks.task1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoursestatServiceTest {
		
		private CoursestatService service;
		private String filePath = "src/test/resources/student_test.csv";
		
		@BeforeEach
		public void init() {
			service = new CoursestatServiceImpl(filePath);
		}
		
		@Test
		void getStudentNames() {
			List<String> list = service.getStudentNames();
			list.stream().forEach(System.out::println);
			assertEquals(12, list.size());
		}
	
}
