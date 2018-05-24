package com.boot.service;

import java.util.List;

import com.boot.entity.StudentEntity;
import com.boot.vo.StudentRequest;

public interface IStudentService {
public void saveData(StudentRequest request) throws Exception;
public List<StudentEntity> getData();
StudentEntity getstudent(Long id);
public void delete(Long id);
}
