class Data
{
private int a; //instance variable 
public void setdata(int a)     
{
    this.a=a;   //this.a refers instance variable
}
public void showdata()
{
    System.out.println("a="+a);
}
}
class Test4 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.setdata(5);
        d1.showdata();
    }
}
