# books-api-without-frontend
📚 Book API

Prosty projekt REST API napisany w Spring Boot, umożliwiający zarządzanie książkami (dodawanie, pobieranie i usuwanie).
Projekt wykorzystuje Spring Data JPA oraz bazę danych H2 (in-memory).

⚙️ Technologie

Java 17+
Spring Boot
Spring Web
Spring Data JPA
H2 Database (domyślnie w pamięci)

🧩 Struktura projektu
src/main/java/com/example/demo/
│
├── Book.java              # Encja reprezentująca książkę
├── BookRepo.java          # Repozytorium JPA (interfejs)
├── BookService.java       # Logika biznesowa (dodawanie, usuwanie, pobieranie)
└── BookController.java    # REST API – obsługa żądań HTTP

🧠 Opis działania
| Metoda   | Endpoint      | Opis                            | Przykład użycia                        |
| -------- | ------------- | ------------------------------- | -------------------------------------- |
| `GET`    | `/books`      | Zwraca listę wszystkich książek | `GET http://localhost:8080/books`      |
| `POST`   | `/books`      | Dodaje nową książkę             | `POST http://localhost:8080/books`     |
| `DELETE` | `/books/{id}` | Usuwa książkę o danym ID        | `DELETE http://localhost:8080/books/1` |
