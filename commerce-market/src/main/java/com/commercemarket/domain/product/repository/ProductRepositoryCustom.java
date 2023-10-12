package com.commercemarket.domain.product.repository;

import com.commercemarket.domain.product.vo.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;
import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> findByKeyword(String keyword, Pageable pageable);
    long countSearchProductByKeyword(String keyword);
}
