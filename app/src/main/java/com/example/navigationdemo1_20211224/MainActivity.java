package com.example.navigationdemo1_20211224;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set <- back button at Nav bar
        NavController controller = Navigation.findNavController(this,R.id.fragmentContainerView3);
        NavigationUI.setupActionBarWithNavController(this,controller);

    }

    // Activate <- back button at Nav bar
    @Override
    public boolean onSupportNavigateUp() {
        NavController controller=Navigation.findNavController(this, R.id.fragmentContainerView3);
        return controller.navigateUp();
        //return super.onSupportNavigateUp();
    }
}