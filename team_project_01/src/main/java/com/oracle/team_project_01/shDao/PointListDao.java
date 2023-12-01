package com.oracle.team_project_01.shDao;

import java.util.List;

import com.oracle.team_project_01.model.Attendance;
import com.oracle.team_project_01.model.Member;
import com.oracle.team_project_01.model.PointList;

public interface PointListDao {

	List<PointList> selectMemberPoint(Member member);
	int 			pointSum(int m_num);
	int 			boUpdatePlusPoint(Member member);
	int 			boInsertPlusPoint(Member member);
	int 			boInsertMinusPoint(Member member);
	int 			boUpdateMinusPoint(Member member);
	List<PointList> boJoinedMember(Attendance attendance);
	int 			memberPointList(int m_num);
	int 			joinedCount(int eNum);
	List<PointList> boMemberSelect(PointList pointList);
	int 			joinedCountSelect(int eNum);
	int 			joinedList(int eNum);

}
