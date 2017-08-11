package mx.mobile4.cliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import mx.mobile4.cliente.Libs.Network;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Network.isNetworkAvailable(this.getApplicationContext())){
            Intent intent = new Intent(this, RegistroActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(this.getApplicationContext(), R.string.aviso_red_no_disponible, Toast.LENGTH_SHORT).show();
        }
    }

}
