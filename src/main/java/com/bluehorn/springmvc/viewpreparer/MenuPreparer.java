
package com.bluehorn.springmvc.viewpreparer;

import java.util.ArrayList;

import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

public class MenuPreparer implements ViewPreparer {

	public MenuPreparer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Request tilesRequest, AttributeContext attributeContext) {
		
		final ArrayList<MenuItem> menu = new ArrayList<MenuPreparer.MenuItem>();
		menu.add(new MenuItem("home", "login.jsp"));
		menu.add(new MenuItem("services", "services.jsp"));
		menu.add(new MenuItem("legal", "legal.jsp"));
		
		attributeContext.putAttribute("pMenu", new Attribute(menu));
		attributeContext.putAttribute("pView", new Attribute("This value is added by view preparer!"));
	}

	
	public static class MenuItem {
		
		private String caption;
		private String url;
		
		public MenuItem(String caption, String url) {
			super();
			this.url = url;
			this.caption = caption;
		}
		
		public String getCaption() {
			return caption;
		}
		public void setCaption(String caption) {
			this.caption = caption;
		}

		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		
	}
}
