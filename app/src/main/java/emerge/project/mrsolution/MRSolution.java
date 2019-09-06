package emerge.project.mrsolution;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import emerge.project.mrsolution.data.realm_migrations.RealmMigrations;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MRSolution extends Application {




    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);

        Realm.init(this);



    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onTerminate() {

        super.onTerminate();
    }



}
