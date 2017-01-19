package cn.huimin.huimin.rxjava;

import cn.huimin.data.RegisterRequest;
import rx.Subscriber;

/**
 * Created by 胡森森 on 2017/1/19.
 */
public class Login {

    private static Subscriber<String> subscriber;
    //程序入口
    public static void main(String[] arg){
        login();
        RegisterRequest request = new RegisterRequest();
        request.register();
    }

    private static void login() {
        subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("输出完成...");
            }
            @Override
            public void onError(Throwable e) {
                System.out.println("有问题...");
            }
            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };
        Request.LoginRequest(subscriber);
    }
}
