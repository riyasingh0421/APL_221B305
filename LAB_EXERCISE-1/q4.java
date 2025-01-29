class One {
    int x;

    One(int x) {
        this.x = x;
    }
}
class Two extends One {
    Two(int x) {
        super(x); 
    }
}

public class q4 {
    public static void main(String[] args) {
        Two obj = new Two(10);
        System.out.println("Value of x: " + obj.x);
    }
}
