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
class q4{
    public static void main(String args[]){
        One obj1 = new One(1);
        System.out.println("Value of obj1: " + obj1.x);
        
        Two obj2 = new Two(2);
        System.out.println("Value of obj2: " + obj2.x);
    }
}
