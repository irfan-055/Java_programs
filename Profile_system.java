class Student {
    private String name;
    private int rollno;
    private double percentage;

    public String getname() { return name; }
    public int getrollno() { return rollno; }
    public double getpercentage() { return percentage; }

    public void setname(String n) { this.name = n; }
    public void setrollno(int gn) { this.rollno = gn; }
    public void setpercentage(double gp) { this.percentage = gp; }
}


public class Profile_system {
    public static void main(String[] args) {
        Student s = new Student();
        s.setname("sanji");
        s.setrollno(1);
        s.setpercentage(90);
        System.out.println("Name: " + s.getname());
        System.out.println("Rollno: " + s.getrollno());
        System.out.println("Percentage: " + s.getpercentage());
    }
}
