package animals;

public class Horse extends Animals{
    private String color;

    public Horse(String nickName, int age, double weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                '}';
    }
}
