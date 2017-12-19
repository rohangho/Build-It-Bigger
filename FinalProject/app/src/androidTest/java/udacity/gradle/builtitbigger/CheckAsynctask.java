package udacity.gradle.builtitbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.Asynctask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by ROHAN on 10-11-2017.
 */
@RunWith(AndroidJUnit4.class)

public class CheckAsynctask {

    private static final String TAG = CheckAsynctask.class.getSimpleName();

    @Test

    public void testFetchesNonEmptyString() {
        Asynctask fetchJokeTask = new Asynctask();
        fetchJokeTask.execute();
        try {
            String joke = fetchJokeTask.get();
            Log.d(TAG, "Joke text: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }

}