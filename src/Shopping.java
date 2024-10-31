import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();     //создаем динамический массив *2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует список покупок!");

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            // System.out.println("4. Завершить программу");

            int actionNumber = scanner.nextInt();   //считываем команду пользователя
            scanner.nextLine();     //отступ

            switch (actionNumber) {

                case 1:
                    System.out.println("Введите название товара: ");
                    String productName = scanner.nextLine();    //считываем название
                    if(!shoppingList.contains(productName.toLowerCase()) ) {   // если ввод не совпадает с элементов в массиве
                        shoppingList.add(productName.toLowerCase());  //добавляем значение введенное пользователем в массив
                        System.out.println("Товар " + productName + " успешно добавлен!");
                    } else {    //если ввод совпадает с элементом в массиве *1
                        System.out.println("Товар " + productName + " уже имеется в списке!");
                    }
                    break;

                case 2:
                    if (shoppingList.isEmpty()) {    //если список пуст выводим оповещение об этом
                        System.out.println("В списке нет товаров!");
                    } else {    //иначе отображаем список
                        System.out.println("Ваш список товаров: ");
                        for (int i = 0; i < shoppingList.size(); i++) {     //проходим по массиву для вывода элементов
                            System.out.println((i + 1) + ". " + shoppingList.get(i));   //выводим нумерацию и элементы
                        }
                    }
                    break;

                case 3:
                    shoppingList.clear();   //удаляем элементы из массива
                    System.out.println("Ваш список товаров успешно очищен!");
                    break;

                case 4:
                    System.out.println("До скорых встреч!");
                    break;

                default:
                    System.out.println("Неизвестная команда!");
                    break;
            }
        }
    }
}



