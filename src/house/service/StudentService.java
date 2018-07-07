package house.service;

import house.domain.Student;

public interface StudentService {

	int updateStudent(String studentId,String studentPhone,String studentLocation,
			String studentAge,String gender);
	
	Student findById(String studentId);
	
	int updateHouseId(String studentId,String idHouseInfo);
	
	Student findByHouseId(String idHouseInfo);
}
