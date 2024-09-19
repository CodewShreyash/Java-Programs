class Rect{
    private int L,B;
    public void setdata()
    {
      L=10;
      B=20;
    }
    public void setdata(int x, int y)
    {
      L=x;
      B=y;
    }
    public void showdata()
    {
      System.out.println("Lenght of rect is :"+L);
      System.out.println("Breadth of rect is :"+B);
    }
    public void Area()
    {
      int ar;
      ar=L*B;
      System.out.println("Area of rect is :"+ar);
    }
  }
  