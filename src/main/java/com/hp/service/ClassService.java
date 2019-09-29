package com.hp.service;

import com.hp.bean.Class;

public interface ClassService {

	Class queryAllByClassNum(Integer classNum);

	Class queryClassByClassNum(Integer classNum);
}
