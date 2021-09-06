package edu.uaslp.library.model;

import edu.uaslp.library.model.Book;
import edu.uaslp.library.model.User;

import java.time.LocalDateTime;

public class Prestamo
{
    private LocalDateTime dateHora;
    private User user;
    private Employee employee;
    private Book[]books;

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

    public LocalDateTime getDateHour() {
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
