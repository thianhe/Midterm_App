package tw.edu.ntut.csie.app01_105590050;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mtxtview;
    EditText medtview;
    Button mbtn;
    changeGrade grade = new changeGrade();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtview = (TextView) findViewById(R.id.resultView);
        medtview = (EditText) findViewById(R.id.editResult);
        mbtn = (Button) findViewById(R.id.btnClick);

        mbtn.setOnClickListener(submit);
    }

    View.OnClickListener submit = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int marks =Getint(medtview.getText().toString());
            mtxtview.setText(grade.letterGrade(marks));

        }
    };
    private int Getint( String input ) {
        try {
            return Integer.parseInt( input );
        }
        catch( Exception e ) {
            return -1;
        }
    }
}