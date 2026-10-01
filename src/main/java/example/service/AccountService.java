package example.service;

import example.model.Account;

public interface AccountService {

    void createPerson(Account account);

    Account getPerson(Long id);

    void deletePerson(Long id);
}