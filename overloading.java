class Book {
    String BKname;
    String autname;
    int price;

    Book(String BK, String aut, int pr) {
        BKname = BK;
        autname = aut;
        price = pr;
    }

    void display() {
        System.out.println("The name of the book is " + BKname);
        System.out.println("The author of this book is " + autname);
        System.out.println("The price of this book is " + price);
    }

    public static void main(String args[]) {
        Book obj = new Book("IT TOOLS", "BY MEDHA SINGH",156);
        System.out.println("The details of the book 1 is :");
        obj.display();
        Book obj1 = new Book("Expertise in java", "By: Herbert Schildt", 890);
        System.out.println("The details of the book 2:");
        obj1.display();
        Book obj2 = new Book("java computer Scientist", "By rekha madhvan", 678);
        System.out.println("The details of the book 2 is :");
        obj2.display();
    }
}


