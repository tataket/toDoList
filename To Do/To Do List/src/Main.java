import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Scanner scnTxt = new Scanner(System.in);
    static String[] tasks = new String[]{"Aniversario Mae","Correr"};
    static String[] deletedTasks = new String[0];
    static int choice = 1;
    static int menuChoice = 1;
    static String text;

    public static void main(String[] args) {

        while (menuChoice != 0) {
            System.out.println("Welcome To Do list!");
            System.out.println(" 1- Show Tasks\n 2- Create Tasks\n 3- Completed Tasks\n 4- Remove Completed Tasks\n " +
                    "5- Edit Tasks\n 6- Delete Tasks\n 7- Organize A-Z\n 0- Exit ");
            System.out.print("->");
            menuChoice = scan.nextInt();

            switch (menuChoice) {
                case 0:
                    System.out.println("BYEEEEEEEEEEEEEEE!!!!!!!!!");
                    break;
                case 1:
                    showTasks();
                    break;
                case 2:
                    createTasks();
                    break;
                case 3:
                    completeTasks();
                    break;
                case 4:
                    removeCompletedTasks();
                    break;
                case 5:
                    editTasks();
                    break;
                case 6:
                    deleteTasks();
                    break;
                case 7:
                    organize();
                    break;
                default:
                    System.out.println("Cant read that input");
                    break;
            }
        }
    }

    public static void showTasks() {
        System.out.println("Ver tarefas.");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("Task " + (i + 1) + ":  " + tasks[i]);
        }
    }

    public static void createTasks() {
        String[] newTasks = Arrays.copyOf(tasks, tasks.length + 1);
        System.out.println("Criar tarefas.\n Qual tarefa deseja realizar?");
        String choiceTxt = scnTxt.nextLine();
        System.out.println("Task (" + choiceTxt + ") successful created!");
        newTasks[newTasks.length - 1] = choiceTxt;
        tasks = newTasks;
    }

    public static void completeTasks() {
        showTasks();
        System.out.println("Marcar como  concluido.\n Qual tarefa deseja marcar como concluida?");
        choice = scan.nextInt() - 1;
        tasks[choice] = tasks[choice] + "✅";
        System.out.println("Sua tarefa foi concluida com sucesso ✅");
    }

    public static void removeCompletedTasks() {
        showTasks();
        System.out.print("Qual tarefa deseja remover o concluido!\nTask Number:");
        choice = scan.nextInt();
        tasks[choice - 1] = tasks[choice - 1].replaceAll("✅", "");
        System.out.println("Concluido removido  com sucesso! ❌");
    }

    public static void editTasks() {
        showTasks();
        System.out.println("Editar tarefa.\n Qual tarefa deseja editar?");
        choice = scan.nextInt();
        if (tasks[choice - 1] != null) {
            System.out.print("Novo texto: ");
            text = scnTxt.nextLine();
            tasks[choice - 1] = text;
        }
    }

    public static void deleteTasks() {
        showTasks();
        System.out.println("Delete Tasks.\n Qual tarefa deseja deletar?");
        choice = scan.nextInt();

        for (int i = 0; i < tasks.length; i++) {
            
        }

    }

    public static void organize() {
       //Arrays.sort(tasks);
        showTasks();
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks.length - 1; j++) {
                if (tasks[j] != null && tasks[i] != null) {
                    String temp = tasks[j];
                    tasks[j] = tasks[i];
                    tasks[i] = temp;
                }
            }
        }
    }
}

