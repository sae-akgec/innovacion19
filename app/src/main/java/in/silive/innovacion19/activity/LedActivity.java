package in.silive.innovacion19.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import in.silive.innovacion19.ApiClient;
import in.silive.innovacion19.ApiService;
import in.silive.innovacion19.R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class LedActivity extends AppCompatActivity {

    private ApiService apiService;
    private CompositeDisposable disposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        ButterKnife.bind(this);
        apiService = ApiClient.getClient(getApplicationContext()).create(ApiService.class);

    }

    @OnClick(R.id.led_button_on)
    public void ledOn(){
        apiService.led(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(LedActivity.this, "Led Turned On", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(LedActivity.this, "Led Turned On ", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.led_button_off)
    public void ledOff(){
        apiService.led(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(LedActivity.this, "Led Turned OFF", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(LedActivity.this, "Led Turned OFF", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
