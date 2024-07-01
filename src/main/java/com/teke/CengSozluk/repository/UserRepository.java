package com.teke.CengSozluk.repository;

import com.teke.CengSozluk.model.User;

public interface UserRepository {

    User findByUsername(String username);

}
