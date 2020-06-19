public final class Dog extends Pet{
    private boolean training;

    public Dog(){
        super ("Собака");
    }

    public void setTraining(boolean training){
        this.training = training;
    }
    public boolean getTraining(){
        return this.training;
    }
    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " " + "говорит гав-гав");
    }

    public void protection(){
        if (this.training) {
            System.out.println(this.getType() + " " + this.getName() + " " + "охраняет");
        }
        else {
            System.out.println(this.getType() + " " + this.getName() + " " + "не охраняет");
        }
    }
}
