import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пароль:");
        String passwords = sc.nextLine();
        System.out.println("Вы ввели:" + passwords);
        int password_length = passwords.length();
        System.out.println("Количество символов:" + password_length);
        int i = 0;
        boolean value = false;
        for (i = 0; i < password_length; i++) {
            char symbol = passwords.charAt(i);

            if (Character.isDigit(symbol)) {
                value = true;
            } 
        }
        if (value == true) {
            System.out.println("В пароле есть цифра.");
        } else {
            System.out.println("В пароле нет цифры.");
        }
    }
}