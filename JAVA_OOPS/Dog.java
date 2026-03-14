package JAVA_OOPS;

public class Dog {
    String name;
    String breed;
    int age;
    String Color;

    public Dog(String name , String breed, int age , String Color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.Color = Color;

    }
    public String getName(){ return name; }
    public String getBreed(){ return breed; }
    public int getAge(){ return age; }
    public String getColor(){ return Color; }
    
    @Override
    public String toString(){
        return "Name is: " +name
                + "\nBreed age and color are: " + breed + " "
                + age + " " + Color;
    }
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "Green");
        System.out.println(tuffy);
    }
}
