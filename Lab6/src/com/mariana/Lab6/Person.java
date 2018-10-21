package com.mariana.Lab6;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.*;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    int phone;

    public Person(String givenName,String middleName,String familyName){
        name= new FullName(givenName,middleName,familyName);
    }
    public Person(){

    }
}

