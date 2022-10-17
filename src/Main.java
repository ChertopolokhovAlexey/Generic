// https://github.com/ChertopolokhovAlexey/Generic.git
public class Main {
    public static final int SIZE = 6; // size of mass

    public static void main(String[] args) {

        System.out.println("Демонстрация работы без RuntimeException.");
        demo(SIZE + 1);
        System.out.println("Демонстрация работы c RuntimeException.");
        demo(SIZE - 2);
    }

    public static void demo(int size) {
        MagicBox<String> magicBoxItem = new MagicBox<>(SIZE);
        MagicBox<Integer> magicBoxNumber = new MagicBox<>(SIZE);

        for (int i = 0; i < size; i++) {
            System.out.println(magicBoxItem.add(("item " + i)));
            System.out.println(magicBoxNumber.add(i));
        }

        System.out.println(magicBoxItem.pick());
        System.out.println(magicBoxNumber.pick());
        System.out.println("================================");
    }
}
