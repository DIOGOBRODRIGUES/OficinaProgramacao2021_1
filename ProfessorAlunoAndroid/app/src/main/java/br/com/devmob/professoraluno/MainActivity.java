package br.com.devmob.professoraluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nome = findViewById(R.id.editTextTextPersonName);
        Spinner prof = findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.profissoes, android.R.layout.simple_spinner_item);

        prof.setAdapter(arrayAdapter);
        Button buttonAdd = findViewById(R.id.btAdd);
        TextView nomeRes = findViewById(R.id.tvNome);
        TextView profRes = findViewById(R.id.tvProfissao);
        TextView acaRes = findViewById(R.id.tvAcao);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(prof.getSelectedItem().toString().equals("Professor")) {
                    Professor professor = new Professor();
                    professor.setNome(nome.getText().toString());
                    professor.setProfissao(prof.getSelectedItem().toString());
                    nomeRes.setText(professor.getNome());
                    profRes.setText(professor.getProfissao());
                    acaRes.setText(professor.ensinar());
                }else{
                    Aluno aluno = new Aluno();
                    aluno.setNome(nome.getText().toString());
                    aluno.setProfissao(prof.getSelectedItem().toString());
                    nomeRes.setText(aluno.getNome());
                    profRes.setText(aluno.getProfissao());
                    acaRes.setText(aluno.aprender());
                }

            }
        });

    }
}