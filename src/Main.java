public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hi how are you");

        /* Java 17 w/ Gradle
         * Make intelliJ project
         * Initialize version control (top bar)
         * Commit ONLY the java file
         * Menu > Git > Github
         */
    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static void heatDeath() {
        for (int i = 0; i < 1000000; i++)
            for (int j = 0; j < 100000; j++)
                for (int k = 0; k < 100000; k++)
                    try {
                        Thread.sleep(1000000000);
                    } catch (Exception e) {
                        return;
                    }
    }
}