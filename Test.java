class Data
{
    private int a;
    public void setdata(int a)
    {
        this.a = a;
    }
    public void showdata()
    {
        System.out.println("a="+a);
    }
}
class Test
{
    public static void main(String args[])
    {
        Data d1=new Data();
        d1.setdata(2);
        d1.showdata();
    }
}