package edu.uaslp.library.service;

import edu.uaslp.library.model.User;

import javax.swing.undo.UndoableEditSupport;
import java.util.HashMap;

public class UserAdmin {
    //<tipoClave, tipoDato>
    private HashMap<String, User> usuarios = new HashMap<>();

    public UserAdmin()
    {
        usuarios.put("1253", createUser("1253", "Juan"));
        usuarios.put("1478", createUser("1478", "Manuela"));
        usuarios.put("1895", createUser("1895", "Vero"));
        usuarios.put("8529", createUser("8529", "Pedrito"));
    }

    private User createUser(String code, String name)
    {
        User usuario = new User();

        usuario.setName(name);
        usuario.setCode(code);
        return usuario;
    }

    public User dameUserByCode(String code)
    {
        return usuarios.get(code);
    }
}
