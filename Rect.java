class Rect1 {
    private int L , B;
    public void setdata()
    {
        L=10;
        B=15;
}
    public void setdata(int x,int y)
    {
        L=x;
        B=y;
    }
    public void showdata()
    {
        System.out.println("L= "+L);
        System.out.println("B= "+B);
    }
    public void area(){
    int area= L*B;
    System.out.println("Area="+area);
    }
}
class Rect
{
    public static void main(String[] args) {
         Rect1 r1=new Rect1();
         Rect1 r2=new Rect1();

         r1.setdata();
         r2.setdata(3,4);
         r1.showdata();
         r2.showdata();
         r1.area();
         r2.area();

    }
}