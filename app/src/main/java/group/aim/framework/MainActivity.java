package group.aim.framework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import group.aim.framework.enumeration.UpdatePolicy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UpdatePolicy policy = UpdatePolicy.ForceUpdate;

        if(policy == UpdatePolicy.ForceUpdate) {
            // TODO : Something
        } {
            // TODO : Nothing
        }
    }
}
