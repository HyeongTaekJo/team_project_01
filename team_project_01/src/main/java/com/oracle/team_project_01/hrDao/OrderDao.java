package com.oracle.team_project_01.hrDao;

import java.util.List;

import com.oracle.team_project_01.domain.KakaoPayApprovalVO;
import com.oracle.team_project_01.model.Member;
import com.oracle.team_project_01.model.OrderDetail;
import com.oracle.team_project_01.model.OrderGift;
import com.oracle.team_project_01.model.Orderr;

public interface OrderDao {

	int 			  countOrderrList();
	List<Orderr>	  selectOrderrList(Orderr orderr);
	Orderr 			  selectOrderr(long o_order_num);
	int 			  statusCancellation(long o_order_num);
	int 			  statusDelivered(long o_order_num);
	int 			  statusConfirmation(long o_order_num);
	int 			  statusShipping(Orderr orderr);
	int 			  statusExchange(Orderr orderr);
	int 			  statusReturn(Orderr orderr);
	List<OrderDetail> selectOrderProduct(long o_order_num);
	int 			  givingGiftAction(Member member, Orderr orderr, OrderGift orderGift);
	Orderr 			  selectOrderr_GiftType(long o_order_num);
	OrderGift 		  selectOrderGift(long o_order_num);
	int 			  gettingGiftAction(Orderr orderr, OrderGift orderGift);
	long 			  selectTodayOrderr();
	int 			  orderUpload(Orderr orderr);
	int 			  givingGiftActionSuccess(KakaoPayApprovalVO ka);

}
