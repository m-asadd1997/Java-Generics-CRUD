package app.models;

public class Developer extends Employee {

    String techStack;
    String position;
    Boolean isWfh;

    public Developer(String techStack, String position, Boolean isWfh) {
        this.techStack = techStack;
        this.position = position;
        this.isWfh = isWfh;
    }

    public Developer(int id, String name, int age, String techStack, String position, Boolean isWfh) {
        super(id, name, age);
        this.techStack = techStack;
        this.position = position;
        this.isWfh = isWfh;
    }

    @Override
    public String toString() {
        return "Developer = {" +
                "id='" + getId() + '\''+
                ", name='" + getName() + '\''+
                ", age='" + getAge() + '\''+
                ", techStack='" + techStack + '\'' +
                ", position='" + position + '\'' +
                ", isWfh=" + isWfh +
                '}';
    }
}
