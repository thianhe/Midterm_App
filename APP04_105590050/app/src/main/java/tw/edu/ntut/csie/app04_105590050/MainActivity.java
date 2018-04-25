package tw.edu.ntut.csie.app04_105590050;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView mstudentList;
    Button btnClick;
    TextView txvAbsence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mstudentList = findViewById(R.id.studentList);
        btnClick = findViewById(R.id.btnClick);
        txvAbsence = findViewById(R.id.txvAbsence);

        btnClick.setOnClickListener(btnClear_OnClick);
        mstudentList.setOnItemClickListener(mstudentList_OnItemClick);
    }

    private final ListView.OnItemClickListener mstudentList_OnItemClick = new ListView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            txvAbsence.setText(txvAbsence.getText().toString() + "Student" + (i + 1) + " ");
        }
    };

    private final View.OnClickListener btnClear_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            txvAbsence.setText("");
        }
    };
}
