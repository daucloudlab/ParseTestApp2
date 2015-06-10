package kz.abcsoft.parse.android.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "VEtl66YzId5GJm4VptLYfUoJKDcuI7wSX1iffmtQ", "rMMxYwVeZMN3zKPw9pWJanoGrlbCa3CQV0hSiMxZ");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL() ;

        // defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
