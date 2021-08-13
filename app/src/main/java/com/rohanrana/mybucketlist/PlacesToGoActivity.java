package com.rohanrana.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);

        setupList();
    }

    private void setupList() {

        BucketListEntry[] placesToGo = {

                new BucketListEntry("Vietnam","Explore the mesmerising Ha Long Bay",R.drawable.vietnam,5),
                new BucketListEntry("Kerela","Visit the most beautiful Sea Beaches",R.drawable.kerala,4),
                new BucketListEntry("Japan","Have a glimpse of the perfect balance of technology and nature",R.drawable.japan,3.5f),
                new BucketListEntry("Iceland","Just to do the boiling water to ice experiment",R.drawable.iceland,5),
                new BucketListEntry("Amazon,Brazil","Have an experience of dense rainforests and one of the world's longest river",R.drawable.amazon,4.5f)
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}