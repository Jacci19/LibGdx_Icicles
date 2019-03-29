package pl.jacci.exercise.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.viewport.FitViewport;

import pl.jacci.exercise.C;

public class TitleScreen implements Screen {

    public static final String TAG = TitleScreen.class.getName();
    ShapeRenderer renderer;
    FitViewport viewport;

    @Override
    public void show() {
        Gdx.app.log(TAG, "show");
        renderer = new ShapeRenderer();
        viewport = new FitViewport(C.WORLD_WIDTH, C.WORLD_HEIGHT);

    }

    @Override
    public void render(float delta) {

        refresh();

        renderer.begin(ShapeType.Filled);
        renderer.setColor(C.CIRCLE_COLOR);
        renderer.circle(C.EASY_CIRCLE_X, C.CIRCLE_Y, C.CIRCLE_RADIUS, C.CIRCLE_SEGMENTS);
        renderer.circle(C.MEDIUM_CIRCLE_X, C.CIRCLE_Y, C.CIRCLE_RADIUS, C.CIRCLE_SEGMENTS);
        renderer.circle(C.HARD_CIRCLE_X, C.CIRCLE_Y, C.CIRCLE_RADIUS, C.CIRCLE_SEGMENTS);
        renderer.end();

    }

    private void refresh() {
        viewport.apply(true);
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setProjectionMatrix(viewport.getCamera().combined);
        renderer.setAutoShapeType(true);

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
