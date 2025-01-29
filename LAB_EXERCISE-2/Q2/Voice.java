public class Voice{
    public void templateMethod(){
        prepareVoice();
        hear();
    }
    protected abstract void prepareVoice();
    private void hear(Animal[] animal){
        for(int i=0;i<5;i++){
            animal[i].makeVoice();
        }
    }
    protected Animal[] animal;
}




