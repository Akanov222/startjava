public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Wolf");
        wolf.setMale("male");
        wolf.setAge(2.3);
        wolf.setColor("gray");
        wolf.setWeight(50.2);
        System.out.println("Wolf name - " + wolf.getName());
        System.out.println("Wolf gender - " + wolf.getMale());
        System.out.println("Wolf age - " + wolf.getAge());
        System.out.println("Wolf color - " + wolf.getColor());
        System.out.println("Wolf weight - " + wolf.getWeight());
        wolf.move();
        wolf.run();
        wolf.sit();
        wolf.howl();
        wolf.hunt();
    }
}
