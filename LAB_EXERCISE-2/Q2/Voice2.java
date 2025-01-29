public class Voice2 extends Voice {
    @Override
    protected void prepareVoice() {
        Animal[] animal =new Animal[5];
        animal[0] = new Cow();
        animal[1] = new Tiger();
        animal[2] = new Pig();
        animal[3] = new Goat();
        animal[4] = new Lion();
    }
}