class Data{
    private int L,B;
    static int count;
    Data()
    {
      L=3;
      B=5;
      count ++;
    }
    Data(int x, int y)
    {
      L=x;
      B=y;
    }
    public void showdata()
    {
      System.out.println("length  = "+L);
      System.out.println("Breadth = "+B);  
    }
    public void Area()
    {
      int A;
      A=L*B;
      System.out.println("Area of Box is :"+A);
    }
    public static void showcount(){
        System.out.println("Total Number of count : "+count);

    }
  }
  class Box_area{
    public static void main(String args[])
    {
        Data.showcount();
      Data d1=new Data();
      Data d2=new Data(8,6);
      d1.showdata();
      d1.Area();
    //  d1.showdata();
      d2.showdata();
      d2.Area();
      Data.showcount();
    }
  }
  