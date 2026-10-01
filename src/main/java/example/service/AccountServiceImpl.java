package example.service;

import example.model.Account;
import example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void createPerson(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Account getPerson(Long id) {
        return accountRepository.get(id);
    }

    @Override
    public void deletePerson(Long id) {
        accountRepository.delete(id);
    }
}