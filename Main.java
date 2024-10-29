public class Main {
    int instance_var =10;
    static int static_var = 5;

    public static void main(String[] args) {
        int local_var=50;

        Main m= new Main();
        Main m1= new Main();

        System.out.println(local_var);
        System.out.println(m.instance_var);
        System.out.println(m1.instance_var);
        System.out.println(static_var);

    }
}