package org.plaxidia;

public class PhoneClass {
    private String  number ;
    public String model;
    public String weight ;
    private String  receivecall;
    private String name ;
    PhoneClass()
    {

        System.out.println("NEW PHONE CREATED");
    }

     public PhoneClass(String n, String iphone, String grams)
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
        String Msg = " ";
        this.receivecall = receivecall;

        boolean callreceived = true;

        do {
        callreceived =true;
        System.out.println(Msg+"call received !:" + "name"+null);

         }while (callreceived = false);

            System.out.println( Msg+ "call missed!" + "name "+null);

    }

   /*
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
*/
    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = " MRs ."+name;
    }
    public String getNumber () {
        return number;
    }

    public void setNumber(String Number) {
        this.number = Number;
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

    public static void main(String[] args) {

        PhoneClass acc1 = new PhoneClass();
        acc1.setNumber(  "0308395034");
        acc1.setName("kaylee nelie ");
        acc1.setReceivecall(" nelie");
        System.out.println(acc1.getReceivecall());
        System.out.println("callreceived:" + acc1.getReceivecall());
        System.out.println(acc1.getName());
        System.out.println("number:" + acc1.getNumber());

    }
}





