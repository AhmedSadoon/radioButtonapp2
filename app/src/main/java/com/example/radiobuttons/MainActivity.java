package com.example.radiobuttons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int item_selection=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SelectRoom(View view) {
        registerForContextMenu(view);
        openContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.hotel_rooms,menu);
        MenuItem item_oneRoom=menu.findItem(R.id.id_oneRoom);
        MenuItem item_twoRoom=menu.findItem(R.id.id_twoRoom);
        MenuItem item_threeRoom=menu.findItem(R.id.id_threeRoom);
        MenuItem item_fourRoom=menu.findItem(R.id.id_fourRoom);

        if (item_selection==1)
        {
            item_oneRoom.setChecked(true);
        }

        else if (item_selection==2)
        {
            item_twoRoom.setChecked(true);
        }

        else if (item_selection==3)
        {
            item_threeRoom.setChecked(true);
        }

        else if (item_selection==4)
        {
            item_fourRoom.setChecked(true);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.id_oneRoom:
                Toast.makeText(getApplicationContext(),"Selected One Room",Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                item_selection=1;
                return true;

            case R.id.id_twoRoom:
                Toast.makeText(getApplicationContext(),"Selected Two Room",Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                item_selection=2;
                return true;
            case R.id.id_threeRoom:
                Toast.makeText(getApplicationContext(),"Selected Three Room",Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                item_selection=3;
                return true;

            case R.id.id_fourRoom:
                Toast.makeText(getApplicationContext(),"Selected Four Room",Toast.LENGTH_SHORT).show();
                item.setChecked(true);
                item_selection=4;
                return true;
        }

        return super.onContextItemSelected(item);
    }
}
