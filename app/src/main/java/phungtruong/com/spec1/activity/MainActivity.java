package phungtruong.com.spec1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import phungtruong.com.spec1.R;
import phungtruong.com.spec1.model.Employee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee e1 = new Employee("e01","Phung",12);
    }
}
