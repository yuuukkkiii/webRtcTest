package com.example.webrtctest.util;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.linphone.core.Account;
import org.linphone.core.AccountListener;
import org.linphone.core.AccountListenerStub;
import org.linphone.core.AccountParams;
import org.linphone.core.Address;
import org.linphone.core.AudioDevice;
import org.linphone.core.AuthInfo;
import org.linphone.core.AuthMethod;
import org.linphone.core.Call;
import org.linphone.core.CallLog;
import org.linphone.core.CallStats;
import org.linphone.core.ChatMessage;
import org.linphone.core.ChatRoom;
import org.linphone.core.Conference;
import org.linphone.core.ConferenceInfo;
import org.linphone.core.ConferenceInfoError;
import org.linphone.core.ConfiguringState;
import org.linphone.core.Content;
import org.linphone.core.Core;
import org.linphone.core.CoreListener;
import org.linphone.core.CoreListenerStub;
import org.linphone.core.EcCalibratorStatus;
import org.linphone.core.Event;
import org.linphone.core.Factory;
import org.linphone.core.Friend;
import org.linphone.core.FriendList;
import org.linphone.core.GlobalState;
import org.linphone.core.InfoMessage;
import org.linphone.core.PresenceModel;
import org.linphone.core.ProxyConfig;
import org.linphone.core.PublishState;
import org.linphone.core.RegistrationState;
import org.linphone.core.SubscriptionState;
import org.linphone.core.TransportType;
import org.linphone.core.VersionUpdateCheckResult;

public class LinphoneUtil {
    private static final String TAG="LinphoneUtil--->";
    private Core core=null;

    public void initCore(Context context){
        Factory factory=Factory.instance();
        factory.setDebugMode(true,"hello world");
        core=factory.createCore(null,null,context);
    }

    public void registerUser(String name,String password,String host,String port){
        Log.e(TAG,"registerUserName = "+name);
        Log.e(TAG,"registerPassword = "+password);
        Log.e(TAG,"registerUserHost = "+host);
// 报文内个人基本信息
        String identify="sip:"+name+"@"+host+":"+port;
        String proxy="sip:"+host;
        Address proxyAddr= Factory.instance().createAddress(proxy);
        Address indetifyAddr=Factory.instance().createAddress(identify);
        AuthInfo authInfo=Factory.instance().createAuthInfo(name,null,password,null,null,host);
        AccountParams params=core.createAccountParams();
        params.setIdentityAddress(indetifyAddr);
        if (proxyAddr != null) {
            proxyAddr.setTransport(TransportType.Udp);
        }
        params.setServerAddress(proxyAddr);
        params.setRegisterEnabled(true);
        Account account=core.createAccount(params);
        core.addAuthInfo(authInfo);
        core.addAccount(account);
        core.setDefaultAccount(account);
        core.addListener(new CoreListenerStub() {
            @Override
            public void onAccountRegistrationStateChanged(@NonNull Core core, @NonNull Account account, RegistrationState registrationState, @NonNull String s) {
                Log.e(TAG,registrationState.toString());
            }

        });
        account.addListener(new AccountListener(){
            @Override
            public void onRegistrationStateChanged(@NonNull Account account, RegistrationState registrationState, @NonNull String s) {
                Log.e(TAG,registrationState.toString());
            }
        });
        core.start();
    }
}
