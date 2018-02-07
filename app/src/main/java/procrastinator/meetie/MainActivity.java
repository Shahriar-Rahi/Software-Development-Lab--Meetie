package procrastinator.meetie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

import procrastinator.meetie.data.StaticConfig;
import procrastinator.meetie.service.ServiceUtils;
import procrastinator.meetie.ui.FriendsFragment;
import procrastinator.meetie.ui.GroupFragment;
import procrastinator.meetie.ui.LoginActivity;
import procrastinator.meetie.ui.UserProfileFragment;

public class MainActivity extends AppCompatActivity {

}