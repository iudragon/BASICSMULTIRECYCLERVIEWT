package com.lewokapps.basicsmultirecyclerviewt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();

        modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.IMAGE_LAYOUT, R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.AD_LAYOUT, "dd"));
        modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
     modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.IMAGE_LAYOUT, R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.AD_LAYOUT, "ddddddddddddd"));
        modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
     modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.IMAGE_LAYOUT, R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.AD_LAYOUT, "dd"));
        modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
     modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.IMAGE_LAYOUT, R.drawable.ic_launcher_background));
        modelClassList.add(new ModelClass(ModelClass.AD_LAYOUT, "dd"));
        modelClassList.add(new ModelClass(ModelClass.USER_INFO_LAYOUT, "ddd", R.drawable.ic_launcher_background));


        Adapter adapter = new Adapter(modelClassList);

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
