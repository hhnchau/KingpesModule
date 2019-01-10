package info.kingpes.kingpesmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import info.kingpes.kutils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = Utils.getId();

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}
