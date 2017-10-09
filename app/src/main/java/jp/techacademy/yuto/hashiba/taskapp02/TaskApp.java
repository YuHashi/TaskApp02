package jp.techacademy.yuto.hashiba.taskapp02;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Yuto on 2017/10/08.
 */

public class TaskApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }

}
