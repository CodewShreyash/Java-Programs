class Data{
    private int a,b;
    Data(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void showdata(){ 
        System.out.println("a = "+a);
        System.out.println("b = "+b);
     }
}
class shreya{
    public static void main(String[] args) {
        Data d1 = new Data(4, 5);
        d1.showdata();
    }
}