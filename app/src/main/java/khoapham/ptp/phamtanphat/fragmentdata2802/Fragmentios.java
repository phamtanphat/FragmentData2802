package khoapham.ptp.phamtanphat.fragmentdata2802;

import android.util.Log;
import android.view.View;
import android.widget.RatingBar;

public class Fragmentios extends BaseFragment {
    RatingBar ratingBar;
    ListenData listenData;
    @Override
    public int setView() {
        return R.layout.fragment_ios;
    }

    @Override
    public void activityfinishcreate() {
        ratingBar = getView().findViewById(R.id.ratingbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                FragmentAndroid fragmentAndroid = (FragmentAndroid) getActivity().getSupportFragmentManager().findFragmentById(R.id.fragmentAndroid);
                if (fragmentAndroid != null){
                    listenData = fragmentAndroid;
                    listenData.sendData(rating);
                }

            }
        });
    }


}
