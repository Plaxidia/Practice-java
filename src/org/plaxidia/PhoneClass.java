package org.plaxidia;

public class PhoneClass {
    private String  number ;
    private String model;
    private String weight ;
    private String  receivecall;
    private String name ;
    PhoneClass()
    {

        System.out.println("NEW PHONE CREATED");
    }

    PhoneClass(String  n,String iphone ,String grams  )
    {
        number =n;
        model = iphone ;
        weight =grams;
        System.out.println("NEW NUMBER :" + n);
        System.out.println(" Model :" + iphone );
        System.out.println("weight :" + grams );

    }

}
