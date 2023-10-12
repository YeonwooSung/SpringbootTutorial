package com.commercemarket.domain.wishlist.vo;

import com.commercemarket.controller.wishlist.dto.WishListResponseDto;
import com.commercemarket.domain.product.vo.Product;
import com.commercemarket.domain.user.vo.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @OneToOne
    private User user;

    public WishListResponseDto toWishlistResponseDto() {
        return WishListResponseDto.builder()
                .id(id)
                .productId(product.getId())
                .userId(user.getId())
                .build();
    }

    public long getUserId() {
        return user.getId();
    }
}
