package week_2;

import java.io.IOException;

public class _09_Exceptions_Playground {
    public static void main(String[] args) {
        try {
            // _09_Exceptions_PlaygroundKt._09_foo();
            _09_Exceptions_PlaygroundKt._09_bar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
