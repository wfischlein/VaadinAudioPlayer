package org.vaadin.addon.audio.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import org.vaadin.addon.audio.server.AudioPlayer;
import org.vaadin.addon.audio.server.Stream;

/**
 * A Designer generated component for the player-controls template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("player-controls")
@HtmlImport("player-controls.html")
public class Controls extends PolymerTemplate<Controls.PlayerControlsModel> {

    private AudioPlayer player;
    @Id("playButton") private Button playButton;
    @Id("pauseButton") private Button pauseButton;
    @Id("stopButton") private Button stopButton;

    /**
     * Creates a new PlayerControls.
     */
    public Controls(AudioPlayer player, String streamName) {
        this.player = player;
        getElement().appendChild(player.getElement());

        playButton.addClickListener(e -> {
            if (player.isStopped()) {
                player.play();
            } else if (player.isPaused()) {
                player.resume();
            } else {
                //player.play(0);
                player.play();
            }
        });

        pauseButton.addClickListener(e -> {
            if (player.isPaused()) {
                player.resume();
            } else {
                player.pause();
            }
        });

        stopButton.addClickListener(e -> {
            player.stop();
        });
    }

    /**
     * This model binds properties between PlayerControls and player-controls
     */
    public interface PlayerControlsModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
