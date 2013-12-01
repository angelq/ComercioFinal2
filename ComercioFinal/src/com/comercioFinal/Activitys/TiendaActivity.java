package com.comercioFinal.Activitys;

import android.app.Activity;
import android.app.ActionBar;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class TiendaActivity extends Activity implements OnClickListener, ActionBar.OnNavigationListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tienda);
		
		Button btn_contactar = (Button) findViewById(R.id.tienda_btn_contactar);
		btn_contactar.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.tienda, menu);
		return true;
	}

	//prueba si tenemas mas de un action bar
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		
        case R.id.action_settings:
            Log.i("ActionBar", "default!");;         
            return true;
            
        case R.id.menu_llamar:
            Log.i("ActionBar", "Llamar!");
            //prueba, despues hay q obtener el numero de la base de datos
            Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                    Uri.parse("tel:+3748593458")); //
            startActivity(i);;
            return true;
            
        case R.id.menu_mensaje:
            Log.i("ActionBar", "mensaje!");;
            return true;
            
        case R.id.menu_favorito:
            Log.i("ActionBar", "favoritos!");;
            return true;
            
        default:
            return super.onOptionsItemSelected(item);
		}
    
	}
	
	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tienda_btn_contactar:
			 Log.i("ActionBar", "Llamar!");
	            //prueba, despues hay q obtener el numero de la base de datos
	            Intent i = new Intent(android.content.Intent.ACTION_DIAL,
	                    Uri.parse("tel:+3748593458")); //
	            startActivity(i);;
			
			break;

		default:
			break;
		}
	}

	



	
}
