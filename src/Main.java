public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Михаил", "Лермонтов");
        Book one = new Book("Герой нашего времени", bookOne, 2022);
        Author bookTwo = new Author("Оскар", "Уайльд");
        Book two = new Book("Портрет Дориана Грея", bookTwo, 2018);
        System.out.println("Название книги: " + one.getBookName() + ", автор: " + bookOne.getName() + " " + bookOne.getSurname()+ ", год издания " + one.getPublicationYear());
        System.out.println();
        System.out.println("Название книги: " + two.getBookName() + ", автор: " + bookTwo.getName() + " " + bookTwo.getSurname()+ ", год издания " + two.getPublicationYear());
        two.setPublicationYear(2021);
        System.out.println("Новый год издания " + two.getPublicationYear());
    }
}