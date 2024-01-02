public class Wolf {
    private String name;
    private String male;
    private double age;
    private String color;
    private double weight;
    
    public String getName() {
        return name;
    }
    public String getMale() {
        return male;
    }
    public double getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setMale(String male) {
        this.male = male;
    }
    public void setAge(double age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void move() {
        System.out.println(name + " move");
    }
    public void run() {
        System.out.println(name + " run");
    }
    public void sit() {
        System.out.println(name + " sit");
    }
    public void howl() {
        System.out.println(name + " howl");
    }
    public void hunt() {
        System.out.println(name + " hunt");
    }
}
