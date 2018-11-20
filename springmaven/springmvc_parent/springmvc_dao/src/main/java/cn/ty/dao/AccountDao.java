package cn.ty.dao;

import cn.ty.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
    void insert(Account account);
}
