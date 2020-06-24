package com.poly.duc.DucQuanLyQuanAO.sevice;
import com.poly.duc.DucQuanLyQuanAO.model.Users;
import com.poly.duc.DucQuanLyQuanAO.reposeitory.UsersReponseitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersSeviceImpl implements UsersSevice{
    @Autowired
    UsersReponseitory usersReponseitory;

    @Override
    public List<Users> findAllUsers() {
        return (List<Users>) usersReponseitory.findAll();
    }

    @Override
    public Users findUsersById(Integer Id) {
        return usersReponseitory.findById(Id).get();
    }

    @Override
    public void saveUsers(Users users) {
    usersReponseitory.save(users);
    }

    @Override
    public void deleteUsers(Integer Id) {
    usersReponseitory.deleteById(Id);
    }
}
