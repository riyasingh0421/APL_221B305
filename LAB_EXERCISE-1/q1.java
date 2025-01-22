class Mother {
    int x;
    void show() {
        System.out.println("Show method of Mother class");
    }
}

class Child extends Mother {
}

class q1 {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
    }
}
