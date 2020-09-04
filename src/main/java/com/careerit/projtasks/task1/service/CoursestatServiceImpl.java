package com.careerit.projtasks.task1.service;

import java.util.List;
import java.util.stream.Collectors;

import com.careerit.projtasks.task1.domain.Student;
import com.careerit.projtasks.task1.dto.CountDTO;
import com.careerit.projtasks.task1.util.CsvReaderUtil;

public class CoursestatServiceImpl implements CoursestatService {

	private List<Student> studentList;
	
	public CoursestatServiceImpl(String filePath) {
			this.studentList = CsvReaderUtil.loadStudentsFromCSV(filePath);
	}
	
	@Override
	public List<Student> studentsByQualification(String qualification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStudentCountByQualification(String qualification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNotPlacedStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CountDTO getPlacedAndNotPlacedCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float successRate(String batchName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> maxScoreStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getStudentNames() {
		return studentList.stream().map(s->s.getName()).collect(Collectors.toList());
	}

}
