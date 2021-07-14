package com.alexisraels;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        // Initialization is tedious without constructors
//        bobsAccount.setNumber("1234");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("(087) 123-4567");

        // Simpler with constructors
//        Account bobsAccount = new Account("1234", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getCustomerName());
//
//        Account defaultAccount = new Account();
//        System.out.println(defaultAccount.getNumber());
//        System.out.println(defaultAccount.getCustomerName());
//
//        Account customerAccount = new Account("Tim", "Tim@email.com", "12345");
//        System.out.println(customerAccount.getNumber());
//        System.out.println(customerAccount.getCustomerName());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);

        // Challenge:
        // Create a new class VipCustomer
        // it should have 3 fields: name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer steve = new VipCustomer();
        VipCustomer mark = new VipCustomer("Mark", "mark@email.com");
        VipCustomer bob = new VipCustomer("Bob", 2000.0, "bob@email.com");

        printFields(steve);
        printFields(mark);
        printFields(bob);
    }

    public static void printFields(VipCustomer customer) {
        System.out.println(customer.getName() + " " + customer.getEmailAddress() + " " + customer.getCreditLimit());
    }
}
