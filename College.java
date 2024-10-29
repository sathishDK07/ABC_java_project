class College {
    private String name;
    private String location;

    public College(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("College Name: " + name + ", Location: " + location);
    }

    public static void main(String[] args) {
        College college = new College("VTU", "Banglore");
        college.displayInfo();

        Student student1 = new Student("Motu", 20, "Computer Science");
        Student student2 = new Student("Patlu", 21, "Mechanical");
        Student student3 = new Student("Singam", 20, "ECE");

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}