package com.casestudy.socialnetwork.model.services.impl;

import com.casestudy.socialnetwork.model.entities.Account;
import com.casestudy.socialnetwork.model.repositories.AccountRepository;
import com.casestudy.socialnetwork.model.services.I_SERVICES.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findById(int id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepository.deleteById(id);
    }
}
