package com.developer.johhns.fragmentos01;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<CharSequence> texto = new MutableLiveData<>() ;

    public void setTexto( CharSequence entrada ) {
        this.texto.setValue( entrada );
    }

    public LiveData<CharSequence> obtenerTexto(){
        return this.texto ;
    }

}
