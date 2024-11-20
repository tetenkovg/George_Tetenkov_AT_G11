package homework.day6;

public class GenericMethodsInGenericClassT <T>  {
    public void genericMethodOneGenArg(T arg) {
        System.out.println("I am an object of " + arg.getClass().getSimpleName() + " class");
    }

    public String genericMethodTwoGenArgs(T arg1, T arg2) {
        String result = "We are objects of " + arg1.getClass().getSimpleName() + " class and " + arg2.getClass().getSimpleName() + " class";
        System.out.println(result);
        return result;
    }

    public void genericMethodHalfGenArgs(T arg, String text){
        System.out.println("I got an object of " + arg.getClass().getSimpleName() + " and string with " + text.length() + " characters.");
    }}
