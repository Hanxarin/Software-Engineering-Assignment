package com.LeonAndJacob.app;

public class Account
{
    private int accountNumber;

    private String accountName;

    private long accountBalance;

    public boolean adjustBalance(long amount)
    {
        boolean outcome;

        long new_balance = this.accountBalance + amount;

        if(new_balance>=0)
        {
            this.set_Account_Balance(new_balance);

            outcome= true;
        }
        else
        {
            outcome= false;
        }

        return outcome;
    }

    public Account(int account_Number,String Name,long initialBalance)
    {
        this.accountNumber = account_Number;

        this.accountName = Name;

        this.accountBalance= initialBalance;

    }

    /*

    public void set_Account_Number(int account_Number_in)
    {
        this.accountNumber=account_Number_in;
    }

    public void  set_Account_Name(String account_Name_in)
    {
        this.accountName=account_Name_in;
    }

    */
    public  void set_Account_Balance(long account_Balance_in)
    {
        this.accountBalance=account_Balance_in;
    }

    public int get_Account_Number()
    {
        return this.accountNumber;
    }


    public String get_Account_Name()
    {
        return this.accountName;
    }

    public  long get_Account_Balance()
    {
        return this.accountBalance;
    }


}
