import java.time.LocalDate;
import java.time.LocalDateTime;

class Book
{
    private String author;
    private String isbn;
    private String title;
    private String editorial;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getEditorial() {
        return editorial;
    }
}

class User
{
    private String name;
    private String code;
    private String phone;
    private String email;
    private LocalDate registerDate;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getAddress() {
        return address;
    }
}

class Employee
{
    private String name;
    private String clave;

    public void setName(String name) {
        this.name = name;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getName() {
        return name;
    }

    public String getClave() {
        return clave;
    }
}

    class Prestamo
{
    private LocalDateTime dateHora;
    private User user;
    private Employee employee;
    private Book []books;

    public void setDateHora(LocalDateTime dateHora) {
        this.dateHora = dateHora;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public LocalDateTime getDateHora() {
        return dateHora;
    }

    public User getUser() {
        return user;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Book[] getBooks() {
        return books;
    }
}

class  UserAdmin
{
    public User dameUsuarioPorClave(String clave) {
        User usuario = new User();
        return usuario;
    }

}

class BookAdmin
{
    public Book dameLibroPorClave(String clave) {
        Book libro = new Book();
        return libro;
    }
}

class LoanAdmin
{
    public void registraPrestamo(Employee empleado,User usuario, Book[] libro) {}
}


public class Main {

    public static void main(String[] args) {}
}
