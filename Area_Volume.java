class Rect{
    private int L, B ;
    static int count;
    Rect(){
        L = 10;
        B = 5 ;
        count++;
    }
    Rect(int x, int y){
        L = x ;
        B = y ;
        count++;
    }
    public void showdata(){
        System.out.println("Length = "+L);
        System.out.println("Breadth = "+B);
    }
    public void Area(){
        int ar = L * B ;
        System.out.println("Area = "+ar);
    }
    public static void showcount(){
        System.out.println("Total number of Count ="+count+"\n");
    }
}
class Box{
    private int L, B, H ;
    static int count;
    Box(){
        L = 3;
        B = 4;
        H = 6;
        count++;
    }
    Box(int x, int y, int z){
        L = x ;
        B = y ;
        H = z ;
        count++;
    }
    public void showdata(){
        System.out.println("Length = "+L);
        System.out.println("Breadth = "+B);
        System.out.println("Height  = "+H);
    }
    public void volume(){
        int val = L * B * H ;
        System.out.println("Volume = "+ val);
    }
    public static void showcount(){
        System.out.println("Total number of Count ="+count+"\n");
    }
}
class Area_Volume{
    public static void main(String[] args) {
        Rect.showcount();
        Rect r1 = new Rect();
        // Rect r3 = new Rect();
        Rect r2 = new Rect(3,5);
        Rect r3 = new Rect(3,6);
        r1.showdata();
        r1.Area();
        Rect.showcount();
        r2.showdata();
        r2.Area();
        Rect.showcount();
        r3.showdata();
        r3.Area();
        Rect.showcount();
        Box b1 = new Box();
        Box b2 = new Box(3,5,6);
        b1.showdata();
        b1.volume();
        Rect.showcount();
        b2.showdata();
        b2.volume();
        Rect.showcount();
    }
}