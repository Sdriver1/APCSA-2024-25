public class DogTester {
    public static void main(String[] args) {
        Dog adoptable = new Dog();
        Dog knownDog = new Dog("Prince", "Emi", 3);

        System.out.println("Before Changes:");
        System.out.println("Default Dog (Adoptable):\n" + adoptable.toString() + "\n");
        System.out.println("Known Dog:\n" + knownDog.toString());

        adoptable.setName("Lacey");
        adoptable.setOwner("Crystal");

        int newAge = knownDog.getAge() + 1;
        knownDog.setAge(newAge);

        System.out.println("\nAfter Changes:");
        System.out.println("Default Dog (Adoptable):\n" + adoptable.toString() + "\n");
        System.out.println("Known Dog:\n" + knownDog.toString());
    }
}
