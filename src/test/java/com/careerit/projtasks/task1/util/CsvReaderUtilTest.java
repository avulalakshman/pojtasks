package com.careerit.projtasks.task1.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.careerit.projtasks.task1.domain.Student;

public class CsvReaderUtilTest {

			private String filePath = "src/test/resources/student_test.csv";
			
			@Test
			void loadStudentsFromCSV() {
				List<Student> list = CsvReaderUtil.loadStudentsFromCSV(filePath);
				int expected = 12;
				int actual = list.size();
				assertEquals(expected, actual);
			}
}
