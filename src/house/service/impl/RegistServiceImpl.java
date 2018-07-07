package house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import house.domain.HouseOwner;
import house.domain.Student;
import house.mapper.HouseOwnerMapper;
import house.mapper.StudentMapper;
import house.service.RegistService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service
public class RegistServiceImpl implements RegistService {
	
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private HouseOwnerMapper houseOwnerMapper;

	@Override
	public int insertStudent(String studentpwd, String name, String studentLocation, String studentPhone, String studentAge, String gender) {
		Student student=new Student(studentpwd, name, studentLocation, studentPhone, studentAge, gender);
		
		studentMapper.insert(student);
		return student.getStudentId();
	}

	@Override
	public int insertHouseOwner(String password, String name, String location, String phone) {
		HouseOwner houseOwner=new HouseOwner(password, name, location, phone);
		houseOwnerMapper.insert(houseOwner);
		return houseOwner.getHouseOwnerId();
	}

}
