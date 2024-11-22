package christmas.domain.event;

import christmas.domain.order.Orders;
import christmas.dto.PromotionDto;

import java.util.Optional;

public interface PromotionEvent extends Event {
	//TODO : 어떠한 주문에 대하여 프로모션 상품을 제공해야함
	Optional<PromotionDto> applyPromotion(Orders orders);
}