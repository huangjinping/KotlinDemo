package con.hjp.kotlin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * author Created by harrishuang on 2017/6/5.
 * email : huangjinping@hdfex.com
 */

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onclick(View view) {

        Toast.makeText(this, "onclick", Toast.LENGTH_SHORT).show();
    }
}
