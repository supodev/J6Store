package com.vvt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvt.entity.Account;
import com.vvt.entity.Authority;

public interface AuthorityDAO extends JpaRepository<Authority, Integer>{
	@Query("select DISTINCT a from Authority a WHERE a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

}