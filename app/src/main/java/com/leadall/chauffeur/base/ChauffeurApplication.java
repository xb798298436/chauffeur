package com.leadall.chauffeur.base;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity; 
import android.app.Application; 
import android.bluetooth.BluetoothDevice;

public class ChauffeurApplication extends Application {

    private ArrayList<Activity> mList = new ArrayList<Activity>(); 
    private ArrayList<Activity> czList = new ArrayList<Activity>(); 
    private ArrayList<Activity> detailList = new ArrayList<Activity>();
    private static ChauffeurApplication instance; 
	public boolean isSetBaiduLocation = false;	
	public static String cardID;
	public static Class<?> cls;
	public static BluetoothDevice currentDevice;
	private static final int DISK_CACHE_SIZE = 100 * 1024 * 1024;
    public static final int MAX_MEMORY_CACHE_SIZE = 10 * 1024 * 1024;
    
	

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		instance = this;
//		SDKInitializer.initialize(getApplicationContext());		
	}
	 
    public synchronized static ChauffeurApplication getInstance() { 
        if (null == instance) { 
            instance = new ChauffeurApplication(); 
        } 
        return instance; 
    } 

    public void addActivity(Activity activity) { 

        mList.add(activity);
    } 
 
    public void exit() { 
        try { 
            for (Activity activity : mList) { 
                if (activity != null) 
                    activity.finish(); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            System.exit(0); 
        } 
    } 
   
    public void addDetailActivity(Activity activity) {

        detailList.add(activity);
    }
    
    public List<Activity> getActivities(){
		return mList;  	
    }

    public void removeExtraActivity() {
    	if (detailList.size() > 2) {
    		detailList.get(0).finish();
    		detailList.remove(0);
    	}
    }

   	
   	
   	
   	@Override
    public void onTerminate() {
        super.onTerminate();       
       
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc(); 
        
    }
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

    }

  
	
}
