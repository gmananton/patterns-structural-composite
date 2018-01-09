import items.*;

import java.util.Arrays;

/**
 * Created by Anton Mikhaylov on 09.01.2018.
 */
public class Main {


    // Заказ может содержать любую вложенность канцтоваров:
    //  - просто товары прямо в корне заказа,
    //  - товары внутри коробок,
    //  - коробки внутри коробок
    // и т.д.

    static Box order = new Box();

    public static void main(String[] args) {
        createOrder();
        // Получаем суммарную стоимость заказа через общий интерфейс
        System.out.println("Total order price is " + order.getPrice());
    }

    public static void createOrder() {

        // Создадим 3 коробки с каждым из типов товаров
        Box boxOfPens = new Box(
                Arrays.asList(
                        new Pen(10),
                        new Pen(11),
                        new Pen(12)));

        Box boxOfPencils = new Box(
                Arrays.asList(
                        new Pencil(20),
                        new Pencil(21),
                        new Pencil(22)));

        Box boxOfPaper = new Box(
                Arrays.asList(
                        new Paperlist(30),
                        new Paperlist(31),
                        new Paperlist(32)));

        // А также пару одиночных товаров, которые положим прямо в корень заказа
        Stepler stepler = new Stepler(50);
        StickerPack stickerPack = new StickerPack(15);


        order.add(boxOfPens, boxOfPencils, boxOfPaper, stepler, stickerPack);

    }
}
