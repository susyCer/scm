package com.cervantes.susy.appresidencia;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.cervantes.susy.appresidencia.fragments.ElectrodosFragment;
import com.cervantes.susy.appresidencia.fragments.EstadosFragment;
import com.cervantes.susy.appresidencia.fragments.TelemetriaFragment;
import com.cervantes.susy.appresidencia.fragments.VariablesFragment;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Fragment telemetriaFragment = new TelemetriaFragment();
        final Fragment electrodosFragment = new ElectrodosFragment();
        final Fragment estadosFragment = new EstadosFragment();
        final Fragment variablesFragment = new VariablesFragment();

        if (savedInstanceState == null)

        {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainer, telemetriaFragment).commit();
        }

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentManager fragmentManager = getSupportFragmentManager();

                if (item.getItemId() == R.id.telemtriaItem) {//nombre de menu navigation el de abajo es el fragment que se manda a traer
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, telemetriaFragment).commit();

                } else if (item.getItemId() == R.id.electrodosItem) {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, electrodosFragment).commit();


                } else if (item.getItemId() == R.id.variablesItem) {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, variablesFragment).commit();

                } else if (item.getItemId() == R.id.estadosItem) {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, estadosFragment).commit();


                }
                return true;
                }

            });





    }

}

