package com.oracle.team_project_01.sjDao;

import java.util.List;

import com.oracle.team_project_01.model.OldBook;

public interface OldBookDao {

	int 			    totalOb(OldBook oldBook);
	List<OldBook> 	    listOb(OldBook oldBook);
	OldBook             detailOb(int ob_num);
	int                 updateOb(OldBook oldBook);
	int 				insertOldBook(OldBook oldBook);
	List<OldBook>       oldBookAcc();
	List<OldBook>       listMoOb(OldBook oldBook);
	OldBook             ModetailNb(int nb_num);
	List<OldBook>       listObFo(OldBook oldBook);
	int                 totalOb2(OldBook oldBook);
	int                 updateObComp(OldBook oldBook);
	int                 totalNb();
	int                 updateReadCnt(int ob_num);
	List<OldBook>       selectRendomObNum();

 
	 
	 
	
}
