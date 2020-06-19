public abstract class Pet {
    private int age = 0;
    private String name = "Безымянный";
    private double weight;
    private final String type;

    public Pet(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
    public String getType(){
        return this.type;
    }

    public abstract void voice();

    public int beOlder() {
        return age++;
    }

    public int beOlderByParametr(int a) {
        this.age = this.age + a;
        return this.age;
    }

    public void eat(Human human){
        human.feed(this);
    }
}