package domain;

public class GeoInfo {
    private String type; //тип места
    private String coordinates; //координаты места
    private PlaceInfo placeInfo; // описание места (если оно добавлено)

    private class PlaceInfo {
        private int id; //идентификатор места
        private String title; //название места
        private int latitude; //географическая широта, заданная в градусах (от -90 до 90)
        private int longitude; //географическая широта, заданная в градусах (от -90 до 90)
        private int created; //дата создания места в Unixtime
        private String icon; //иконка места, URL изображения
        private int checkinsInfo; //число отметок в этом месте
        private int updated; //дата обновления места в Unixtime
        private int type; //тип места
        private int country; //идентификатор страны
        private int city; //идентификатор города
        private String address; //адрес места

        //get+set для всех полей

    }
}
