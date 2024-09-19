class Program1{
    private int L,B,H;
    public void setdata(){
        L = 5;
        B = 6;
        H = 7;
    }
    public void setdata(int x, int y,int z){
        L = x;
        B = y;
        H = z;
    }
    public void showdata(){
        System.out.println("length  of Box :  "+ L);    
        System.out.println("Breadth of Box : "+B);    
        System.out.println("Height  of Box : "+H);    
        }
    public void Volume(){
        int val;
         val = L * B * H;
        System.out.println("Volume of Box is = "+ val);
        
    }
}