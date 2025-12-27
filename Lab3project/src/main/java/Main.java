public class Main {
    public static void main(String[] args){
        ServiceCenter sc1 = new ServiceCenter("СТО-1", "Грузовик ГАЗ", "Капитальный", "2025-12-01", "2025-12-10", "Успешно", "Изотов", 160000);

        ServiceCenter sc2 = new ServiceCenter("СТО-2", "Легковой ВАЗ",  "Текущий",  "2025-12-15", "2025-12-20", "Успешно", "Соломонов", 3000);
        GroupServiceCenter group = new GroupServiceCenter();
        group.setUniqueNumber(12);
        group.addCenter(sc1);
        group.addCenter(sc2);

        group.sortByRepairCost();
        System.out.println(group);
    }


}
