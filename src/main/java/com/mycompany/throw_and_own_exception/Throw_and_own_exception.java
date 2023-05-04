/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.throw_and_own_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melek
 */
public class Throw_and_own_exception {

    public static void main(String[] args) {
        
        AccountManager manager=new AccountManager();
        System.out.println("Hesap: " +manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap: " +manager.getBalance());
        try{

            manager.withdraw(90);

        }catch(Exception exception){
           System.out.println(exception.getMessage()); 

        } 

        try{

            manager.withdraw(20);

        }catch(Exception exception){
            System.out.println(exception.getMessage()); 

        } 
        
        
        
        
    }
}
