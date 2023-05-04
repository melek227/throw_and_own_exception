/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.throw_and_own_exception;




//karşı taraf ne hata almışsa ona göre aksiyon alması için hata fırlatılır
//bankacılık uygulamasında kişinin hesabını yönetmeye yönelik class tanımlıyoruz
//hesabımızda 90 lira varken 100 lira çekmeye çalışırsak hata verecek

public class AccountManager{
    
     private double balance; //kişinin hesabındaki para miktarını tutan değişken
    
    public void deposit(double amount){ //yatırmak istediği miktarı parametre alan para yatırma classı tanımladık
        balance=getBalance()+amount;


    }

    public void withdraw(double amount) throws BalanceInSufficentException, Exception{ //çekmek istediğimiz miktarı parametre olarak alan hesaptan para çekme classı tanımladık
        //kendi oluşturduğumuz hatayı fırlattık
        if(balance>=amount){ //hesabındaki miktar eksi olmaması için
            balance=getBalance() + amount;
        }else{
            throw new Exception("bakiye yetersiz");
        }
        


    }

    public double getBalance(){ //hesaptaki parayı okumamızı sağlayan class
       return balance;
    }
    String message;
    public String getMessage(){
      return message;
    }
    
    
    
}
