package edu.uaslp.library;

import edu.uaslp.library.model.Book;
import edu.uaslp.library.model.Employee;
import edu.uaslp.library.model.Prestamo;
import edu.uaslp.library.model.User;
import edu.uaslp.library.service.UserAdmin;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main
{

    /*
    Métodos en STATIC son globales y se llaman "de clase"

     */
    public static void main(String[] args)
    {
        //SwingUtilities.invokeLater(() -> new AppWindow().show());

        Employee employee1 = new Employee();

        employee1.setName("Ivan");
        employee1.setClave("123456");

        Book harryPotter1 = new Book();

        harryPotter1.setTitle("HP y la priedra filosofal");

        Book harryPotter2 = new Book();

        harryPotter2.setTitle("HP y la camara de los secretos ");

        Book harryPotter3 = new Book();

        harryPotter3.setTitle("HP y  el prisionero");

        /*User usuario = new User();

        usuario.setName("Jorge");
        usuario.setCode("56789");
        usuario.setAddress("Un address");
        usuario.setRegisterDate(LocalDate.now().minusWeeks(5));
        */

        UserAdmin userAdmin = new UserAdmin();
        User usuario = userAdmin.dameUserByCode("1253");


        Prestamo loan1 = new Prestamo();
        Book[] books = new Book[5];

        loan1.setDateHora(LocalDateTime.now());
        loan1.setUser(usuario);
        loan1.setEmployee(employee1);

        books[0] = harryPotter1;
        books[1] = harryPotter2;
        books[2] = harryPotter3;

        loan1.setBooks(books);

        imprimePrestamo(loan1);
    }

    public static void imprimePrestamo(Prestamo loan1)
    {

        System.out.println("Prestamo de " + loan1.getDateHour());
        System.out.println("Usuario: "+ loan1.getUser().getName());
        System.out.println("Empleado: " + loan1.getEmployee().getName());

        Book[] libros = loan1.getBooks();

        //ForEach es un for dedicado para recorrer una lista de elementos, sin embargo tiene sus excepciones para usarse
        for (Book libro : libros) {
            if (libro != null) //Evita que haya error al recorrer el arreglo.
            {
                System.out.println(libro.getTitle());
            }
        }
    }

}