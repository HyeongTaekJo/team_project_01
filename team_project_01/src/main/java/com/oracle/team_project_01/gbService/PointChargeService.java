package com.oracle.team_project_01.gbService;

import org.springframework.stereotype.Service;

import com.oracle.team_project_01.domain.KakaoPayApprovalVO;
import com.oracle.team_project_01.gbDao.PointChargeDao;
import com.oracle.team_project_01.model.Orderr;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PointChargeService {
	private final PointChargeDao pcd;
	
	public int InsertUpdatePointCharge(KakaoPayApprovalVO kakaoDto) {
		System.out.println("PointChargeService InsertUpdatePointCharge start...");
		int result = 0;
		
		result = pcd.InsertUpdatePointCharge(kakaoDto);
		System.out.println("PointChargeService InsertUpdatePointCharge result -> "+result);
		
		return result;
	}
}
