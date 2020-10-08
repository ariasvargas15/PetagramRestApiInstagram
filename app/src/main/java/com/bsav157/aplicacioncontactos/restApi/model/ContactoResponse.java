package com.bsav157.aplicacioncontactos.restApi.model;

import com.bsav157.aplicacioncontactos.pojo.Contacto;

import java.util.ArrayList;

public class ContactoResponse {

    ArrayList<Contacto> contactos;

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }
}
