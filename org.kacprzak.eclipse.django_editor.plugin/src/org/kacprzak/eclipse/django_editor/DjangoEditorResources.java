package org.kacprzak.eclipse.django_editor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DjangoEditorResources {

	private static final String RESOURCE_BUNDLE = "org.kacprzak.eclipse.django_editor.DjangoEditorResources";//$NON-NLS-1$

	private static ResourceBundle fgResourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE);

	private DjangoEditorResources() {
	}

	public static String getString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!";//$NON-NLS-2$ //$NON-NLS-1$
		}
	}
	
	public static ResourceBundle getResourceBundle() {
		return fgResourceBundle;
	}
}
