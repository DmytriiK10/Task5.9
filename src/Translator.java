import java.util.Scanner;
public class Translator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть слово про погоду ");
        String weather = scan.next();

        switch (weather) {
            case "Дощ":
                System.out.println("Rain ");
                break;
            case "Сніг":
                System.out.println("Snow ");
                break;
            case "Сонячно":
                System.out.println("Sunny ");
                break;
            case "Туман":
                System.out.println("Fog ");
                break;
            case "Град":
                System.out.println("Hail ");
                break;
            case "Гроза":
                System.out.println("Thunderstorm ");
                break;
            case "Ожеледиця":
                System.out.println("Ice - crusted ground ");
                break;
            case "Повінь ":
                System.out.println("Flood ");
                break;
            case "Торнадо":
                System.out.println("Tornado ");
                break;
            case "Засуха":
                System.out.println("Drought ");
                break;
            case "Вулкан":
                System.out.println("Volcano ");
                break;
            default: System.out.println("Такого слова немає ");

        }

        }

    }

