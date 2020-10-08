package com.bsav157.aplicacioncontactos.vista.fragment;

import com.bsav157.aplicacioncontactos.adapter.ContactoAdaptador;
import com.bsav157.aplicacioncontactos.pojo.Contacto;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}
