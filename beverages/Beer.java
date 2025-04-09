/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Beer{
    private void Pour(){
        System.out.println("pour 100ml of beer in glass");
    }
    private void addCondiments(){
        System.out.println("Add some ice");
    }
    private void serve(){
        System.out.println("serve through waiter");
    }
    public void templateMethod(){
        Pour();
        addCondiments();
        serve();
    }
}