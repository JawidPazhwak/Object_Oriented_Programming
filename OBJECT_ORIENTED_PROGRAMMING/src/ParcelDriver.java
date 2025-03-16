public class ParcelDriver {
    public static void main(String[] args){
       Parcel p1 = new Parcel();
       p1.printDetails();
       p1.name = "Spongebob";
       p1.printDetails();
       System.out.println("1**************");
       Parcel p2 = new Parcel("Bob the Builder");
       p2.weight = 15; 
       p2.calcFee("Usa");
       p2.printDetails();
       System.out.println("2**************");
       p2.addWeight(25);
       p2.calcFee("Africa");        
  p2.printDetails();
       System.out.println("3**************");
       Parcel p3 = new Parcel("Europe", 10);
       p3.addWeight(15);
       p3.calcFee("Asia");
       p3.printDetails();
    }
 }
 
 