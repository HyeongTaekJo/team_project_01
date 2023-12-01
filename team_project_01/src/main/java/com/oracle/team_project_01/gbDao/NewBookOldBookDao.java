package com.oracle.team_project_01.gbDao;

import java.util.List;

import com.oracle.team_project_01.model.NewBookOldBook;

public interface NewBookOldBookDao {

	List<NewBookOldBook> selectSameOldBookList(int nb_num);

}
