package com.leadall.chauffeur.base;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.leadall.chauffeur.R;

import org.jetbrains.annotations.Nullable;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;


public abstract class BaseBindFragment extends Fragment{
	
	public Gson gson = new Gson();
	public BaseBindFragmentActivity mBaseBindFragmentActivity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setFirst();
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater,
							 @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View mRootView = onIntroduceLayout(inflater, container, savedInstanceState);
		ButterKnife.bind(this,mRootView);//绑定framgent
		return mRootView;
	}

	/**
	 * 返回fragment的布局ID
	 *
	 * @return
	 */
	public abstract View onIntroduceLayout(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState);

	public abstract void setFirst();

	public void L(String msg) {
		Log.i("zwen", msg);
	}

	public void O(String msg) {
		Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
	}
}
