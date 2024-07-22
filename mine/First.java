package mine;

/**
 * Animal
 */
public interface First {
    public void firstMetho();

}

interface Second {
    public void secondMetho();  
}

class demo implements First,Second{
    public void firstMetho(){
        System.out.println("This is the first method");
    }

    public void secondMetho(){
        System.out.println("This is the second method");
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.firstMetho();
        obj.secondMetho();
    }
}