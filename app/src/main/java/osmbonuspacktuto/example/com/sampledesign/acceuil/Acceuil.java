package osmbonuspacktuto.example.com.sampledesign.acceuil;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import osmbonuspacktuto.example.com.sampledesign.R;

public class Acceuil extends AppCompatActivity {

    private Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        btn_create = (Button) findViewById(R.id.btn_create);

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                View view_dialog = LayoutInflater.from(view.getContext()).inflate(R.layout.create_account,null,false);
                builder.setView(view_dialog);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });




    }
}
