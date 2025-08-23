package com.harshal.user;
import com.harshal.bank.Bankservices;


public class UserService {
    public static void main(String[] args) {
        Bankservices Bank = new Bankservices();

        Bank.setBankname("State Bank Of India");
        System.out.println("Bank Name : " + Bank.getBankname());

    }
}
