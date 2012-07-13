//http://www.javatutorialhub.com/java-arrays.html
class Account{
  int a;
  int b;
 public void setData(int c,int d){
   a=c;
   b=d;
    }
// Account(int a, int b) { a = 0; b= 0;}

 
 public void showData(){
   System.out.println("Value of a ="+a);
   System.out.println("Value of b ="+b);
 }
}

class ObjectArray{
   public static void main(String args[]){
     Account obj[] = new Account[2];
     obj[0] = new Account();  //????without this error NullPointerException javavids video array index and instantiate the array
     obj[1] = new Account();
    obj[0].setData(1,2);
    obj[1].setData(3,4);                                                                                                                              
    System.out.println("For Array Element 0");
    obj[0].showData();
    System.out.println("For Array Element 1");
     obj[1].showData();
  }
}

