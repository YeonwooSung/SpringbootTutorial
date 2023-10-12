package com.commercemarket.domain.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.commercemarket.domain.user.vo.QUser;

import javax.persistence.EntityManager;

public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public UserRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public boolean isAlreadyExistUser(String username) {
        Integer fetchOne = queryFactory
                .selectOne()
                .from(QUser.user)
                .where(QUser.user.username.eq(username))
                .fetchFirst();

        return fetchOne != null;
    }
}
