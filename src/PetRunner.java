public class PetRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(3);
        dog.setName("Барбос");
        dog.setTraining(true);

        Horse horse = new Horse();
        horse.setName("Лола");
        horse.setSpeed(60);

        Cat cat = new Cat();
        cat.setName("Маруся");
        cat.setStealth(false);

        Mouse mouse = new Mouse();
        mouse.setName("Микки");
        mouse.setStealth(true);

        Human human = new Human("Геннадий");

        Pet pets[] = new Pet[]{dog, horse, cat, mouse};
        for (Pet pet : pets){
            pet.voice();
        }
        dog.protection();
        horse.gallop();
        cat.hunt();
        mouse.hide();
        dog.eat(human);
    }
}
