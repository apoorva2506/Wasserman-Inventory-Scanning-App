package com.example.admin.inventoryscanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {

    TextView textid;
    EditText editloc, editstaf;
    Button updbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        Intent intent1 = getIntent();
        final String insert_sno = intent1.getStringExtra("serno1");
        final String insert_loc = intent1.getStringExtra("locs");
        final String insert_staf = intent1.getStringExtra("staf");

        textid = (TextView) findViewById(R.id.textView17);
        textid.setText(insert_sno);

        editloc = (EditText) findViewById(R.id.editText4);
        editloc.setText(insert_loc);
        editstaf = (EditText) findViewById(R.id.editText10);
        editstaf.setText(insert_staf);

        updbtn = (Button) findViewById(R.id.button8);

    }
}
