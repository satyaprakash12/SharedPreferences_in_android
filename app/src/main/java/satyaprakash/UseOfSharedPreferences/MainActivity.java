package satyaprakash.UseOfSharedPreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
EditText editTextName,editTextEmail, editTextPass;

//public  static final String MyPreferences="MyPref";
//public static final  String Email="EmailKey";
    //public static final  String Pass ="PassKey";
    //public static final  String Name ="NameKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail=findViewById(R.id.editTextTextEmailAddress);
        editTextPass=findViewById(R.id.editTextTextPassword);
        editTextName=findViewById(R.id.editTextTextPersonName);

        /* SharedPreferences sharedPreferences=getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);

                String email=editTextEmail.getText().toString();
                String pass=editTextPass.getText().toString();
                String name=editTextName.getText().toString();
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Email,email);
                editor.putString(Pass,pass);
                editor.putString(Name,name);
                editor.commit();*/
            }

    @Override
    protected void onResume() {
        super.onResume();
        // Fetching the stored data
        // from the SharedPreference
        SharedPreferences sharedPreferences=getSharedPreferences("MyPreferences",Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("Name","satya");
        String email=sharedPreferences.getString("Email","satyaprakash.p@nakshtratechnohub.com");
        String pass=sharedPreferences.getString("Pass","Satya@1997");
        // Setting the fetched data
        // in the EditTexts
       editTextName.setText(name);
       editTextPass.setText(pass);
       editTextEmail.setText(email);
    }

   /* @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences =getSharedPreferences("data",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Name", editTextName.getText().toString());
        editor.putString("Email", editTextEmail.getText().toString());
        editor.putString("Pass", editTextPass.getText().toString());
        editor.apply();
    }*/
}