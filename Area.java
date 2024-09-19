class Rect{
    private int L , B, H;
    Rect(){
        L = 10;
        B = 20;
    }
    Rect(int x,int y){
        L = x ;
        B = y ;
    }
    public void showdata(){
        System.out.println("Length ="+L);
        System.out.println("Breadth ="+B);
        System.out.println("Height = "+ H);
    }
    public void Area(){
        int ar = L * B;
        int val = L * B * H;
        System.out.println("Area ="+ar);
        System.out.println("Volume ="+val+"\n");
    }
    Rect(int x,int y,int z){
        System.out.println("Constructor Called for Box Volume...");
        L = x;
        B = y;
        H = z;
    }
}
class Area{
    public static void main(String args[]){
        Rect r1 = new Rect();
        Rect r2 = new Rect(2,3);
        Rect r3 = new Rect(2,3,4);
        r1.showdata();
        r1.Area();
        r2.showdata();
        r2.Area();
        r3.showdata();
        r3.Area();

    }
}