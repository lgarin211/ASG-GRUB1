class Member extends User {
    public Member(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void showMenu() {
        System.out.println("=== Menu Member ===");
        System.out.println("1. Lihat Buku Tersedia");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembalikan Buku");
    }

    @Override
    public void interactWithSystem(Library library) {
        System.out.println(name + " (Member) dapat meminjam dan mengembalikan buku.");
    }

    public void borrowBook(Library library, String title) {
        library.borrowBook(title);
    }

    public void returnBook(Library library, String title) {
        library.returnBook(title);
    }
}
