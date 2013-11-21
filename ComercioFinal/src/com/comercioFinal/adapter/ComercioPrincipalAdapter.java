package com.comercioFinal.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.comercioFinal.Activitys.R;
import com.comercioFinal.dominio.Comercio;

public class ComercioPrincipalAdapter extends ArrayAdapter<Comercio> {
	Activity activity;
	
	public ComercioPrincipalAdapter(Context context, List<Comercio> comercios) {
		super(context, R.layout.item_seccion_tienda, comercios);
		
		this.activity = (Activity) context;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View view = inflater.inflate(R.layout.item_seccion_tienda, null);
		
		//falta cambiar datos
		Comercio comercio = getItem(position);
		
		TextView txt3 = (TextView) view.findViewById(R.id.txtSeccionTiendas);
		txt3.setText(comercio.getSeccion());
		
		TextView txt1 = (TextView) view.findViewById(R.id.txtSeccionTiendaNombre);
		txt1.setText(comercio.getNombre());
		
		TextView txt2 = (TextView) view.findViewById(R.id.txtSeccionTiendaDescripcion);
		txt2.setText(comercio.getDescripcion());		
		// TODO Auto-generated method stub
		//return super.getView(position, convertView, parent);
		return view;
	}

}
