public class LocalVariable {
    public void display() {
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        LocalVariable lv = new LocalVariable();
        lv.display();
    }
}