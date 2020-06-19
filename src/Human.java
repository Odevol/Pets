public class Human {
    String name;

    public Human(String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    public void feed(Pet pet){
        System.out.println(this.getName() + " " + "покормил" + " " + pet.getType() + " " + pet.getName());
    }
}
