package in.silive.innovacion19.activity;

import androidx.appcompat.app.AppCompatActivity;
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

public class BotActivity extends AppCompatActivity {

    private ApiService apiService;
    private CompositeDisposable disposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);
        ButterKnife.bind(this);
        apiService = ApiClient.getClient(getApplicationContext()).create(ApiService.class);

    }

    @OnClick(R.id.bot_forward)
    public void forward(){
        apiService.bot('F')
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(BotActivity.this, "Moving Forward", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(BotActivity.this, "Moving Forward", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.bot_left)
    public void left(){
        apiService.bot('L')
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(BotActivity.this, "Turning Left", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(BotActivity.this, "Turning Left", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.bot_right)
    public void right(){
        apiService.bot('R')
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(BotActivity.this, "Turning Right", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(BotActivity.this, "Turning Right", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.bot_stop)
    public void stop(){
        apiService.bot('S')
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(BotActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(BotActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @OnClick(R.id.bot_back)
    public void back(){
        apiService.bot('B')
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Object>() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(BotActivity.this, "Moving Backward", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(BotActivity.this, "Moving Backward", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
