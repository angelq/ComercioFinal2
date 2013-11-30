package com.comercioFinal.Activitys;

import java.util.ArrayList;

import com.comercioFinal.adapter.ComercioAdapter;
import com.comercioFinal.adapter.ComercioPrincipalAdapter;
import com.comercioFinal.dominio.Comercio;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ImageButton;

public class PrincipalFragment extends ListFragment implements OnClickListener{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		return inflater.inflate(R.layout.fragment_principal, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ArrayList<Comercio> tiendas = new ArrayList<Comercio>();
		
		tiendas.add(new Comercio("angel", "Seccion1" , "argtend"));
		tiendas.add(new Comercio("exequiel", "Seccion2" , "slogan"));
		
		ComercioPrincipalAdapter adapter = new ComercioPrincipalAdapter(getActivity(), tiendas);
		setListAdapter(adapter);
		
		
		
	}

	@Override
	public void onClick(View v) {
		
		
	}
	
	

}
