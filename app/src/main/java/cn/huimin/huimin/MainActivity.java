package cn.huimin.huimin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.huimin.huimin.login.LoginRequest;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {
    private Subscriber<String> subscriber;
    private LoginRequest request = new LoginRequest();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subscriber= new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("finish");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println(s+"  success...");
            }
        };
        request.loginRequest(subscriber);

    }
}
