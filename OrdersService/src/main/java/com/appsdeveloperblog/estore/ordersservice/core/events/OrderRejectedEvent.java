package com.appsdeveloperblog.estore.ordersservice.core.events;

import com.appsdeveloperblog.estore.ordersservice.core.model.OrderStatus;

import lombok.Value;

@Value
public class OrderRejectedEvent {
    private final String orderId;
    private final String reason;
    private final OrderStatus orderStatus = OrderStatus.REJECTED;
}