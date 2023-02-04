package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Main;

public class Hud {
    public Stage stage;
    private Viewport viewport;

    private Integer score;

    Label scoreLabel;

    public Hud(SpriteBatch sb){

        score = 0;

        viewport = new FitViewport(Main.width, Main.height, new OrthographicCamera());
        stage = new Stage(viewport, sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        scoreLabel = new Label("Score " + score, new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel.setFontScale(5f);

        table.add(scoreLabel).expandX().padTop(10);

        stage.addActor(table);
    }
}
