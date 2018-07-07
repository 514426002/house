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
import house.service.LoginService;

@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.DEFAULT)
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private HouseOwnerMapper houseOwnerMapper;
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public HouseOwner ownerLogin(String loginId, String ownerPwd) {
		return houseOwnerMapper.findWithLoginnameAndPassword(loginId, ownerPwd);
	}

	@Override
	public Student studentLogin(String loginId, String studentPwd) {
		return studentMapper.findWithLoginnameAndPassword(loginId, studentPwd);
	}

}
