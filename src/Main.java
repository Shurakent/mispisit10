import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        AdministrativeEmployee admin = new AdministrativeEmployee(1, "Крыловецкий Александр Абрамович", "admin@vsu.ru");

        Faculty fkn = new Faculty(admin, "ФКН");


        List<Institute> institutes = new ArrayList<>();
        institutes.add(new Institute("ИТУ", "404"));
        institutes.add(new Institute("ОВП", "10 корпус"));


        // Сотрудники кафедры ТОиЗИ
        ResearchAssociate korotkov = new ResearchAssociate(2, "Коротков Владислав Владимирович", "korotkov@vsu.ru", "быть молодцом");
        Lecturer sapr = new Lecturer(3, "Сарпронов геннадий иванович", "sapr@vsu.ru", "лектор лекторов");
        // Курсы
        Course course1 = new Course("Основы военной подготовки", 101, 32);

        // Проекты
        Project project1 = new Project("Автоматизация процесса составления инвестиционного портфеля на основе многокритериальной оптимизации", null, null);

        // Вывод информации

        System.out.println("Административные сотрудники:");
        System.out.println(admin.getName() + "\n");

        System.out.println("Кафедры на факультете\"" + fkn.getName() + "\":");
        for (Institute institute : institutes) {
            System.out.println("- " + institute.getName());
        }
        System.out.println();

        System.out.println("Подробная информация о сотрудниках кафедры ОВП:");
        System.out.println(sapr.getName());
        System.out.println();

        System.out.println("Проекты сотрудников кафедры ИТУ:");
        System.out.println(korotkov.getName() + " участвует в проектах:");
        System.out.println("- " + project1.getName() + "\n");

        System.out.println("Курсы, которые ведет лектор\"" + sapr.getName() + "\":");
        System.out.println("- " + course1.getName());
    }
}
