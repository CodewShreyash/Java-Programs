class Data{
    private int a,b; //data member
    {
    a=1;
    b=1;
    }
    public void showdata() //method
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class Program3{
    public static void main(String args[]) 
        {
            Data d1;        //object declard
            d1=new Data();  //object declared
            d1.showdata();
    }
}