class Shreyash{
    private int a,b;
    public void setdata(){
        a = 10;
        b = 20;
    }
    public void setdata(int x,int y){
        a = x;
        b = y;
    }
    public void showdata(){
        System.out.println("Value of a = "+ a);
        System.out.println("Value of b = "+ b);
    }
    public void Area(){
        int ar;
        ar = a * b;
        System.out.println("Area of Rectangle is :" +ar);

    }
}
   public class Class{
        public static void main(String args[]){
    Shreyash r1,r2 ;
    r1 = new Shreyash();
    r2 = new Shreyash();
    r1.setdata();
    r2.setdata(20,30);
    r1.showdata();
    r2.showdata();
    r1.Area();
    r2.Area();
    }
}