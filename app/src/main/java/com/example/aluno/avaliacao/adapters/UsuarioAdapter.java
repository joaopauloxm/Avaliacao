package com.example.aluno.avaliacao.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aluno.avaliacao.R;
import com.example.aluno.avaliacao.model.User;

import java.util.List;

public class UsuarioAdapter extends BaseAdapter{
    Context context;
    List<User> colecao;
    LayoutInflater inflter;

    public UsuarioAdapter(final Context applicationContext,
                         final List<User> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override

    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private User parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_user, viewGroup, false);
        }

        // pega o objeto corrente da lista
        User user = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoId, campoName, campoUserName, campoEmail, campoStreet, campoSuite, campoCity, campoZipCode, campoLat, campoLgt, campoPhone, campoWebsite, campoNomeCompany, campoCatchPhrase, campoBs;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(user.getNome());


        campoId = view.findViewById(R.id.txtId);
        campoName = view.findViewById(R.id.txtName);
        campoUserName = view.findViewById(R.id.txtUserName);
        campoEmail = view.findViewById(R.id.txtEmail);
        campoStreet = view.findViewById(R.id.txtStreet);
        campoSuite = view.findViewById(R.id.txtSuite);
        campoCity = view.findViewById(R.id.txtCity);
        campoZipCode = view.findViewById(R.id.txtZipCode);
        campoLat = view.findViewById(R.id.txtLat);
        campoLgt = view.findViewById(R.id.txtLgt);
        campoPhone = view.findViewById(R.id.txtPhone);
        campoWebsite = view.findViewById(R.id.txtWebSite);
        campoNomeCompany = view.findViewById(R.id.txtNameCompany);
        campoCatchPhrase = view.findViewById(R.id.txtCatchPhrase);
        campoBs = view.findViewById(R.id.txtBs);

        campoId.setText(user.getId());
        campoName.setText(user.getName());
        campoUserName.setText(user.getUserName());
        campoEmail.setText(user.getEmail());
        campoStreet.setText(user.getEmail());
        campoSuite.setText(user.getEmail());
        campoCity.setText(user.getEmail());
        campoZipCode.setText(user.getEmail());
        campoLat.setText(user.getEmail());
        campoLgt.setText(user.getEmail());
        campoPhone.setText(user.getEmail());
        campoWebsite.setText(user.getEmail());
        campoNomeCompany.setText(user.getEmail());
        campoCatchPhrase.setText(user.getEmail());
        campoBs.setText(user.getEmail());

        return view;
    }
}
