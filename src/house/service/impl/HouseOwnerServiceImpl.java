package house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import house.domain.HouseOwner;
import house.mapper.HouseOwnerMapper;

@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.DEFAULT)
@Service
public class HouseOwnerServiceImpl implements house.service.HouseOwnerService {
	
	@Autowired
	private HouseOwnerMapper houseOwnerMapper;

	@Override
	public HouseOwner findById(Integer houseOwnerId) {
		return houseOwnerMapper.findById(houseOwnerId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateHouseOwner(String houseOwnerId, String phone, String location) {
		houseOwnerMapper.update(houseOwnerId, phone, location);
		return 0;
	}

}
