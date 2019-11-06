package com.uc.dei.is.Assignment2.business.controller;

import com.uc.dei.is.Assignment2.business.manager.DataTransactionManager;
import com.uc.dei.is.Assignment2.business.manager.EncryptionManager;
import com.uc.dei.is.Assignment2.business.manager.Filter;
import com.uc.dei.is.Assignment2.data.models.Item;
import com.uc.dei.is.Assignment2.data.models.User;

import java.util.List;

public class OperationsController {

    public static int login(String email, String password){
        User user = DataTransactionManager.getUser(email);
        if (user != null) {
            if (EncryptionManager.decprypt(user.getDk(), user.getPassword()).equals(password))
                return user.getId();
        }
        return 0;
    }

    public static int home(String name, String email, String password, String country){
        return DataTransactionManager.addUser(name, email, password, country);
    }

    public static String getUserName(String userEmail){
        return DataTransactionManager.getUser(userEmail).getName();
    }

    public static int register(String name, String email,String password,String country){
        return DataTransactionManager.addUser(name, email, password, country);
    }

    public static List<Item> getItemsByCategory(String category){
        return DataTransactionManager.getItemsByFilter(new Filter(null, category, null, null, null, 0, 0));
    }
}