package com.oracle.team_project_01.gbService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.team_project_01.gbDao.NewBookOldBookDao;
import com.oracle.team_project_01.model.NewBookOldBook;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NewBookOldBookServiceImpl implements NewBookOldBookService {
	
	private final NewBookOldBookDao nbobd;
	

	@Override
	public List<NewBookOldBook> selectSameOldBookList(int nb_num) {
		System.out.println("NewBookOldBookServiceImpl selectSameOldBookList start...");
		List<NewBookOldBook> sameOldBookList = nbobd.selectSameOldBookList(nb_num);
		System.out.println("NewBookOldBookServiceImpl selectSameOldBookList sameOldBookList.size->"+sameOldBookList.size());
		
		return sameOldBookList;
	}

}
