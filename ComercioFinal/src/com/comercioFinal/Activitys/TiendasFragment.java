package com.comercioFinal.Activitys;

import java.util.ArrayList;

import com.comercioFinal.adapter.ComercioAdapter;
import com.comercioFinal.dominio.Comercio;

import android.content.Intent;
//import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//cambiar despues a listfragmnent
import android.support.v4.app.ListFragment;
import android.widget.ListView;

public class TiendasFragment extends ListFragment {
	
	ArrayList<Comercio> tiendas;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_tiendas, container, false);
	
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//BASE DE DATOS CREO USAR simplecursoradapter
		tiendas = new ArrayList<Comercio>();
		
		tiendas.add(new Comercio("angel", "este es un mensaje"));
		tiendas.add(new Comercio("exequiel", "mensaje nro 2"));
		
		ComercioAdapter adapter = new ComercioAdapter(getActivity(), tiendas);
		setListAdapter(adapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		if(position == 1){
			Intent intent = new Intent(getActivity().getApplicationContext(), TiendaActivity.class);
			startActivity(intent);
		}
		
		/*
		for (int i = 0; i < tiendas.size(); i++) {
			tiendas.get(i);
			
			
		}*/
		
	}


	
}
