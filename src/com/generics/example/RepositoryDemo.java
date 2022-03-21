package com.generics.example;

import java.util.Date;

public class RepositoryDemo {

    public static void main(String[] args) {

        User user=new User();
        user.setId(1L);
        user.setName("John Nash");

        UserRepository userRepo=new UserRepository();
        userRepo.save(user);


        Account account =new Account();
        account.setAcoountNumber(15648964223L);
        account.setBalance(50000.0);
        AccountRespository accountRepo=new AccountRespository();
        accountRepo.save(account);



        Transaction transaction =new Transaction();
        transaction.setAccount(account);
        transaction.setDate(new Date());

        TransactionRepository transactionRepo=new TransactionRepository();
        transactionRepo.save(transaction);


        // TODO Auto-generated method stub

    }

}