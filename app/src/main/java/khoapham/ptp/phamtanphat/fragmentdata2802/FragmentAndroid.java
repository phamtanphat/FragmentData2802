package khoapham.ptp.phamtanphat.fragmentdata2802;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentAndroid extends BaseFragment  {

    TextView txtTitleAndroid;
    Button btnSend;
    ListenData listenData;
    @Override
    public int setView() {
        return R.layout.fragment_android;
    }

    @Override
    public void activityfinishcreate() {
        txtTitleAndroid = getView().findViewById(R.id.textviewTitleAndroid);
        btnSend = getView().findViewById(R.id.buttonSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenData = (ListenData) getActivity();
                listenData.sendData("hello");
            }
        });
    }



}
