public class Horse extends Pet{
    private int speed;

    public Horse(){
        super("Лошадь");
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void gallop(){
        System.out.println(this.getType() + " " + this.getName() + " " + "скачет со скоростью " + this.speed + "км/ч");
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " " + "говорит и-го-го");

    }
}
