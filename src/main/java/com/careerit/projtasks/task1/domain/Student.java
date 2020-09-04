package com.careerit.projtasks.task1.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private String name;
	private String batch;
	private Status ccstatus;
	private Status pstatus;
	private String qualification;
	private float score;
}
