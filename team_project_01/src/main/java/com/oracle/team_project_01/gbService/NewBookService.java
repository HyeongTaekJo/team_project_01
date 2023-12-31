package com.oracle.team_project_01.gbService;

import java.util.List;

import com.oracle.team_project_01.model.Cart;
import com.oracle.team_project_01.model.NewBook;
import com.oracle.team_project_01.model.WishList;

public interface NewBookService { 
	
	List<NewBook> 	selectInNewBookList(NewBook newbook);
	int 			selectInNewBookCnt(NewBook newbook);
	int 			selectSearchNewBookCnt(NewBook newbook);
	List<NewBook> 	selectSearchNewBookList(NewBook newbook);
	NewBook 		selectNewBookDetail(NewBook newbook);
	int 			updateReadCnt(int nb_num);
	List<NewBook> 	selectHitNbNum();
	int 			insertUpdateWish(WishList wishlist);
	int 			insertCart(Cart cart);
	int 			updateCartCount(Cart cart);
	void 			deleteCart(Cart cart);
	List<NewBook> 	selectSearchBoNewBookList(NewBook newbook);
	NewBook 		selectBoNewBookDetail(NewBook newbook);
	int 			updateBoNewbook(NewBook newbook);
	List<NewBook> 	selectBoNewBookList(NewBook newbook);
	int 			deleteBoNewbook(int nb_num);
	int 			insertBoNewbook(NewBook newbook);
	NewBook 		selectRecentBookList(int nb_num);
	NewBook 		selectAllHitNbNum();
	List<NewBook> 	selectReleaseNewbookListNum();  

}
