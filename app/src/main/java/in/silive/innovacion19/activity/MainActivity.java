package in.silive.innovacion19.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import in.silive.innovacion19.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.main_club_button)
    public void aboutClicked(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.main_developer_button)
    public void developerClicked(){
        Intent intent = new Intent(this, DeveloperActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.main_led_button)
    public void ledClicked(){
        Intent intent = new Intent(this, LedActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.main_home_button)
    public void relayClicked(){
        Intent intent = new Intent(this, RelayActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.main_bot_button)
    public void botClicked(){
        Intent intent = new Intent(this, BotActivity.class);
        startActivity(intent);
    }

}
