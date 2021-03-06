package com.IngressRobot.Workers;

import com.IngressRobot.Settings.Setting;
import com.IngressRobot.Utils.Config;

public class AutoAcquire extends BaseWorker{

	public AutoAcquire(Setting setting) {
		super(setting);
	}

	@Override
	protected String getCommand() {
		return "uiautomator runtest IngressRobotScript.jar -c com.autoingress.run.AutoAcquire";
	}

	@Override
	protected String getRunnerName() {
		return AutoHack.class.getName();
	}

	@Override
	protected void presetting() {
		Config.setProperty(Setting.KEY_ACQUIRE_NUMBER, String.valueOf(mSetting.GetAcquireNumber()));
		Config.setProperty(Setting.KEY_ACQUIRE_POS, String.valueOf(mSetting.GetAquirePos()));
		Config.storeProperty();
	}

}
