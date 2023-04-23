import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MessageHandler {
    public static void arrayEnteredData(String[] userData) {
        int count = 0;
        if (userData.length != 6) {
            System.out.println("Вы ввели больше или меньше данных чем требуется, повторите попытку");
            count++;
        } else {
            if (!userData[0].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена фамилия, повторите попытку");
                count++;
            }
            if (!userData[1].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введено имя, повторите попытку");
                count++;
            }
            if (!userData[2].matches("[а-яА-Яa-zA-Z]+")) {
                System.out.println("Неверно введена отчество, повторите попытку");
                count++;
            }
            DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
            try {
                df.parse(userData[3]);
            } catch (ParseException e) {
                System.out.println("Неверный формат даты, повторите попытку");
                count++;
            }
            try {
                Long.parseLong(userData[4]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат телефона, повторите попытку");
                count++;
            }
            if (!userData[5].equalsIgnoreCase("f") && !userData[5].equalsIgnoreCase("m")) {
                System.out.println("Неверно введен пол, повторите попытку");
                count++;
            }
        }
        if (count == 0) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < userData.length; i++) {
                if (i == userData.length - 1) {
                    text.append(userData[i]);
                } else {
                    text.append(userData[i]).append(" ");
                }
            }
            CreatingFile.creatingFile(text.toString(), userData[0]);
        }
    }
}
