package khoapham.ptp.phamtanphat.fragmentdata2802;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListenData{

    Button btnMain;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        btnMain = findViewById(R.id.buttonMain);


        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }
    //Fragment chưa tồn tại
    private void mainTofragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.add(R.id.linearFragment,fragmentAndroid);
        Bundle bundle = new Bundle();
        bundle.putString("chuoi","Hello");
        fragmentAndroid.setArguments(bundle);
        fragmentTransaction.commit();
    }

    @Override
    public void sendData(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
