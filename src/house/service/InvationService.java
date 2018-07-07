package house.service;

import java.util.List;

import house.domain.MeetInfo;

public interface InvationService {

	int insert(String idHouseInfo,String studentId,String houseOwnerId,String meetTime,String meetLocation);
	
	int updateState(String state,String idMeetInfo);
	
	int update(String meetTime,String meetLocation,String idMeetInfo);
	
	List<MeetInfo> showAcptInvations(String houseOwnerId);
	
	List<MeetInfo> showSendInvations(String studentId);
	
	int delete(String idMeetInfo);
}
