package project.simple.expensetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.KeyStore;
import java.util.List;

import project.simple.expensetracker.dataBaseAdapter.MyDataBaseAdapter;
import project.simple.expensetracker.helperClasses.DataBaseEntry;

public class EntryActivity extends AppCompatActivity {

    EditText editName, editComment, editDate, editAmount, editCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        editName = (EditText)findViewById(R.id.editText_Name);
        editComment = (EditText)findViewById(R.id.editText_Comment);
        editCost = (EditText)findViewById(R.id.editText_cost);
        Button button= (Button) findViewById(R.id.addEntry);

        MyDataBaseAdapter data = new MyDataBaseAdapter(getApplicationContext());
        List<DataBaseEntry> list = data.getAllEtries();
        for(int i=0; i<list.size(); i++){
            Log.d("Motherfucker", list.get(i).getName());
        }

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
