class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Buku \"" + book.getTitle() + "\" berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas perpustakaan penuh.");
        }
    }

    public void removeBookByTitle(String title) {
        System.out.println("Menghapus buku dengan judul: " + title + " (logika lengkap di nomor 2).");
    }

    public void borrowBook(String title) {
        System.out.println("Meminjam buku dengan judul: " + title + " (logika lengkap di nomor 3).");
    }

    public void returnBook(String title) {
        System.out.println("Mengembalikan buku dengan judul: " + title + " (logika lengkap di nomor 3).");
    }
}
