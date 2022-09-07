package com.test.sonar.child.dto.service;

import java.util.ArrayList;

import com.test.sonar.child.dto.Child;
import com.test.sonar.parent.data.service.ParentService;

public class ChildServiceImpl implements ParentService<Child> {

	@Override
	public Child createResponse(String str1, String str2) {
		return Child.builder().str(new ArrayList<>()).build();
	}

}
