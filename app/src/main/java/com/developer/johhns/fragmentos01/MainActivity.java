package com.developer.johhns.fragmentos01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements Fragmento_A.FragmentAListener, Fragmento_B.FragmentBListener {

    private Fragmento_A fragmento_A ;
    private Fragmento_B fragmento_B ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmento_A = new Fragmento_A();
        fragmento_B = new Fragmento_B();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor_a, fragmento_A )
                .replace(R.id.contenedor_b, fragmento_B )
                .commit();
    }

    @Override
    public void onInputASent(CharSequence input) {
        fragmento_B.updateEditText(input);
    }

    @Override
    public void onInputBSent(CharSequence input) {
        fragmento_A.updateEditText(input);
    }

}