package homework.day6;

public class GenericMethodsInGenericClassTwoParams <X, Y> {

    public String genericMethodGenArgs(X arg1) {
        String result = "I received 1 argument of type: " + arg1.getClass().getSimpleName() + " class";
        System.out.println(result);
        return result;
    }

    public String genericMethodGenArgs(X arg1, Y arg2) {
        String result = "I received 2 arguments of type: " + arg1.getClass().getSimpleName() + " class, " + arg2.getClass().getSimpleName() + " class";
        System.out.println(result);
        return result;
    }

    public void genericMethodHalfGenArgs(X arg1, String text) {
        System.out.println("I got an object of " + arg1.getClass().getSimpleName() + " class and string with " + text.length() + " characters.");
    }

    public void genericMethodHalfGenArgs(X arg1, Y arg2, String text) {
        System.out.println("I got an object of "+ arg1.getClass().getSimpleName()+ " class and " + arg2.getClass().getSimpleName() + " class and string with " + text.length() + " characters.");
    }

}
