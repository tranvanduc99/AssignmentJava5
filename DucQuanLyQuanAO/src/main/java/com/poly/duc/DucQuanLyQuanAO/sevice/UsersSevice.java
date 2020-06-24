package com.poly.duc.DucQuanLyQuanAO.sevice;

import com.poly.duc.DucQuanLyQuanAO.model.Users;

import java.util.List;

public interface UsersSevice {
    List<Users> findAllUsers();
    Users findUsersById(Integer Id);
    void saveUsers(Users users);
    void deleteUsers(Integer Id);
}
