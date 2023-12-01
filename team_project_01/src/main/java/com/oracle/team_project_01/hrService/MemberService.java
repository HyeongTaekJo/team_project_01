package com.oracle.team_project_01.hrService;

import org.springframework.stereotype.Service;
import com.oracle.team_project_01.hrDao.MemberDao;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberDao md;
	
	public int memTot() {
		System.out.println("Service start..");
		int result = md.memTot();
		System.out.println("Service result -> "+ result);
		return result;
	}
}
