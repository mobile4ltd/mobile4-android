package mx.mobile4.cliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import mx.mobile4.cliente.Libs.Configuration;

public class RegistroActivity extends AppCompatActivity {

    private EditText etSerie;
    private String androidID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        androidID = Configuration.getDeviceId(getContentResolver());
        etSerie = (EditText) findViewById(R.id.etSerie);

        etSerie.setText(androidID);


    }

}
