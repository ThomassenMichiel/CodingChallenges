package codingbat.logic1;

public class DateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5,10));
        System.out.println(dateFashion(5,2));
        System.out.println(dateFashion(5,5));
    }

    public static int dateFashion(int you, int date) {
        int tableChance = 1;

        if (date >= 8 || you >= 8) {
            tableChance = 2;
        }

        if (date <= 2 || you <= 2) {
            tableChance = 0;
        }

        return tableChance;
    }
}
