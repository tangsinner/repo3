package cn.ty.service.impl;

import cn.ty.dao.AccountDao;
import cn.ty.domain.Account;
import cn.ty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;
    public List<Account> findAll() {
        return dao.findAll();
    }

    public void insert(Account account) {

    }
}
