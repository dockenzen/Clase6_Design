package com.example.alumno.telefono;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View v ;
    TextView txNom;
    TextView txAp;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.v = itemView;
        this.txAp = (TextView)this.v.findViewById(R.id.apellidoLbl);
        this.txNom = (TextView)this.v.findViewById(R.id.nombreLbl);
    }
}
