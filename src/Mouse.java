public class Mouse extends Pet{

    private boolean stealth;

    public Mouse(){
        super("Мышь");
    }

    public void setStealth(boolean stealth){
        this.stealth = stealth;
    }
    public boolean getStealth(){
        return this.stealth;
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " " + "говорит пи-пи-пи");
    }

    public void hide(){
        if (stealth) {
            System.out.println(this.getType() + " " + this.getName()+ " " + "спряталась");
        }
        else {
            System.out.println(this.getType() + " " + this.getName()+ " " + "не спряталась");
        }
    }
}
