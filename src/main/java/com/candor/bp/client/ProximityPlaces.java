package com.candor.bp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.ui.HTML;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * 
 * @author bp
 *
 */
public class ProximityPlaces extends AbstractEntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		/*
		 * Code Splitting performance driven choice
		 */
		GWT.runAsync(AppFrame.class, new RunAsyncCallback() {

			@Override
			public void onSuccess() {
				setRootLayout(new HTML("<h1>Welcome!</h1>"));
			}

			@Override
			public void onFailure(Throwable reason) {
				reason.printStackTrace();
			}
		});

	}
}