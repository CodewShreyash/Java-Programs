//write a java program to implement concept of method overriding
class Program {
    protected int a;           //access specifier 
    public void setdata(int x){  //method 
        a=x;
    }
    public void cal(){          //method
        int sq;
        sq=a*a;
        System.out.println("Square="+sq);
    }
}
class XProgram extends Program{  
        public void cal(){        //same method as superclass method 
        int c;
        c=a*a*a;
        System.out.println("Cube="+c);
    }
}
class Overriding{
    public static void main(String args[])
    {
        XProgram d1=new XProgram();
        d1.setdata(9);
        d1.cal();
    }
}