package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations.
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.shopping1_name), getString(R.string.shopping1_address), getString(R.string.shopping1_description), R.drawable.shopping1));
        locations.add(new Location(getString(R.string.shopping2_name), getString(R.string.shopping2_address), getString(R.string.shopping2_description), R.drawable.shopping2));
        locations.add(new Location(getString(R.string.shopping3_name), getString(R.string.shopping3_address), getString(R.string.shopping3_description), R.drawable.shopping3));
        locations.add(new Location(getString(R.string.shopping4_name), getString(R.string.shopping4_address), getString(R.string.shopping4_description), R.drawable.shopping4));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        final ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
                Location location = (Location) listView.getItemAtPosition(position);
                Intent detailIntent = new Intent(getActivity(), DetailActivity.class);
                detailIntent.putExtra("LOCATIONNAME", location.getLocationName());
                detailIntent.putExtra("LOCATIONADDRESS", location.getLocationAddress());
                detailIntent.putExtra("LOCATIONDESCRIPTION", location.getLocationDescription());
                detailIntent.putExtra("LOCATIONIMAGE", location.getImageResourceId());
                startActivity(detailIntent);
            }
        });

        return rootView;
    }
}


