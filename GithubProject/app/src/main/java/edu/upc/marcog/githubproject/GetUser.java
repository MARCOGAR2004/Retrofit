package edu.upc.marcog.githubproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GetUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void doGetUser(View view) {

        new getUser(this).execute();
    }

    private class getUser extends AsyncTask<String, Void, String> {
        Context context;

        private getUser(Context context) {
            this.context = context;
        }
        @Override
        protected String doInBackground(String... urls) {

            final EditText username = (EditText) findViewById(R.id.username);
            String user = username.getText().toString();

            return username.getText().toString();
        }

        @Override
        protected void onPostExecute(String result) {
            Intent i = new Intent(GetUser.this, MainActivity.class);
            i.putExtra("username",result);
            startActivity(i);
        }
    }
}
