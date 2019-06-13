package khoapham.ptp.phamtanphat.fragmentdata2802;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentAndroid extends BaseFragment {
    @Override
    public int setView() {
        return R.layout.fragment_android;

    }

    @Override
    public void activityfinishcreate() {
        Bundle bundle = getArguments();
        String chuoi = bundle.getString("chuoi");
    }


}
