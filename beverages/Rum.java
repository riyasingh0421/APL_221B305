class Rum{
    private void Pour(){
        System.out.println("pour 60ml of rum in glass");
    }
    private void addCondiments(){
        System.out.println("Add 40ml orange+lime juice and ice");
    }
    private void stir(){
        System.out.println("stir for 5sec");
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