package cz3003.pptx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable, AssetErrorListener {
	
	public static final String TAG = Assets.class.getName();
	public static final Assets instance = new Assets();
	
	private AssetManager assetManager;
	
	// singleton: prevent instantiation from other classes
	private Assets () {}
	
	public void init (AssetManager assetManager) {
		this.assetManager = assetManager;
		
//		// set asset manager error handler
//		assetManager.setErrorListener(this);
//		
//		// load texture atlas
//		assetManager.load(Constants.TEXTURE_ATLAS_OBJECTS,
//		TextureAtlas.class);
//		
//		// start loading assets and wait until finished
//		assetManager.finishLoading();
//		
//		Gdx.app.debug(TAG, "# of assets loaded: "
//		+ assetManager.getAssetNames().size);
//		
//		for (String a : assetManager.getAssetNames())
//			Gdx.app.debug(TAG, "asset: " + a);
//		
//		TextureAtlas atlas =
//				assetManager.get(Constants.TEXTURE_ATLAS_OBJECTS);
//		
//		// enable texture filtering for pixel smoothing
//		for (Texture t : atlas.getTextures())
//		t.setFilter(TextureFilter.Linear, TextureFilter.Linear);
//		// create game resource objects
	}
	
	@Override
	public void dispose () {
	assetManager.dispose();
	}
	
	@Override
	public void error(AssetDescriptor asset, Throwable throwable) {
		Gdx.app.error(TAG, "Couldn't load asset '"
				+ asset.fileName + "'", (Exception)throwable);
		
	}
}
