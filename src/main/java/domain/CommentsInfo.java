package domain;

public class CommentsInfo {
    private int count; //количество комментариев
    private int canPost; //информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    private int groupsCanPost; //информация о том, могут ли сообщества комментировать запись
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи

    //get+set для всех полей

}
