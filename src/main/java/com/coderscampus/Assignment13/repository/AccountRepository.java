package com.coderscampus.Assignment13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.Assignment13.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
