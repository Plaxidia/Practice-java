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
    PhoneClass(String receivecall)
    {
        System.out.println("incoming call :" +  receivecall);
        String Msg =null ;
        this.receivecall = receivecall;

        boolean callreceived = true;

        do {
        callreceived =true;
        System.out.println("call received !:" + name);

         }while (callreceived = false);

            System.out.println( "call missed!" + name);

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = " MRs ."+name;
    }
    public String getNumber () {
        return number;
    }

    public void setNumber(String name) {
        this.name = number;
    }
    @Override
    public  String toString()
    {
        return "[ NAME : " + name + " .  number# " + number + "]";
    }

    public String getReceivecall() {
        return receivecall;
    }

    public void setReceivecall(String receivecall) {
        this.receivecall = receivecall;
    }
}
