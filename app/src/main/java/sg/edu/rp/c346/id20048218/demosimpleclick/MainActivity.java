package sg.edu.rp.c346.id20048218.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button buttonDisplay;
    EditText editTextInput;
    TextView tvDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisplay = findViewById(R.id.buttonDisplay);
        editTextInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);


        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editTextInput.getText().toString();
                tvDisplay.setText(input);
                int selectedId = rgGender.getCheckedRadioButtonId();

                if (selectedId == R.id.rbMale){
                    tvDisplay.setText("He says " + input);
                } else {
                    tvDisplay.setText("She says " + input);
                }
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbtn.isChecked() == true) {
                    buttonDisplay.setEnabled(true);
                }
                else {
                    buttonDisplay.setEnabled(false);
                }
            }
        });


    }
}