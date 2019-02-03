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
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class RelayActivity extends AppCompatActivity {

    private ApiService apiService;
    private CompositeDisposable disposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relay);
        ButterKnife.bind(this);
        apiService = ApiClient.getClient(getApplicationContext()).create(ApiService.class);

    }

    @OnClick(R.id.relay_one_on)
    public void realyOneOn(){
        apiService.relay1(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(RelayActivity.this, "Relay one turned On", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RelayActivity.this, "Relay one turned On", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.relay_one_off)
    public void realyOneOff(){
        apiService.relay1(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(RelayActivity.this, "Relay one turned OFF", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RelayActivity.this, "Relay one turned OFF", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.relay_two_on)
    public void realyTwoOn(){
        apiService.relay2(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(RelayActivity.this, "Relay two turned On", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RelayActivity.this, "Relay two turned On", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.relay_two_off)
    public void realyTwoOff(){
        apiService.relay2(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(RelayActivity.this, "Relay two turned OFF", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RelayActivity.this, "Relay two turned OFF", Toast.LENGTH_SHORT).show();
                    }
                });
    }

}
