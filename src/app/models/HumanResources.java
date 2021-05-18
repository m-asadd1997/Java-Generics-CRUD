package app.models;

public class HumanResources extends Employee {

    String position;
    Integer avgNoOfCandidatesHiredPerMonth;
    String socialEngagement;

    public HumanResources(String position, Integer avgNoOfCandidatesHiredPerMonth, String socialEngagement) {
        this.position = position;
        this.avgNoOfCandidatesHiredPerMonth = avgNoOfCandidatesHiredPerMonth;
        this.socialEngagement = socialEngagement;
    }

    public HumanResources(int id, String name, int age, String position, Integer avgNoOfCandidatesHiredPerMonth, String socialEngagement) {
        super(id, name, age);
        this.position = position;
        this.avgNoOfCandidatesHiredPerMonth = avgNoOfCandidatesHiredPerMonth;
        this.socialEngagement = socialEngagement;
    }

    @Override
    public String toString() {
        return "HumanResources = {" +
                "id='" + getId() + '\''+
                ", name='" + getName() + '\''+
                ", age='" + getAge() + '\''+
                ", position='" + position + '\'' +
                ", avgNoOfCandidatesHiredPerMonth=" + avgNoOfCandidatesHiredPerMonth +
                ", socialEngagement='" + socialEngagement + '\'' +
                '}';
    }
}
