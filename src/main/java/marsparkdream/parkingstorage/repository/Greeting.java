package marsparkdream.parkingstorage.repository;

public class Greeting {

    private String name;

    public Greeting() {

    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name) {
        return "hello" + name;
    }

    public static String sayHi(String name) {
        return "Hi~ " + name;
    }

    public String getName() {
        return name;
    }
}
