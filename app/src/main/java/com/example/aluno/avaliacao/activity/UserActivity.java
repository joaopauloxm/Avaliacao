package com.example.aluno.avaliacao.activity;

import android.os.Bundle;
import android.view.View;

import com.example.aluno.avaliacao.R;
import com.example.aluno.avaliacao.adapters.UsuarioAdapter;
import com.example.aluno.avaliacao.model.User;

public class UserActivity extends DefaultActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }


    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtId = findViewById(R.id.txtId);
        txtNome = findViewById(R.id.txtEmail);
        txtUserName = findViewById(R.id.txtUserName);
        txtEmail = findViewById(R.id.txtEmail);
        txtStreet = findViewById(R.id.txtStreet);
        txtSuite = findViewById(R.id.txtSuite);
        txtCity = findViewById(R.id.txtCity);
        txtZipCode = findViewById(R.id.txtZipCode);
        txtLat = findViewById(R.id.txtLat);
        txtLgt = findViewById(R.id.txtLgt);
        txtPhone = findViewById(R.id.txtPhone);
        txtWebSite = findViewById(R.id.txtWebSite);
        txtNameCompany = findViewById(R.id.txtNameCompany);
        txtCatchPhrase = findViewById(R.id.txtCatchPhrase);
        txtBs = findViewById(R.id.txtBs);

        Integer id;
        String nome, userName, email, street, suite, city,
                zipcode, lat, lgt, phone, website, nomecompany, catchphrase, bs;

        id = Integer.parseInt(txtId.getText().toString());
        nome = txtNome.getText().toString();
        userName = txtUserName.getText().toString();
        email = txtEmail.getText().toString();
        street = txtStreet.getText().toString();
        suite = txtSuite.getText().toString();
        city = txtCity.getText().toString();
        zipcode = txtZipCode.getText().toString();
        lat = txtLat.getText().toString();
        lgt = txtLgt.getText().toString();
        phone = txtEmail.getText().toString();
        website = txtWebSite.getText().toString();
        nomecompany = txtNameCompany.getText().toString();
        catchphrase = txtCatchPhrase.getText().toString();
        bs = txtBs.getText().toString();

        User user = new User(nome, userName, email, street, suite, city,
                zipcode, lat, lgt, phone, website, nomecompany, catchphrase, bs);

        lista.add(user);

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);


        UsuarioAdapter usuarioAdapter = new UsuarioAdapter(this, lista);
        minhaLista.setAdapter(usuarioAdapter);

    }
}
