package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly rwOnly = new RWOnly();
//      rwOnly.name = "newName";
//      System.out.println(rwOnly.name);

      //java: name has private access in com.driver.RWOnly

      rwOnly.setName("Sumit");

      System.out.println(rwOnly.getName());
  }
}