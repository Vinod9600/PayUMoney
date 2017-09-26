package taskmanagement.vinod.com.payukickstarter;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vinod on 8/12/2017.
 */

public class ApplicationLayer  extends AppCompatActivity {

    public static HashMap<String,Object> mDataCache = new HashMap<>();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public ProjectList getProjectList() {
        if (mDataCache != null && mDataCache.containsKey(ServiceConstant.KEY_PROJECT_LIST)) {
            return (ProjectList) mDataCache.get(ServiceConstant.KEY_PROJECT_LIST);
        }

        return null;
    }
}
