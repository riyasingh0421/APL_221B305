class Whiskey{
    private void Pour(){
        System.out.println("pour 60ml of Whiskey in glass");
    }
    private void addCondiments(){
        System.out.println("Add 15ml blackberry syrup, 15ml lemon juice and garnish with mint");
    }
    private void stir(){
        System.out.println("stir for 10sec");
    }
    private void serve(){
        System.out.println("serve through waiter");
    }
    public void templateMethod(){
        Pour();
        addCondiments();
        stir();
        serve();
    }
}