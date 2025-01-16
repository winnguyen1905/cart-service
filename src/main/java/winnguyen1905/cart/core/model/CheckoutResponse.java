package winnguyen1905.cart.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import winnguyen1905.cart.core.model.response.CartResponse;
import winnguyen1905.cart.core.model.response.PriceStatisticsResponse;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record CheckoutResponse(
    PriceStatisticsResponse priceStatistics,
    List<CheckoutItem> checkoutItems
) implements AbstractModel {

    public record CheckoutItem(
        CartResponse cart,
        Set<UUID> discountIds,
        UUID bestDiscountId,
        PriceStatisticsResponse priceStatistics
    ) implements AbstractModel {
    }
}

