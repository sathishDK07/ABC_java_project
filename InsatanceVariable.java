class InstanceVariable {
    private String name;

    public InstanceVariable(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Instance Variable: " + name);
    }

    public static void main(String[] args) {
        InstanceVariable iv1 = new InstanceVariable("Renny");
        InstanceVariable iv2 = new InstanceVariable("Peter");
        iv1.display();
        iv2.display();
    }
}