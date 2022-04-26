package com.Fwsa;

public class userInfo {

    public static void main(String args[]) {
        Encapsulation myObj = new Encapsulation();

        myObj.setUsername("Chithu");
        myObj.setUserid(12345);
        myObj.setmail("chithu123@gmail.com");
        myObj.setPassword("1wdsrfr");

        System.out.println("Username : " + myObj.getUsername());
        System.out.println("Userid : " + myObj.getUserid());
        System.out.println("Usermail : " + myObj.getmail());
        System.out.println("Password : " + myObj.getPassword());

    }
}
