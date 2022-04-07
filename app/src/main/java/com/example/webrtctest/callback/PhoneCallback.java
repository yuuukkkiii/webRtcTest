package com.example.webrtctest.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.linphone.core.AudioDevice;
import org.linphone.core.Call;
import org.linphone.core.CallListener;
import org.linphone.core.CallStats;
import org.linphone.core.Headers;
import org.linphone.core.InfoMessage;

/**
 * author : Zhai Hao
 * date : 2022/4/6 10:46
 * description : 状态回调
 */
public abstract class PhoneCallback implements CallListener {
    @Override
    public void onSnapshotTaken(@NonNull Call call, @NonNull String s) {

    }

    @Override
    public void onEncryptionChanged(@NonNull Call call, boolean b, @Nullable String s) {

    }

    @Override
    public void onAudioDeviceChanged(@NonNull Call call, @NonNull AudioDevice audioDevice) {

    }

    @Override
    public void onNextVideoFrameDecoded(@NonNull Call call) {

    }

    @Override
    public void onRemoteRecording(@NonNull Call call, boolean b) {

    }

    @Override
    public void onStatsUpdated(@NonNull Call call, @NonNull CallStats callStats) {

    }

    @Override
    public void onInfoMessageReceived(@NonNull Call call, @NonNull InfoMessage infoMessage) {

    }

    @Override
    public void onAckProcessing(@NonNull Call call, @NonNull Headers headers, boolean b) {

    }

    @Override
    public void onTransferStateChanged(@NonNull Call call, Call.State state) {

    }

    @Override
    public void onTmmbrReceived(@NonNull Call call, int i, int i1) {

    }

    @Override
    public void onDtmfReceived(@NonNull Call call, int i) {

    }

    @Override
    public void onCameraNotWorking(@NonNull Call call, @NonNull String s) {

    }

    @Override
    public void onStateChanged(@NonNull Call call, Call.State state, @NonNull String s) {

    }
}
