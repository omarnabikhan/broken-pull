public class HelloWorld {
    public static String getGreeting() {
        return "Hello";
    }
    public static String getPlace() {
        return "World";
    }
    public static String getPunctuation() {
        return ".";
    }

    public static void main(String[] unused) {
        String greeting = getGreeting();
        String place = getPlace();
        String punctuation = getPunctuation();

        String sentence = greeting + " " + place + punctuation;

        System.out.println(sentence);
    }
}
