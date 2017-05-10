package moive.sus.com.keywordsdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String sd = "Hello World! 测试  测试  1213  山东省发达大厦";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = (TextView) findViewById(R.id.tv);
        SpannableString spannableString = KeywordsUtil.matcherSearchTitle(Color.parseColor("#FA364A"), sd, "测试");
        viewById.setText(spannableString);
    }
}
