/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assessment_2;

import com.mycompany.assessment_2.dao.UserDao;
import com.mycompany.assessment_2.view.LoginJFrame;

/**
 *
 * @author wxh19
 */
public class App {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.initTable();
        new LoginJFrame();
    }
}
