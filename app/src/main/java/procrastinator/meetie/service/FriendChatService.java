package procrastinator.meetie.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Base64;
import android.util.Log;

import procrastinator.meetie.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import procrastinator.meetie.MainActivity;
import procrastinator.meetie.data.FriendDB;
import procrastinator.meetie.data.GroupDB;
import procrastinator.meetie.data.StaticConfig;
import procrastinator.meetie.model.Friend;
import procrastinator.meetie.model.Group;
import procrastinator.meetie.model.ListFriend;


public class FriendChatService extends Service {

}
