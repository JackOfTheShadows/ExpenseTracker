package project.simple.expensetracker.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by e6420 on 28.01.18.
 */

public class EntryService extends IntentService
{
    public EntryService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
