package com.vvt.service;

import java.util.List;

import com.vvt.entity.Authority;

public interface AuthorityService {

	List<Authority> findAuthoritiesOfAdministrators();

	List<Authority> findAll();

	Authority create(Authority authority);

	void delete(Integer id);

}
