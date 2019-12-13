package homework.hw12;


public class Main {
    public static void main(String[] args) throws Exception {
        Console console = new SystemConsole();
        Core app = new Core(console);
        app.run();
    }
}
