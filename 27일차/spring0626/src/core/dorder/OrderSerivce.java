package core.dorder;

public interface OrderSerivce {

	Order createOrder(Long memberId, String itemName, int itemPrice);
	
	
}
