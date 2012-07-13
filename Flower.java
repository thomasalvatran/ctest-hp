//http://www.functionx.com/java/Lesson05.htm
class Flower1 {
    String type;
    String color;
    String arrangement;
    double unitPrice;

    Flower1(String tp, String clr, String arng, double price){  //constructor with public or without are ok
        type = tp;
        color = clr;
        arrangement = arng;
        unitPrice = price; 
     }
//    void initializer(String tp, String clr, String arng, double price) {
//	type = tp;
//        color = clr;
//        arrangement = arng;
//        unitPrice = price; 
//    }
}

public class Flower {
    public static void main(String[] args) {
    	
//            Flower1 fl[] = new Flower1[4];
           
//            fl[0] = new Flower1("Rose","red","basket", 45.95D);
//            fl[1] = new Flower1("Lilis","purple","bouquet", 25.05);
//            fl[2] = new Flower1("Daisy","white","bouquet", 15.25D);
//            fl[3] = new Flower1("Tulip","orange","basket", 10.75D);
//            


//        System.out.println("Flower Type:  " +  flr.type);
//        System.out.println("Flower Color: " +  flr.color);
//        System.out.println("Arrangement:  " +  flr.arrangement);
//        System.out.printf("Price:        %.2f", flr.unitPrice);
//          System.out.println("Flower Type:  " +  fl[0].type);

          Flower1[] fl = { new Flower1("Rose","red","basket", 45.95D), new Flower1("Lilis","purple","bouquet", 25.05),
          			new Flower1("Daisy","white","bouquet", 15.25D), new Flower1("Tulip","orange","basket", 10.75D)
          		 };
          for (Flower1 a : fl)
           {
             System.out.println("\n Type: " + a.type + "\n Color: " + a.color +"\n Arrangement: " + a.arrangement + "\n Price: " + "$"+ a.unitPrice);
           }
    }
}
