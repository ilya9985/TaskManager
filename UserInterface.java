package taskmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Ilya
 */
public class UserInterface implements TaskInterface {

    @Override
    public void createTask(String name, String description, Date date, String number) {

    }

    @Override
    public void deleteTask(TaskNode object) {

    }

    @Override
    public void exit() throws IOException {

    }

    public void View(/*TaskLog[] tasks, int size*/) throws IOException, ParseException, ClassNotFoundException {
        System.out.println("TASKMANAGER 1.0");
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int choice = -1;
        while (!exit) {
            System.out.println("1-Новое событие;");
            System.out.println("2-Просмотр всех событий;"); // будет выводится снизу
            System.out.println("3-Ближайщее событие;"); // быдет выводится сверху
            System.out.println("4-Редактировать событие;");
            System.out.println("5-Удалить событие;");

            System.out.println("0-Закрыто менеджер задач.");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    String taskName;
                    String taskDescription;
                    Date taskDate;
                    String phoneNumber;
                    System.out.println(" | NEW TASK   ");

                    System.out.print(" | Событие: ");
                    taskName = in.nextLine(); // надо

                    System.out.print(" | Описание: ");
                    taskDescription = in.nextLine(); // надо

                    System.out.print(" | Дата: ");
                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    taskDate = sdf.parse(br.readLine());

                    System.out.print(" | Контакт:");
                    phoneNumber = in.nextLine();

                    TaskLog tmp = new TaskLog();
                    tmp.createTask(taskName, taskDescription, taskDate, phoneNumber);
                    //в файл записать
                    tmp.exit();
                    break;
                }
                case 2: {
                        TaskLog t = new TaskLog(); // ?
                        System.out.println(" | ALL YOUR TASKS:"); // output
                        System.out.println(" | Событие:" + ";");
                        System.out.println(" | Описание: " + ";");
                        System.out.println(" | Дата" + ";");
                        System.out.println(" | Контанты:" + ";");
                        break;
                        // output
                    }
                case 3:{
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {

                }

            }
        }
    }
}
