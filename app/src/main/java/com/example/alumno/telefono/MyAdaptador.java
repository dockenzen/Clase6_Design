package com.example.alumno.telefono;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by eldockenzen on 27/04/2017.
 */

//va a adaptar un tipo viewHolder que es la vista.. pero queremos que sea el item creamos nosotros
public class MyAdaptador extends RecyclerView.Adapter<MyViewHolder>
{
    private List<Persona> listaPrivada;
/*
    se toma el xml y lo va a crear como un objeto de tipo viewholder que tengo que crear yo
*/

    public MyAdaptador(List<Persona> lista)
    {
        this.listaPrivada = lista;
    }

    //Crea los elementos
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //EL INFLATE TRANSFROMA EL XML DEL LAYOUT EN UN OBJETO DE TIPO VIEW
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder m = new MyViewHolder(v);
        Log.d("MVH","1 ON CREATE VIEW HOLDER");
        return m;
    }

    // llena el objeto creado con la info que corresponde
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona per = listaPrivada.get(position);
        holder.txAp.setText(per.getApellido());
        holder.txNom.setText(per.getNombre());
        Log.d("MVH","2 ON BIND VIEW HOLDER");
    }
    //donde debemos hacer los findviewid
    //devuelve la cantidad de items que va a dibujar en pantalla

    @Override
    public int getItemCount() {
        Log.d("MVH","3 GETINT");

        return this.listaPrivada.size();
    }
}
