package com.oracle.team_project_01.gbService;

import java.util.List;

import com.oracle.team_project_01.model.NewBookOldBook;

public interface NewBookOldBookService {

	List<NewBookOldBook> selectSameOldBookList(int nb_num);

}
