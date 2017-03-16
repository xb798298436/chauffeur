package com.leadall.chauffeur.activity;

import android.os.Bundle;

import com.leadall.chauffeur.R;
import com.leadall.chauffeur.base.BaseBindActivity;
import com.leadall.chauffeur.base.ChauffeurApplication;

public class LoginActivity extends BaseBindActivity{

	@Override
	public void setFirst(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_login);
		ChauffeurApplication.getInstance().addActivity(this);
	}

	@Override
	public void setParameters() {

	}

	@Override
	public void setBusiness() {

	}

}
