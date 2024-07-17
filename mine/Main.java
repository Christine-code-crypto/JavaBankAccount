package mine;

class Outer{
    int x = 5;

    class Inner{
        int y = 10;
    }
}

public class Main{
    public static void main(String[] args) {
        //accessing outer class
        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();

        System.out.println(myOuter.x);
        System.out.println(myInner.y);

    }

    
}