package org.vaadin.addon.audio.server;

import org.vaadin.addon.audio.shared.SharedEffect;

import java.util.UUID;

public abstract class Effect {

    private UUID id;

    public Effect() {
        id = UUID.randomUUID();
    }

    public String getID() {
        return id.toString();
    }

    public abstract SharedEffect getSharedEffectObject();

}
