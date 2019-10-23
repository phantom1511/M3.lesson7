package com.example.m3lesson7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ListFragment.OnListFragmentListener, DetailsFragment.OnDetailsFragmentListener {

    ListFragment listFragment;
    DetailsFragment detailsFragment;
    AddFragment addFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment = (AddFragment) getSupportFragmentManager().findFragmentById(R.id.addBtn);

        //мы все переводим в фрагмент

//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
//        MainAdapter adapter = new MainAdapter(this);
//
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(adapter);
//
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");
//        adapter.addString("7");

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        listFragment = ListFragment.newInstance("Start Element");
        transaction.replace(R.id.container, listFragment);
        transaction.commit();

    }

//    @Override
//    public void onVHClick(String string) {
//        Log.d("ron", "string");
//    }

    @Override
    public void onOpenDetails(String string) {
        Log.d("ron", "string" + string);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        detailsFragment = DetailsFragment.newInstance(string);
        transaction.replace(R.id.container, detailsFragment);
        transaction.commit();
    }

    @Override
    public void saveElement(String string) {
        Log.d("ron", "save");
        showFragment(new ListFragment());
    }


//    @Override
//    public void onOpenAdd(String string) {
//        Log.d("ron", "button");
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        addFragment = AddFragment.newInstance(string);
//        transaction.replace(R.id.container, addFragment);
//        transaction.commit();
//    }

    @Override
    public void onBackPressed() {
        if (detailsFragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.container, listFragment);
            transaction.commit();
            detailsFragment = null;
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public void addElement() {
        Log.d("ron", "add");
        showFragment(new AddFragment());
    }

    public void showFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }
}

