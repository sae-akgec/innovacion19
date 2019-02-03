package in.silive.innovacion19.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.silive.innovacion19.PrefUtils;
import in.silive.innovacion19.R;

public class IpActivity extends AppCompatActivity {

    @BindView(R.id.ip_edittext)
    public EditText ipEdittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip);
        ButterKnife.bind(this);

        String ip = PrefUtils.getIpAddress(this);
        if (ip != null){
            ipEdittext.setText(ip);
        }
    }

    @OnClick(R.id.ip_button)
    public void setIp(){
        String ip_edit = ipEdittext.getText().toString();
        if (ip_edit != ""){
            PrefUtils.storeIpAddress(this,ip_edit);
            Toast.makeText(this, "Set ip: " + ip_edit, Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    Intent intent = new Intent(IpActivity.this, MainActivity.class);
                    startActivity(intent);

                    // close this activity
                    finish();
                }
            },  2000);

        }else {
            Toast.makeText(this, "Please enter ip before moving next", Toast.LENGTH_SHORT).show();
        }
    }

}
