package com.oracle.team_project_01.htService;

import java.util.List;

import com.oracle.team_project_01.domain.KakaoPayApprovalVO;
import com.oracle.team_project_01.model.Cart;
import com.oracle.team_project_01.model.Member;
import com.oracle.team_project_01.model.NewBook;
import com.oracle.team_project_01.model.Orderr;
import com.oracle.team_project_01.model.Review;

public interface OrderrService {
	
	int           orderTotal();
	List<NewBook> orderOne(NewBook newBook);
	List<Cart>    orderList(Cart cart, Member member);
	void          orderInsert(Orderr orderr, List<Cart> list);
	Orderr        orderPayment(Orderr orderr);
	int           paySuccess(KakaoPayApprovalVO ka);
	Member        selectMember(Member member);
	Orderr        obNumSelect(KakaoPayApprovalVO kakaoDto);
}
