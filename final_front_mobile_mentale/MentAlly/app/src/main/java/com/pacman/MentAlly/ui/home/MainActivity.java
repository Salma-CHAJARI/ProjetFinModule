package com.pacman.MentAlly.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.navigation.NavigationView;
import com.pacman.MentAlly.R;
import com.pacman.MentAlly.ui.FaceTracker.EmotionListActivity;
import com.pacman.MentAlly.ui.FaceTracker.MainActivity3;
import com.pacman.MentAlly.ui.Mood.MoodActivity;
import com.pacman.MentAlly.ui.ToDoList.ToDoListActivity;
import com.pacman.MentAlly.ui.ambient.AmbientActivity;
import com.pacman.MentAlly.ui.breathing.BreathingActivity;
import com.pacman.MentAlly.ui.chatbot.MainActivity2;
import com.pacman.MentAlly.ui.emergency.EmergencyContactsActivity;
import com.pacman.MentAlly.ui.emergency.EmergencyDialogFragment;
import com.pacman.MentAlly.ui.habit.HabitTrackerActivity;
import com.pacman.MentAlly.ui.helpline.helplineActivity;
import com.pacman.MentAlly.ui.menu.WallpaperFragment;
import com.pacman.MentAlly.ui.profile.ProfileActivity;
import com.pacman.MentAlly.ui.quiz.QuizActivity;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final int SELECTED_PIC = 1;
    protected DrawerLayout draw;

    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        draw = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);

        //implement navigation bar icon
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, draw, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        draw.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.nav_home:
                Intent i_home = new Intent(this, HomeActivity.class);
                startActivity(i_home);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_profile:
                Log.d("Hi", "hello");
                Intent i_profile = new Intent(this, ProfileActivity.class);
                startActivity(i_profile);
                draw.closeDrawer(GravityCompat.START);
                Log.d("Hi", "hello");
                break;

            case R.id.nav_habit:
                Intent i_habit = new Intent(this, HabitTrackerActivity.class);
                startActivity(i_habit);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_todo:
                Intent i_todo = new Intent(this, ToDoListActivity.class);
                startActivity(i_todo);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_mood:
                Intent i_mood = new Intent(this, MoodActivity.class);
                startActivity(i_mood);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_breathe:
                Intent i_breathe = new Intent(this, BreathingActivity.class);
                startActivity(i_breathe);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_quiz:
                Intent i_quiz = new Intent(this, QuizActivity.class);
                startActivity(i_quiz);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_ambient:
                Intent i_ambient = new Intent(this, AmbientActivity.class);
                startActivity(i_ambient);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_wallpaper:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new WallpaperFragment()).commit();
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_contacts:
                Intent i_contacts = new Intent(this, EmergencyContactsActivity.class);
                startActivity(i_contacts);
                draw.closeDrawer(GravityCompat.START);
                break;

            case R.id.nav_helpline:
                Intent i_help = new Intent(this, helplineActivity .class);
                startActivity(i_help);
                draw.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_chatbot:
                Intent i_chatbot = new Intent(this, MainActivity2.class);
                startActivity(i_chatbot);
                draw.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_archive:
                Intent i_archive= new Intent(this, ArchiveActivity.class);
                startActivity(i_archive);
                draw.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_faceDec:
                Intent i_faceDec= new Intent(this, MainActivity3.class);
                startActivity(i_faceDec);
                draw.closeDrawer(GravityCompat.START);
                break;
            case R.id.emot_dec:
                Intent i_emot_dec= new Intent(this, EmotionListActivity.class);
                startActivity(i_emot_dec);
                draw.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_emergency:
                DialogFragment emergencyDialog = new EmergencyDialogFragment();
                emergencyDialog.show(getSupportFragmentManager(), "emergency");
                draw.closeDrawer(GravityCompat.START);
                break;
        }

        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int result, Intent data){
        super.onActivityResult(requestCode,result,data);
        switch(requestCode){
            case SELECTED_PIC:
                if(requestCode == RESULT_OK){
                    Uri uri = data.getData();
                    String[] projection = {MediaStore.Images.Media.DATA};
                    Cursor cursor = getContentResolver().query(uri,projection,null,null,null );
                    cursor.moveToFirst();
                    int columnindex = cursor.getColumnIndex(projection[0]);
                    String filepath = cursor.getString(columnindex);
                    cursor.close();

                    Bitmap b = BitmapFactory.decodeFile(filepath);
                    Drawable d = new BitmapDrawable(b);
                    imageView.setBackground(d);
                }
        }
    }
    @Override
    public void onBackPressed() {
        //close navigation bar before closing app
        if(draw.isDrawerOpen(GravityCompat.START)){
            draw.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}
