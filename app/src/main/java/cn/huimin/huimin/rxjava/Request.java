package cn.huimin.huimin.rxjava;

import android.support.annotation.MainThread;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 胡森森 on 2017/1/19.
 */
public class Request {

    public static void LoginRequest(final Subscriber<String> subscriber) {


        Observable.create(new Observable.OnSubscribe<String>() {

            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onStart();
                subscriber.onNext("hi");
                subscriber.onNext("nihao");
                subscriber.onNext("beijing");
                subscriber.onCompleted();
                //返回错误的信息
//                subscriber.onError();
            }
        }).subscribe(subscriber);

    }

}
