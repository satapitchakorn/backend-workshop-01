public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        String result = hw.sayHi();
        System.out.println(result);
    }

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
    }
}
