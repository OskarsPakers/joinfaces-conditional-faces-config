package com.example.demo;

import org.omnifaces.util.Faces;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;
import java.util.Locale;

@Named
@RequestScoped
public class LanguageBean {

    public List<Locale> getSupportedLocales(){
        return Faces.getSupportedLocales();
    }
}
