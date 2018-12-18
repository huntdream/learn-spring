package info.maoyu.server;

public class Hello {
    private final String name;
    private final int age;

    public Hello(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
