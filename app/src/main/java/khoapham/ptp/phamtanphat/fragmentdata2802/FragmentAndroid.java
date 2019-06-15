package khoapham.ptp.phamtanphat.fragmentdata2802;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentAndroid extends BaseFragment implements ListenData {

    TextView txtTitleAndroid;
    Button btnSend;
    EditText edt;
    @Override
    public int setView() {
        return R.layout.fragment_android;
    }

    @Override
    public void activityfinishcreate() {
        txtTitleAndroid = getView().findViewById(R.id.textviewTitleAndroid);
        btnSend = getView().findViewById(R.id.buttonSend);
        edt = getView().findViewById(R.id.edittextAndroid);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void sendData(float value) {
        edt.setText(value+ "");
    }
}
