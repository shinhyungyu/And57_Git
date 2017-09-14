package edu.android.and57_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        TextView tv = (TextView) findViewById(R.id.textView);
    }

    public  void test() {
        //TODO:
    }

    public void testAAA() {
        // developer aaa
    }

    public void testBBB() {
        // 개발자 bbb
    }
}
