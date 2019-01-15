package com.takeit.hvaskjerlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String place = bundle.get(GlobalConstant.BUNDLE_PLACE).toString();
        String title = bundle.get(GlobalConstant.BUNDLE_TITLE).toString();
        String date = bundle.get(GlobalConstant.BUNDLE_DATE).toString();
        String description = bundle.get(GlobalConstant.BUNDLE_DESCRIPTION).toString();

        TextView viewPlace = (TextView)findViewById(R.id.textView_event_place_id);
        TextView viewTitle = (TextView)findViewById(R.id.textView_event_tittel_id);
        TextView viewDate = (TextView)findViewById(R.id.textView_event_date_id);
        TextView viewDescription = (TextView)findViewById(R.id.textView_event_description_id);

        viewPlace.setText(place);
        viewTitle.setText(title);
        viewDate.setText(date);
        viewPlace.setText(description);
    }
}
