//Program to explain concept method overloading using parameters
class Program{
    private int a , b;
    public void setdata() //method overload
    {
        a = 10;
        b = 20;
    }
    public void setdata(int x,int y) //method overload
    {
        a=x;
        b=y;
    }
    public void showdata()
    {
        int ar;
        ar=a*b;
        System.out.println("Area="+ar);
    }
}
class overloading
{
    public static void main(String args[])
    {
        Program p1=new Program();
        Program p2=new Program();
        Program p3=new Program();
        p1.setdata();
        p2.setdata(20,40);
        p3.setdata(30,40);
        p1.showdata();
        p2.showdata();
        p3.showdata();
    }
}