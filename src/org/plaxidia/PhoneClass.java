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
    PhoneClass(String receivecall )
    {
        System.out.println("incoming call :" +  receivecall);
        String Msg =null ;

        boolean callreceived = false;
        do {

            callreceived = false;

            System.out.println( "call missed!" + name);
        }

        while (callreceived==true);
        //callreceived =true;
        System.out.println("call received !:"+ name);
    }
    public void setName( String name)
    {
        this.name = "Mrs ." + name;
    }
    public String getname()
    {
        return name;
    }
    public void setnumber( String number)
    {
        this.number = number;
    }
    public String getnumber()
    {
        return number;
    }

}
