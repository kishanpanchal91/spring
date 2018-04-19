package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.IStudentDao;
import com.boot.entity.StudentEntity;
import com.boot.vo.StudentRequest;

@Service
public class StudentService implements IStudentService {

	@Autowired
	IStudentDao istudentDao;

	@Transactional(rollbackOn=Exception.class)
	@Override
	public void saveData(StudentRequest request) throws Exception {

		StudentEntity entity = new StudentEntity();
		/*if(null!=request.getId() &&request.getId()!=0l) {
			entity.setId(request.getId());
		}*/
	/*	entity.setAge(request.getAge());
		entity.setFirstName(request.getFirstName());
		entity.setLastName(request.getLastName());*/
		 BeanUtils.copyProperties(entity, (StudentRequest) request);
		istudentDao.save(entity);
		if(entity.getAge().equals("25")) {
			throw new Exception("This custom exception");
			}
		
		// sessionFactory.getCurrentSession().persist(entity);
	}

	@Override
	public List<StudentEntity> getData() {
		List<StudentEntity> s=new ArrayList<StudentEntity>();
		istudentDao.findAll().forEach(s::add);
		return s;
	}
	@Override
	public StudentEntity getstudent(Long id) {
		return istudentDao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		istudentDao.deleteById(id);		
	}
}
