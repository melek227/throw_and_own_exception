/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.throw_and_own_exception;


//bir bankacılık uygulamasında yetersiz bakiye hatası gibi kendi hatamızı oluşturmak isteyelim
//kendi exceptionumuzu yazmak için class tanımlarız

public class BalanceInSufficentException extends Exception {  //tüm exception çeşitleri bir exception classından inherit edilmeli
  
    public String getMessage(){
       return super.getMessage();
}
    
    String message;
    public BalanceInSufficentException(String message){
     this.message=message;
 
    }
    
    
}

