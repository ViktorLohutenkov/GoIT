import java.util.Arrays;

class HarekCity {

    public char[][] createKeyboard() {

        return ;
    }


    public static void main(String[] args) {
        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));

        }
    }
}