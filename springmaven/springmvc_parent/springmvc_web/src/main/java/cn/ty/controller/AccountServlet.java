package cn.ty.controller;

import cn.ty.domain.Account;
import cn.ty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountServlet {

    @Autowired
    private AccountService service;
    @RequestMapping("findall")
    public String findAll(Model model){
        List<Account> all = service.findAll();
        model.addAttribute("accounts",all);
        return "list";
    }
}
