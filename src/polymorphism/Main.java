package polymorphism;

public class Main {
    public static void main(String[] args) {
    
        Me who = new Me();
        //Set Value
      who.setName("Mücahit Gökçe");
       who.setAge(23);
       who.setUrlPng("resim.jpg");
       who.setHight(78.6);
       who.setWeight(77.6);
       who.setFootSize(41.5);
       who.setIslam(true);

        Me who1 = new Me();
        //Set Value1
        who1.setName("Yasin Gökçe");
       who1.setAge(21);
       who1.setUrlPng("image.jpg");
       who1.setHight(78.6);
       who1.setWeight(77.6);
       who1.setFootSize(41.5);
       who1.setIslam(true);
    
        Me who2 = new Me();
        //Set Value2
        who2.setName("Java BootCamp");
        who2.setAge(23);
        who2.setUrlPng("java.jpg");
        who2.setHight(78.6);
        who2.setWeight(77.6);
        who2.setFootSize(41.5);
        who2.setIslam(true);

        Me [] yours = {who,who1,who2};
        for (Me me : yours) {
            System.out.println(me.getName());
    
        }
        IndividualCustomer bireysel = new IndividualCustomer();
        bireysel.setId(01);
        bireysel.setPhone("05350865244");
        bireysel.setCustemerNumber("0123456789");
        bireysel.setFirstName("Mücahit");
        bireysel.setLastName("GÖKÇE");  
        
        CorporateCustomer kurumsal = new CorporateCustomer();
        kurumsal.setId(02);
        kurumsal.setPhone("05356822447");
        kurumsal.setCustemerNumber("9876543210");
        kurumsal.setVergiId("0000");
        kurumsal.setFirmaAd("justmucahid");

        CustomerInheritance [] musteri ={bireysel,kurumsal};
        for (CustomerInheritance customerInheritance : musteri) {
            System.out.println(customerInheritance.getPhone());
        }

    
    }
    
}
