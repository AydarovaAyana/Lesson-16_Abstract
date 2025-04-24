package animals;

public abstract class Animals {
    private String nickName;
    private int age;
    private double weight;
    private String gender;

    public Animals(String nickName, int age, double weight, String gender) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
