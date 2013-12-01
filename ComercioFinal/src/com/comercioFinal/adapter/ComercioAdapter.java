package com.comercioFinal.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.comercioFinal.dominio.Comercio;
import com.comercioFinal.Activitys.R;

public class ComercioAdapter extends ArrayAdapter<Comercio>{
	
	Activity activity;
	
	public ComercioAdapter(Context tiendasFragment, List<Comercio> comercios) {
		super(tiendasFragment, R.layout.item_lista_tienda, comercios);
		
		this.activity = (Activity) tiendasFragment;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View view = inflater.inflate(R.layout.item_lista_tienda, null);
		
		//falta cambiar datos
		Comercio comercio = getItem(position);
		
		TextView txt1 = (TextView) view.findViewById(R.id.lista_nombre);
		txt1.setText(comercio.getNombre());
		
		TextView txt2 = (TextView) view.findViewById(R.id.lista_descripcion);
		txt2.setText(comercio.getDescripcion());
		
		// TODO Auto-generated method stub
		//return super.getView(position, convertView, parent);
		return view;
	}

}
