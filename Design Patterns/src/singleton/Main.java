package singleton;

public class Main {
    public static void main(String[] args) {

        // Illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();

    }
}
