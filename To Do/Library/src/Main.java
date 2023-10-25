import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to world of books...\n When I woke up this morning, I knew who I was, but I think I've changed many times since then.");
        System.out.println("Menu\n 1- Show Books\n 2- Login\n 3- Borrowed Books\n 4- Return Books\n0- Exit");
        String[] books = new String[20];
        String name;
        int age;
        int menuChoice = 0;

        while (menuChoice != 0)
            menuChoice = scan.nextInt();

        switch (menuChoice) {
            case 0:
                System.out.println("Happiness can be found even in the darkest of times, if one only remembers to turn on the light.");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Cant be read you request!!!!!");
                break;
        }



        System.out.println("livro" + books + "esta indisponivel");

    }

}