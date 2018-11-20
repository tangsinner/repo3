package cn.ty.service;

import cn.ty.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void insert(Account account);

}
