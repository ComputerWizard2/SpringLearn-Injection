package com.luckye;

import lombok.Setter;

@Setter
public class UserService {
            private  UserDao userDao;

            public void updateService(){
                userDao.updateUser();
            }


   }
