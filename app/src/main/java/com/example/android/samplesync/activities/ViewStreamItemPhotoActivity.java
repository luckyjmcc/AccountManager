/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.example.android.samplesync.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.samplesync.R;

/**
 * Activity to view a stream-item-photo. In a real app, this would show a fullscreen view of the
 * photo, potentially with ways to interact with it
 */
public class ViewStreamItemPhotoActivity extends Activity {
	public static final String TAG =  ViewStreamItemPhotoActivity.class.getSimpleName();

    private TextView mUriTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_stream_item_photo_activity);

        mUriTextView = (TextView) findViewById(R.id.view_stream_item_photo_uri);
        mUriTextView.setText(getIntent().getDataString());
    }
}
