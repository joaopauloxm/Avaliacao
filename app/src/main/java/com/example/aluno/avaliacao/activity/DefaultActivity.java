package com.example.aluno.avaliacao.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import com.example.aluno.avaliacao.model.User;

import java.util.ArrayList;
import java.util.List;


public class DefaultActivity extends AppCompatActivity {

    protected EditText txtId;
    protected EditText txtNome;
    protected EditText txtUserName;
    protected EditText txtEmail;
    protected EditText txtStreet;
    protected EditText txtSuite;
    protected EditText txtCity;
    protected EditText txtZipCode;
    protected EditText txtLat;
    protected EditText txtLgt;
    protected EditText txtPhone;
    protected EditText txtWebSite;
    protected EditText txtNameCompany;
    protected EditText txtCatchPhrase;
    protected EditText txtBs;

    public List<User> lista = new ArrayList<>();
    public ListView minhaLista;



}
