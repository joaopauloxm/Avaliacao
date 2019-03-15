package com.example.aluno.avaliacao.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.aluno.avaliacao.R;
import com.example.aluno.avaliacao.bootstrap.APIClient;
import com.example.aluno.avaliacao.model.User;
import com.example.aluno.avaliacao.resources.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends DefaultActivity {

    UserResource apiUserResourse;
    List<HashMap<String,String>> colecao =
            new ArrayList<HashMap<String,String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        apiUserResourse = APIClient.getClient().create(UserResource.class);

        Call<List<User>> get = apiUserResourse.get();

        get.enqueue(new Callback<List<User>>() {

            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                minhaLista = findViewById(R.id.minhaLista);

                listUser = response.body();

                for(User u: listUser){

                    //Criar dados para adapter
                    HashMap<String,String> mapUser = new HashMap<String,String>();
                    mapUser.put("id",String.valueOf(u.getId()));
                    mapUser.put("username",u.getUserName());
                    mapUser.put("email",u.getEmail());
                    mapUser.put("phone",u.getPhone());
                    mapUser.put("website",u.getWebsite());

                    colecao.add(mapUser);
                }

                String[] from = {"id","username","email","phone","website"};
                int[] to = {R.id.txtId,R.id.txtUserName, R.id.txtEmail, R.id.txtPhone,R.id.txtWebSite};

                SimpleAdapter simpleAdapter =
                        new SimpleAdapter(
                                getApplicationContext(),
                                colecao,
                                R.layout.item_user,
                                from,
                                to);

                minhaLista.setAdapter(simpleAdapter);
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }


    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtId = findViewById(R.id.txtId);
        txtNome = findViewById(R.id.txtEmail);
        txtUserName = findViewById(R.id.txtUserName);
        txtEmail = findViewById(R.id.txtEmail);
//        txtStreet = findViewById(R.id.txtStreet);
//        txtSuite = findViewById(R.id.txtSuite);
//        txtCity = findViewById(R.id.txtCity);
//        txtZipCode = findViewById(R.id.txtZipCode);
//        txtLat = findViewById(R.id.txtLat);
//        txtLgt = findViewById(R.id.txtLgt);
        txtPhone = findViewById(R.id.txtPhone);
        txtWebSite = findViewById(R.id.txtWebSite);
//        txtNameCompany = findViewById(R.id.txtNameCompany);
//        txtCatchPhrase = findViewById(R.id.txtCatchPhrase);
//        txtBs = findViewById(R.id.txtBs);

        Integer id;
        String name, userName, email, street, suite, city,
                zipcode, lat, lgt, phone, website, nomecompany, catchphrase, bs;

        id = Integer.parseInt(txtId.getText().toString());
        name = txtNome.getText().toString();
        userName = txtUserName.getText().toString();
        email = txtEmail.getText().toString();
//        street = txtStreet.getText().toString();
//        suite = txtSuite.getText().toString();
//        city = txtCity.getText().toString();
//        zipcode = txtZipCode.getText().toString();
//        lat = txtLat.getText().toString();
//        lgt = txtLgt.getText().toString();
        phone = txtEmail.getText().toString();
        website = txtWebSite.getText().toString();
//        nomecompany = txtNameCompany.getText().toString();
//        catchphrase = txtCatchPhrase.getText().toString();
//        bs = txtBs.getText().toString();

        final User user = User.builder()
                .id(id)
                .name(name)
                .userName(userName)
                .email(email)
                .phone(phone)
                .website(website)
                .build();

        Call<User> post = apiUserResourse.post(user);
        post.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User u = response.body();
                Toast.makeText(getApplicationContext(),
                        u.toString(),
                        Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(getApplicationContext(),
                        t.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });



    }
}







//        User user = new User(name, userName, email, street, suite, city,
//                zipcode, lat, lgt, phone, website, nomecompany, catchphrase, bs);
//
//        minha.add(user);
//
//        //SAIDA
//
//        minhaLista = findViewById(R.id.minhaLista);
//
//        //SAIDA
//
//        minhaLista = findViewById(R.id.minhaLista);
//
//
//        UsuarioAdapter usuarioAdapter = new UsuarioAdapter(this, lista);
//        minhaLista.setAdapter(usuarioAdapter);