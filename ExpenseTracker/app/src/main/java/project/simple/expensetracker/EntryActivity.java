package project.simple.expensetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        Button button= (Button) findViewById(R.id.addEntry);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO call your code here. Disregard the service. No time!
                Toast toast = Toast.makeText(getApplicationContext(), "TEST", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
