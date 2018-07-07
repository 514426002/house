package house.service;

import house.domain.HouseOwner;
import house.domain.Student;

public interface LoginService {

	HouseOwner ownerLogin(String loginId,String ownerPwd);
	
	Student studentLogin(String loginId,String studentPwd);
}
