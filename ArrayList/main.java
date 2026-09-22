package estudo.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.addToBack(3);

        arr.addToBack(4);

        arr.addToBack(5);

        arr.addToFront(2);

        arr.addToFront(1);

        arr.addToFront(0);

        arr.addToBack(6);

        arr.addToBack(7);

        arr.addToBack(8);

        arr.addToBack(9);
        arr.addToBack(10);

        for (int i = arr.size(); i > 0; i--) {

            arr.removeFromBack();
        }

        // arr.removeFromBack();
        // arr.removeFromFront();

        arr.addToBack(33);

        arr.addToFront(32);

        arr.removeFromFront();
        arr.addToFront(null);

    }
}
