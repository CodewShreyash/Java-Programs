//Program to demonstrate constructor overloading using parameters
class Data{
    private int a,b;
    Data()
    {
        a=10;
        b=20;
    }
    Data(int x,int y) //Constructor Overloades
    {
        a=x;
        b=y;
    }
    public void area()
    {
        int ar;
        ar = a*b;
        System.out.println("area= "+ar);
    }
}
class Program
{
    public static void main(String args[])
    {
        Data d1 =new Data();
        Data d2=new Data(5,6);
        d1.area();
        d2.area();
    }
}
