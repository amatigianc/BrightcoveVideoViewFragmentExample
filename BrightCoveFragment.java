package com.brightcove.bcplayer_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.Resources;


import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.mediacontroller.BrightcoveSeekBar;
import com.brightcove.player.view.BrightcovePlayerFragment;
import com.brightcove.player.view.BrightcoveVideoView;

/**
 * Created by gamati on 12/05/15.
 */
public class BrightCoveFragment extends BrightcovePlayerFragment {
    private EventEmitter eventEmitter;
    private BrightcoveSeekBar seekbar;


    @Override public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment, container,false);
        brightcoveVideoView = (BrightcoveVideoView) view.findViewById(R.id.brightcove_video_view);
        eventEmitter = brightcoveVideoView.getEventEmitter();

        super.onCreateView(inflater, container, savedInstanceState);
        seekbar = (BrightcoveSeekBar) view.findViewById(R.id.brightcove_seekbar);

        Resources resources = getResources();
        String url = resources.getString(R.string.media_url);

        brightcoveVideoView.setVideoPath(url);

        return view;
    }

}
