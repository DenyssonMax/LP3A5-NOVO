package desafioGlidedRose.src;

public class programa {

    public static void main(String... args) {
        System.out.println("OMGHAI2!");

        item[] items;
        items = new item[]{
                new item("+5 Dexterity Vest",
                        10,
                        20),
                new item("Aged Brie", 2, 0),
                new item("Elixir of the Mongoose", 5, 7),
                new item("Sulfuras, Hand of Ragnaros", 0, 80),
                new item("Sulfuras, Hand of Ragnaros", -1, 80),
                new item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new item("Conjured Mana Cake", 3, 6)};

        desafioGlidedRose app = new desafioGlidedRose (items);

        for (int i = 0; i < 31; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (int j = 0; j < items.length; j++) {
                System.out.println(items[j]);
            }
            System.out.println("");
            app.updateQuality();
        }
    }
}