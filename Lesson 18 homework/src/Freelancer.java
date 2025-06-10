public class Freelancer extends Employee {
    private int finalisedProjects;
    private double projectRate;

    Freelancer(String name,int finalisedProjects, double projectRate) {
        super(name);
        this.finalisedProjects = finalisedProjects;
        this.projectRate = projectRate;
    }


    @Override
    public double calculateSalary() {
        return projectRate * finalisedProjects;
    }
}
