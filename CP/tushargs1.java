public class tushargs1{
    class employee{
        private String name;
        employee(String name){
            this.name = name;
        }
        public String getName(){
            return name;

        }
    }

    class Department{
        private String name;
        Department(String name){
            this.name = name;
        }
        public String getName(){
            return name;

        }
    }

    public employee employed (String name){
        return new employee(name);
    }

    public Department department(String name){
        return new Department(name);
    }
    public void newStarter(String name, String department) {
        employee emp = employed(name);
        Department dpt = department(department);
        System.out.println(emp.getName() +","+dpt.getName());
    }
    public static void main(String[] args) {
        tushargs1 c = new tushargs1();
        c.newStarter("AAA","BBB");
        tushargs1.employee ce = c.employed("CCC");
        tushargs1.Department cd = c.department("DDD");
    }
}



