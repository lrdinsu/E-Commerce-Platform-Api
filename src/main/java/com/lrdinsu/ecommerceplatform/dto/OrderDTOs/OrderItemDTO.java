package com.lrdinsu.ecommerceplatform.dto.OrderDTOs;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long productId;
    private String productName;
    private Integer quantity;
    private Long price;
}
