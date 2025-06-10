public class Company {
    private String name;

    Company(String name) {
        this.name = name;
    }

    public void printDepartamentInfo(Departament dept, Employee emp) {
        System.out.println("Company " + name + " , Departament : " + dept.getName());
        System.out.println("Company " + name + " , Employee : " + emp.getName());
    }

    static class Departament {
        private String name;

        Departament(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Employee {
        private String name;

        Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private class HRTool {
            
        }

        public void printDepartamentInfo(Departament dept, Employee emp) {
            System.out.println("Company " + name + " , Departament : " + dept.getName());
            System.out.println("Company " + name + " , Employee : " + emp.getName());
        }
    }
}
