class Box1{
    public static void main(String args[]){
        Program1 b1,b2;
        b1 = new Program1();
        b2 = new Program1();
        b1.setdata();
        b2.setdata(30,20,14);
        b1.showdata();
        b2.showdata();
        b1.Volume();
        b2.Volume();
    }
}