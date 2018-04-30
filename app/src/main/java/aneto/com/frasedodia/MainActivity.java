package aneto.com.frasedodia;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private String[] frases = {"frase 1", "frase2", "frase3"};

    private Button btnNovaFrase;
    private TextView txtNovaFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovaFrase = findViewById(R.id.btn_nova_frase_id);

        txtNovaFrase = findViewById(R.id.txt_nova_frase);

        btnNovaFrase.setOnClickListener(new OnClickListener() {

            Random numeroFrase = new Random();
            int aleatorio;
            @Override
            public void onClick(View v) {
                 aleatorio = numeroFrase.nextInt(frases.length);
                txtNovaFrase.setText(frases[aleatorio]);
            }
        });

    }

    public void changeTxt(){

    }
}
