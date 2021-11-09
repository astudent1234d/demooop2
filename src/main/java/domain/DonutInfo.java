package domain;

public class DonutInfo {
    private boolean isDonut; //запись доступна только платным подписчикам VK Donut
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private PlaceholderInfo placeholderInfo; //заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode; //информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    //all — всю информацию о VK Donut.
    //duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.

    private class PlaceholderInfo {
        private boolean plug; //определение покупки
    }

    //get+set для всех полей
}
