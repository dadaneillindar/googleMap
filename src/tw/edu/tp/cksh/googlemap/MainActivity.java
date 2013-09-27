/*package tw.edu.tp.cksh.googlemap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}*/
package tw.edu.tp.cksh.googlemap;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {
    static final LatLng latLng = new LatLng(25.110480, 121.526229);
    private GoogleMap map;

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        Marker marker = map.addMarker(new MarkerOptions().position(latLng).title("家").snippet("中山北路6段290巷7弄5-1號5樓"));
        Marker marker_2 = map.addMarker(new MarkerOptions().position(new LatLng(25.115645, 121.519976)).title("阿嬤家").snippet("振華街2號2樓"));
       Circle circle = map.addCircle(new CircleOptions().center(new LatLng(25.110700, 121.526229)).radius(100).strokeColor(Color.RED).fillColor(Color.CYAN));
        // Move the camera instantly to latLng with a zoom of 16.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.113000, 121.523000), 16));
    }
}
