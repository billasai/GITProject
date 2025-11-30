public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        switch (2) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
        }
    }
}