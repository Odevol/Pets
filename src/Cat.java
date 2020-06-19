public class Cat extends Pet{
    private boolean stealth;

    public Cat(){
        super("Кошка");
    }

    public void setStealth(boolean stealth){
        this.stealth = stealth;
    }
    public boolean getStealth(){
        return this.stealth;
    }

    public void hunt(){
        if (stealth) {
            System.out.println(this.getType() + " " + this.getName()+ " " + "охотится");
        }
        else {
            System.out.println(this.getType() + " " + this.getName()+ " " + "не охотится");
        }
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " " + "говорит мяу-мяу");
    }
}
