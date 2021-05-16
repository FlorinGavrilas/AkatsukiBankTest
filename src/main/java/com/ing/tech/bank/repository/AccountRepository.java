package com.ing.tech.bank.repository;

import com.ing.tech.bank.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAccountByUsername(String username);
    Optional<Account> findAccountByIban(String iban);
}
