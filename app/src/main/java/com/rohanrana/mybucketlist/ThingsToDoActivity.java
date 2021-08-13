package com.rohanrana.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {

                new BucketListEntry("Climb Mt. Kilimanjaro","Do it the difficult way",R.drawable.kilimanjaro,5),
                new BucketListEntry("Experience the Northern Lights","Somewhere in the Arctic Circle, probably Norway",R.drawable.northern_lights,4),
                new BucketListEntry("Road trip across India","Hire a car and explore India to the fullest",R.drawable.road_trip,3.5f),
                new BucketListEntry("Scuba Dive","In Koh Tao, Thailand",R.drawable.scubadive,5),
                new BucketListEntry("SkyDive","Preferably somewhere with an amazing view",R.drawable.skydive,4.5f)
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}