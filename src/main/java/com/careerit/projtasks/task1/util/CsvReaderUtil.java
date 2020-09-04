package com.careerit.projtasks.task1.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.careerit.projtasks.task1.domain.Status;
import com.careerit.projtasks.task1.domain.Student;

public final class CsvReaderUtil {

	private CsvReaderUtil() {

	}

	public static List<Student> loadStudentsFromCSV(String filePath) {

		List<Student> studentsList = new ArrayList<Student>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));

			for (int i = 1; i < lines.size(); i++) {
				String[] arr = lines.get(i).split(",");
				int c = 0;
				String name = arr[c++];
				String batch = arr[c++];
				Status ccstatus = Status.valueOf(arr[c++]);
				Status pstatus = Status.valueOf(arr[c++]);
				String qualification = arr[c++];
				float score = Float.parseFloat(arr[c++]);

				Student student = Student.builder().name(name).batch(batch).pstatus(pstatus).ccstatus(ccstatus).
						qualification(qualification).score(score).build();
				studentsList.add(student);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return studentsList;

	}
}
